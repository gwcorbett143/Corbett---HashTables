package Hashtables;

import java.util.ArrayList;
import java.util.List;

public class HashTables {

    public class Listing{
        private String key, value;

        public Listing(String key, String value) {
            this.key = key;
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        public String getKey() {
            return key;
        }

        public void setKey(String key) {
            this.key = key;
        }
    }

    List<Listing>[] table;
    int capacity;

    //initializes an array of size capacity
    public void HashTable(int capacity){
        this.capacity = capacity;
        table = new ArrayList[capacity];
        for(int i = 0; i < capacity; i++){
            table[i] = new ArrayList<>();
        }
    }



    //put hashes the key to an index in your array, and places the value there. Fails if there are collisions/repeat keys.
    public boolean put(String key, String value){
        for(Listing e : table[hashCode(key)]){
            if(e.getKey().equals(key)){
                return false;
            }
        }
        table[hashCode(key)].add(new Listing(key, value));
        return true;
    }

    //get hashes the key to get the index, and returns that element. Returns null if key not found.
    public String get(String key){

    }

    //returns the unique int in the range of the [0, array length)
    private int hashCode(String key){

    }

}
