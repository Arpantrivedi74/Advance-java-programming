import java.util.Arrays;
import java.util.List;

public class RemoveNullValues {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("java", null, "Spring", null, "React");

        System.out.println("Original List: " + list);

        System.out.println("After removing null values:");

        list.stream().filter(s -> s != null).forEach(System.out::println);
    }
}