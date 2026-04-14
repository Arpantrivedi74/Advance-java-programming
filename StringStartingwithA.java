import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringStartingwithA {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Amit", "ravi", "Anil", "vikas", "Ashok", "rahul");

        ArrayList<String> list = new ArrayList<String>();
        list.addAll(names);

        list.stream()
            .filter(name -> name.startsWith("A"))
            .forEach(System.out::println);
    }
}