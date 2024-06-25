import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class ReduceDemo {

    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 12, -3, 4, 15, -6, 7, 8);

        // Filtered Stream of Positive numbers
        Stream<Integer> stream = intList.stream().filter(a -> a > 0);
        stream.forEach(System.out::println);

        // Reduce to return maximum number
        stream = intList.stream().filter(a -> a > 0);
        Optional<Integer> result = stream.reduce((a, b) -> a > b ? a : b);
        if (result.isPresent()) {
            System.out.println("Maximum element is : " + result.get());
        } else {
            System.out.println("Stream is empty for given operation");
        }

        // Reduce to sum of all positive numbers
        stream = intList.stream().filter(a -> a > 0);
        result = stream.reduce(Integer::sum);
        if (result.isPresent()) {
            System.out.println("Sum of all positive elements is : " + result.get());
        } else {
            System.out.println("Stream is empty for given operation");
        }

        // Filtered Stream of even numbers
        stream = intList.stream().filter(a -> a % 2 == 0);
        result = stream.reduce(Integer::sum);
        if (result.isPresent()) {
            System.out.println("Sum of all even elements is : " + result.get());
        } else {
            System.out.println("Stream is empty for given operation");
        }
    }
}
