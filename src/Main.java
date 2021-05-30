import java.math.BigDecimal;
import java.math.BigInteger;

public class Main {

    public static void main(String[] args) {

        int fibo = 1000;
        int silnia = 100;

        try {
            BigDecimal fibonacci_a = RecursiveBigDecimal.getFibonacci(fibo);
            BigInteger fibonacci_b = IterativeBigIntegerComputation.getFibonacci(fibo);
            long fibonacci_c = IterativeLongComputation.getFibonacci(fibo);

            BigDecimal factorial_a = RecursiveBigDecimal.getFactorial(silnia);
            BigInteger factorial_b = IterativeBigIntegerComputation.getFactorial(silnia);
            long factorial_c = IterativeLongComputation.getFactorial(silnia);

            voting("fibobacci(" + fibo + ") = ", fibonacci_a, fibonacci_b, fibonacci_c);
            voting("factorial(" + silnia + ") = ", factorial_a, factorial_b, factorial_c);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void voting(String message, BigDecimal fibonacci_a, BigInteger fibonacci_b, long fibonacci_c) {
        if (fibonacci_a.compareTo(new BigDecimal(fibonacci_b)) == 0) {
            System.out.println(message + fibonacci_a);
        }
        else if (fibonacci_a.compareTo(new BigDecimal(fibonacci_c)) == 0) {
            System.out.println(message + fibonacci_a);
        }
        else if (new BigDecimal(fibonacci_b).compareTo(new BigDecimal(fibonacci_c)) == 0) {
            System.out.println(message + fibonacci_b);
        } else {
            System.out.println(message + "[error]");
        }
    }
}