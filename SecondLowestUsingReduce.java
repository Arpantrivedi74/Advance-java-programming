import java.util.Arrays;
import java.util.List;

public class SecondLowestUsingReduce {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(12, 45, 67, 23, 89, 34, 78);

        int min = numbers.stream()
                         .reduce(Integer.MAX_VALUE, (a, b) -> a < b ? a : b);

        int secondMin = numbers.stream()
                               .filter(n -> n != min)
                               .reduce(Integer.MAX_VALUE, (a, b) -> a < b ? a : b);

        System.out.println("Second lowest number: " + secondMin);
    }
}