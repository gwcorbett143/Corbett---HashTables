package Hashtables;

import java.util.ArrayList;
import java.util.List;

public class HashTables {

    private int size;
    ArrayList<String> table;
    int capacity;


    //initializes an array of size capacity
    public HashTables(int capacity) {
        this.capacity = capacity;
        table = new ArrayList<String>(capacity);
        for(int i = 0; i < capacity; i++){
            table.add("");
        }
        size = capacity;
    }

    public class Listing{
        private String key, value;

        public Listing(String key, String value) {
            this.key = key;
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        public String getKey() {
            return key;
        }
    }


    //returns the unique int in the range of the (0, array length)
    public int hash(String key){
        int mult = 1;
        int val = 0;
        for(int i = key.length()-1; i>=0; i--){
            mult*=31;
            mult %= size;
            val += mult*(int)key.charAt(i);
            val%=size;
        }
        return val;
    }

    //put hashes the key to an index in your array, and places the value there. Fails if there are collisions/repeat keys.
    public boolean put(String key, String value){
        int index = hash(key);
        if(!table.get(index).equals("")){
            System.out.println("not adding in");
            return false;
        }
        //System.out.println(index);
        table.add(index, value);
        return true;
    }

    //get hashes the key to get the index, and returns that element. Returns null if key not found.
    public String get(String key){
        int index = hash(key);
        System.out.println(index);
        if (table.get(index).equals("")){
            return null;
        }
        return table.get(index);
    }

    public String toString(){return table.toString();}
}
