package Hashtables;

public class HashTablesDriver {
    public static void main(String[] args) {

        HashTables jip = new HashTables(20);

        jip.put("1", "grant");
        jip.put("2", "brad pitt");
        jip.put("3", "eric chandler");

        System.out.println(jip.get("1"));
        System.out.println(jip.get("2"));
        System.out.println(jip.get("4"));
    }
}
