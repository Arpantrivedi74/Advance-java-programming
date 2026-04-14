import java.util.Arrays;
import java.util.List;

public class LimitExample {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 15, 20, 25, 30, 35);

        list.stream()
            .limit(4)
            .forEach(System.out::println);
    }
}