package string;

public class StringBufferDemo {

    public static void main(String[] args) {

        // Thread Safe
        // String buffer is mutable

        StringBuffer obj = new StringBuffer("Hello");
        obj = obj.append(" World");

        // obj = obj.reverse(); // Uncomment to reverse the string

        StringBuffer obj1 = new StringBuffer("Hello");
        int val = obj.toString().compareTo(obj1.toString()); // compares two objects
        System.out.println(val); // prints value in integer

        System.out.println("Length: " + obj.length());
        System.out.println("Character at index 2: " + obj.charAt(2));
        System.out.println(obj);
    }
}
