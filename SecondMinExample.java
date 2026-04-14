import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SecondMinExample {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(12, 5, 20, 8, 30, 5, 8);

        Optional<Integer> secondMin = list.stream()
                                          .distinct()
                                          .sorted()
                                          .skip(1)
                                          .findFirst();

        secondMin.ifPresent(System.out::println);
    }
}