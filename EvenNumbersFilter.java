import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EvenNumbersFilter {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 15, 20, 25, 30, 11, 17, 16);

        ArrayList<Integer> list = new ArrayList<Integer>();
        list.addAll(numbers);

        list.stream().filter(n -> n % 2 == 0).forEach(System.out::println);
    }
}