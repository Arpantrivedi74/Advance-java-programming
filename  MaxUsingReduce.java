import java.util.Arrays;
import java.util.List;

public class MaxUsingReduce {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(12, 45, 7, 89, 23, 56);

        int max = numbers.stream()
                         .reduce(Integer.MIN_VALUE, (a, b) -> a > b ? a : b);

        System.out.println("Maximum element: " + max);
    }
}