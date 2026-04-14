import java.util.Arrays;
import java.util.List;

public class SecondHighestUsingReduce {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(12, 45, 67, 23, 89, 34, 78);

        int max = numbers.stream()
                         .reduce(Integer.MIN_VALUE, (a, b) -> a > b ? a : b);

        int secondMax = numbers.stream()
                               .filter(n -> n != max)
                               .reduce(Integer.MIN_VALUE, (a, b) -> a > b ? a : b);

        System.out.println("Second highest number: " + secondMax);
    }
}