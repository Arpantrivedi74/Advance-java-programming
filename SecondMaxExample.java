import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Comparator;

public class SecondMaxExample {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(12, 5, 20, 8, 30, 5, 8);

        Optional<Integer> secondMax = list.stream()
                                          .distinct()
                                          .sorted(Comparator.reverseOrder())
                                          .skip(1)
                                          .findFirst();

        secondMax.ifPresent(System.out::println);
    }
}