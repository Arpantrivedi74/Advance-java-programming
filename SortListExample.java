import java.util.*;

public class SortListExample {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(27, 4, 19, 11, 35, 2);

        List<Integer> sortedList = list.stream()
                .sorted()   // ascending order
                .toList();  // store in new list

        System.out.println("Sorted List: " + sortedList);
    }
}