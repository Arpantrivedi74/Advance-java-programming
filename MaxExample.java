import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MaxExample {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 20, 5, 40, 15);

        Optional<Integer> max = list.stream()
                                    .max(Integer::compareTo);

        max.ifPresent(System.out::println);
    }
}