import java.util.stream.IntStream;

public class FactorialUsingReduce {
    public static void main(String[] args) {
        int n = 5;

        int factorial = IntStream.rangeClosed(1, n)
                                 .reduce(1, (a, b) -> a * b);

        System.out.println("Factorial of " + n + " is: " + factorial);
    }
}