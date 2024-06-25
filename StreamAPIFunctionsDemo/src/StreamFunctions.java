import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamFunctions {

    public static long countEmptyStrings(Stream<String> stream) {
        return stream.filter(String::isEmpty).count();
    }

    public static long countStrings(Stream<String> stream, int length) {
        return stream.filter(str -> str.length() > length).count();
    }

    public static List<String> nonEmptyStringList(Stream<String> stream) {
        return stream.filter(str -> !str.isEmpty()).collect(Collectors.toList());
    }

    public static List<String> getStrings(Stream<String> stream, int length) {
        return stream.filter(str -> str.length() > length).collect(Collectors.toList());
    }

    public static List<Integer> getSquareList(Stream<Integer> stream) {
        return stream.map(num -> num * num).distinct().collect(Collectors.toList());
    }

    public static void showStatistics(Stream<Integer> stream) {
        IntSummaryStatistics stats = stream.mapToInt(Integer::intValue).summaryStatistics();
        System.out.println("Count: " + stats.getCount());
        System.out.println("Min: " + stats.getMin());
        System.out.println("Max: " + stats.getMax());
        System.out.println("Sum: " + stats.getSum());
        System.out.println("Average: " + stats.getAverage());
    }
}
