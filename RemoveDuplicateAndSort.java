import java.util.*;

public class RemoveDuplicateAndSort {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 5, 7, 5, 3, 8, 3);

        List<Integer> result = list.stream()
                .distinct()  // remove duplicates
                .sorted()    // sort ascending
                .toList();

        System.out.println("Result: " + result);
    }
}