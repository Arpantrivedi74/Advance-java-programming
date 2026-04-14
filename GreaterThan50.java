import java.util.Arrays;
import java.util.List;

public class GreaterThan50 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 60, 45, 90, 30, 24, 50, 76);

        numbers.stream()
               .filter(n -> n >= 50)
               .forEach(System.out::println);
    }
}