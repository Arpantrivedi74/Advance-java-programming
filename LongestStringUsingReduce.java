import java.util.Arrays;
import java.util.List;

public class LongestStringUsingReduce {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Java", "Programming", "Stream", "API", "Functional");

        String longest = words.stream()
                              .reduce("", (a, b) -> a.length() > b.length() ? a : b);

        System.out.println("Longest string: " + longest);
    }
}