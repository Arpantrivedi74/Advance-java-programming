import java.util.*;

public class SecondHighestNumber {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(55, 12, 88, 34, 99, 21);

        int secondHighest = list.stream()
                .distinct()                         // remove duplicates (safe)
                .sorted(Comparator.reverseOrder())  // descending order
                .skip(1)                            // skip highest
                .findFirst()                        // get second highest
                .get();                             // extract value

        System.out.println("Second Highest: " + secondHighest);
    }
}