import java.util.Arrays;
import java.util.List;

public class CountUsingReduce {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50, 60, 70);

        int count = numbers.stream()
                           .reduce(0, (c, e) -> c + 1, Integer::sum);

        System.out.println("Total elements: " + count);
    }
}