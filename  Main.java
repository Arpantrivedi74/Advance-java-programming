import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(12, 5, 33, 9, 21, 1);

        List<Integer> sortedList = list.stream()
                .sorted()   // default = ascending order
                .toList();

        System.out.println("Sorted List: " + sortedList);
    }
}