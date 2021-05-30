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

            if (fibonacci_a.equals(fibonacci_b)) {
                System.out.println(fibonacci_a);
            }
            else if (fibonacci_a.equals(fibonacci_c)) {
                System.out.println(fibonacci_a);
            }
            else if (fibonacci_b.equals(fibonacci_c)) {
                System.out.println(fibonacci_b);
            }
            else {
                System.out.println("none are matching");
            }

            if (factorial_a.equals(factorial_b)) {
                System.out.println(factorial_a);
            }
            else if (factorial_a.equals(factorial_c)) {
                System.out.println(factorial_a);
            }
            else if (factorial_b.equals(factorial_c)) {
                System.out.println(factorial_b);
            }
            else {
                System.out.println("none are matching");
            }


        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}