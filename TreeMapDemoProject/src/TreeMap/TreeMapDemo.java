package TreeMap;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapDemo {

    public static void main(String[] args) {

        // Sorted Map - sort on keys
        TreeMap<String, Integer> courses = new TreeMap<String, Integer>();
        courses.put("Core Java", 25);
        courses.put("Python", 30);
        courses.put("Hibernate", 6);
        courses.put("C++", 15);
        courses.put("Springboot", 15);
        courses.put("C++", 20);
        // courses.put(null,null);
        courses.put("HTML", null);

        System.out.println("Courses are : " + courses);

        // Adding user defined objects
        TreeMap<Student, String> students = new TreeMap<Student, String>();
        students.put(new Student(101, "Heer", 67), "TY");
        students.put(new Student(102, "Sita", 72), "FY");
        students.put(new Student(104, "Pihu", 71), "SY");
        students.put(new Student(103, "Anshi", 87), "BE");
        System.out.println(students);

        // Sort using Comparator object with Lambda Expression
        Comparator<Student> comp = (s2, s1) -> (int) (s1.getPer() - s2.getPer());

        TreeMap<Student, String> t = new TreeMap<>(comp);
        t.put(new Student(101, "Heer", 67), "TY");
        t.put(new Student(102, "Sita", 72), "FY");
        t.put(new Student(104, "Pihu", 71), "SY");
        t.put(new Student(103, "Anshi", 87), "BE");
        System.out.println(t);
    }
}
