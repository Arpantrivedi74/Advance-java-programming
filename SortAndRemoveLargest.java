import java.util.*;

public class SortAndRemoveLargest {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(10, 50, 30, 20, 60, 40, 70));

        Collections.sort(list);

        list.remove(list.size() - 1);
        list.remove(list.size() - 1);

        System.out.println(list);
    }
}