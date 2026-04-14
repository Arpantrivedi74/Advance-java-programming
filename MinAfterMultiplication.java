import java.util.*;

public class MinAfterMultiplication {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5, 8, 12, 3, 9);

        int min = Integer.MAX_VALUE;

        for (int num : list) {
            int multiplied = num * 3;
            if (multiplied < min) {
                min = multiplied;
            }
        }

        System.out.println("Minimum value after multiplying by 3: " + min);
    }
}