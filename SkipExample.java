import java.util.Arrays;
import java.util.List;

public class SkipExample {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5, 10, 15, 20, 25, 30, 35);

        list.stream()
            .skip(3)
            .forEach(System.out::println);
    }
}