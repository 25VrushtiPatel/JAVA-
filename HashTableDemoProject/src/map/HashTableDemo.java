package map;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashTableDemo {
    public static void main(String args[]) {

        // Hashtable with String keys and String values
        Hashtable<String, String> ht = new Hashtable<String, String>();
        ht.put("Nitin", "nitin123@gmail.com");
        ht.put("Deepak", "deepak123@gmail.comss");
        // ht.put(null, "abc");
        ht.put("Harish", "harish123@gmail.com");
        // ht.put(null, null);
        ht.put("Ravi", "ravi123@gmail.com");
        System.out.println("\nHashtable with name and emailId");
        System.out.println(ht);

        System.out.println("\nTraversing a Hashtable\n");
        Enumeration<String> em = ht.keys();
        while (em.hasMoreElements()) {
            String nm = em.nextElement();
            System.out.println(nm + " : " + ht.get(nm));
        }
    }
}
