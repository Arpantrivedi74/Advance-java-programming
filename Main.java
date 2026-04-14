import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(45, 11, 78, 2, 90, 34);

        List<Integer> sortedList = list.stream()
                .sorted(Comparator.reverseOrder()) // descending
                .toList();

        System.out.println("Descending Order: " + sortedList);
    }
}