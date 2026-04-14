import java.util.*;

public class EvenSort {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(14, 9, 20, 7, 6, 11, 32, 3);

        List<Integer> sortedEven = list.stream()
                .filter(n -> n % 2 == 0)   // keep even numbers
                .sorted()                 // ascending order
                .toList();

        System.out.println("Sorted Even Numbers: " + sortedEven);
    }
}