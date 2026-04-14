import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MinExample {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 20, 5, 40, 15);

        Optional<Integer> min = list.stream()
                                    .min(Integer::compareTo);

        min.ifPresent(System.out::println);
    }
}