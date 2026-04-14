import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FilterStringsLength {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("java", "python", "c", "react", "c#", "nextjs", "node.js");

        ArrayList<String> list = new ArrayList<String>();
        list.addAll(names);

        list.stream().filter(s -> s.length() > 4).forEach(System.out::println);
    }
}