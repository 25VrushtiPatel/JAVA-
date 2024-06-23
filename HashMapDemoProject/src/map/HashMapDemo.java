package map;
import java.util.*;
class HashMapDemo {
    public static void main(String args[]) {

        HashMap<String, Integer> bookMap = new HashMap<String, Integer>();
        bookMap.put("Let Us C", 320);
        bookMap.put("The Complete Reference C++ ", 450);
        bookMap.put("The Complete Reference Java 2", 465);
        bookMap.put("Python Programming", 599);
        bookMap.put("Application Development using Spring Boot", 600);
        System.out.println("Book Details are ");
        System.out.println(bookMap);

        System.out.println("Traversing a HashMap");
        Set<Map.Entry<String, Integer>> set = bookMap.entrySet(); // Get a set of the entries
        Iterator<Map.Entry<String, Integer>> i = set.iterator(); // Get an iterator
        while (i.hasNext()) { // Display elements
            Map.Entry<String, Integer> me = i.next();
            System.out.println(me.getKey() + ": " + me.getValue());
        }

        // Hash map with null keys and null values
        HashMap<String, String> hm1 = new HashMap<String, String>();
        hm1.put("Nitin", "nitin123@gmail.com");
        hm1.put("Deepak", null);
        hm1.put(null, "abc");
        hm1.put("Harish", null);
        hm1.put(null, null);
        hm1.put("Ravi", "ravi123@gmail.com");
        System.out.println("Person Hashmap with name and emailId");
        System.out.println(hm1);

        HashMap<Integer, Student> studentMap = new HashMap<Integer, Student>();
        studentMap.put(10001, new Student(1, "Amar", 78));
        studentMap.put(10005, new Student(2, "Saloni", 84));
        studentMap.put(10006, new Student(3, "Amit", 81));
        studentMap.put(10003, new Student(5, "Ankit", 72));
        studentMap.put(10004, new Student(4, "Ami", 78));
        System.out.println("Student Details are " + studentMap);
    }
}
