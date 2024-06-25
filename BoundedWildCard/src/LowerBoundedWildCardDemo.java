import java.util.Arrays;
import java.util.List;

public class LowerBoundedWildCardDemo {

    public static void main(String args[]) {
        // Creating a list of integers
        List<Integer> intList = Arrays.asList(1, 2, 3);
        System.out.println("Display Integer values");
        // Display List of Integers
        displayNumbers(intList);

        // Creating a list of numbers (integers and doubles)
        List<Number> numberList = Arrays.asList(1.0, 2.0, 3.0, 10, 4, 30);
        System.out.println("Display Number values");
        // Display List of Numbers
        displayNumbers(numberList);

        // Uncommenting the following block will cause a compile-time error
        // because List<Double> is not a supertype of Integer
        /*
        List<Double> doubleList = Arrays.asList(1.0, 2.0, 3.0);
        System.out.println("Display Double values");
        displayNumbers(doubleList);
        */
    }

    // Method to display numbers
    public static void displayNumbers(List<? super Integer> list) {
        for (Object element : list) {
            System.out.println(element);
        }
    }
}
