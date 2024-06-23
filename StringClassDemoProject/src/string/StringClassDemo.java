package string;

public class StringClassDemo {

    public static void main(String[] args) {

        // Is string mutable or Immutable? - Immutable

        String str = new String("Hello");
        System.out.println(str); // prints "Hello"

        str = "World";
        System.out.println(str); // prints "World"
    }
}
