import java.util.*;

public class DescendingSort {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(17, 63, 29, 81, 4, 50);

        List<Integer> result = list.stream()
                .sorted(Comparator.reverseOrder()) // descending
                .toList();                         // store in new list

        System.out.println("Descending Order: " + result);
    }
}