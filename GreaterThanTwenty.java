import java.util.*;

public class GreaterThanTwenty {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(8, 26, 13, 41, 19, 32, 5);

        List<Integer> result = list.stream()
                .filter(n -> n > 20) // condition
                .toList();

        System.out.println("Numbers > 20: " + result);
    }
}