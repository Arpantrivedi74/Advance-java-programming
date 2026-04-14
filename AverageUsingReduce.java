import java.util.Arrays;
import java.util.List;

public class AverageUsingReduce {
    public static void main(String[] args) {
        List<Double> numbers = Arrays.asList(10.0, 20.0, 30.0, 40.0, 50.0);

        double[] result = numbers.stream()
                                 .reduce(
                                     new double[]{0.0, 0.0},
                                     (a, b) -> new double[]{a[0] + b, a[1] + 1},
                                     (a, b) -> new double[]{a[0] + b[0], a[1] + b[1]}
                                 );

        double average = result[0] / result[1];

        System.out.println("Average: " + average);
    }
}