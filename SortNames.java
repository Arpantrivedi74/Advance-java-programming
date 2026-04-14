import java.util.*;

public class SortNames {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("ravi", "ankit", "zoya", "meena", "kunal");

        List<String> sortedNames = names.stream()
                .sorted()   // alphabetical order
                .toList();

        System.out.println("Sorted Names: " + sortedNames);
    }
}