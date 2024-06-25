package API;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamBasics {

    public static void main(String[] args) {

        // Creating a stream from set of values
        Stream<Integer> stream = Stream.of(10, 20, 30, 40, 50, 60, 70);

        // Counting the number of elements
        System.out.println("No. of elements : " + stream.count());

        Integer[] values = new Integer[]{10, 20, 30, 13, 10, 11, 12, 13};
        // Creating a stream from Array
        stream = Arrays.stream(values);

        // Map operation
        System.out.println("Squares of " + Arrays.toString(values) + " is as follows:");
        Arrays.stream(values).map(num -> num * num).forEach(System.out::println);

        // Limit operation
        System.out.println("First 2 elements are:");
        Arrays.stream(values).limit(2).forEach(System.out::println);

        // Skip operation
        System.out.println("Elements except first 4:");
        Arrays.stream(values).skip(4).forEach(System.out::println);

        // Distinct operation
        System.out.println("Distinct Elements are:");
        Arrays.stream(values).distinct().forEach(System.out::println);

        List<String> words = Arrays.asList("Hello", "Stream", "Learning");

        // Creating a stream from a List
        Stream<String> stream1 = words.stream();

        // Map operation to uppercase
        System.out.println("Strings in uppercase:");
        List<String> s1 = stream1.map(str -> str.toUpperCase()).collect(Collectors.toList());
        System.out.println(s1);

        // Re-create the stream to avoid IllegalStateException
        stream1 = words.stream();
        // Map operation to lowercase
        System.out.println("Strings in lowercase:");
        stream1.map(str -> str.toLowerCase()).forEach(System.out::println);
        System.out.println(words);
    }
}
