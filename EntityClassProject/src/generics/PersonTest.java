package generics;

import java.util.Arrays;

public class PersonTest {
    
    public static void main(String[] args) {
        Person[] persons = {
            new Person("Nitin", "Pune"),
            new Person("Manoj", "Mumbai"),
            new Person("Mayur", "Delhi"),
            new Person("Ajay", "Chennai")
        };
        
        // Displaying the array before sorting
        System.out.println("Before sorting:");
        for (Person person : persons) {
            System.out.println(person);
        }
        
        // Sorting the array based on the city name
        Arrays.sort(persons);
        
        // Displaying the array after sorting
        System.out.println("\nAfter sorting:");
        for (Person person : persons) {
            System.out.println(person);
        }
    }
}
