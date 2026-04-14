import java.util.*;

public class ReverseSortNames {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("suresh", "amit", "neha", "vikas", "priya");

        List<String> result = names.stream()
                .sorted(Comparator.reverseOrder()) // reverse alphabetical
                .toList();

        System.out.println("Reverse Sorted Names: " + result);
    }
}