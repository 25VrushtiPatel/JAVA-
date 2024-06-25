import java.util.ArrayList;

public class UpperBoundedWildCardDemo {

    public static void main(String[] args) {
        ArrayList<Integer> intList = new ArrayList<Integer>();
        intList.add(10);
        intList.add(20);
        // Passing Integer List 
        System.out.println("Sum = " + UpperBoundedWildCard.sumOfList(intList));

        ArrayList<Double> doubleList = new ArrayList<Double>();
        doubleList.add(10.0);
        doubleList.add(20.0);
        doubleList.add(30.0);
        // Passing Double List
        System.out.println("Sum = " + UpperBoundedWildCard.sumOfList(doubleList));

        /*
         * ArrayList<String> strList = new ArrayList<String>();
         * strList.add("Arun");
         * strList.add("Ajay");
         * strList.add("Ragul");
         * // Passing String List (uncommenting this will cause a compile-time error)
         * System.out.println("Sum = " + UpperBoundedWildCard.sumOfList(strList));
         */
    }
}
