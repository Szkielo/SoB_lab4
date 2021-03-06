import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigInteger;

public class IterativeBigIntegerComputation {
    public static BigInteger getFibonacci(long n) {
        BigInteger previous = BigInteger.valueOf(0);
        BigInteger result = BigInteger.valueOf(1);
        for (long i = 2; i <= n; i++) {
            BigInteger temp = result.add(previous);
            previous = result;
            result = temp;
        }
        return result;
    }

    public static BigInteger getFactorial(long n) {
        BigInteger result = BigInteger.valueOf(1);
        for (long i = 2; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }

    public static void main(String[] args) {
//        System.out.println("Maksymalna poprawna silnia n=1000000: " + getFactorial(1000000));
//        System.out.println("Maksymalny poprawny wyraz ciągu Fibonacciego n=1000000: " + getFibonacci(1000000));
        BufferedWriter writer;
        try {
            writer = new BufferedWriter(new FileWriter("out.txt"));
            writer.write(getFactorial(1000000).toString());
            writer.write("\n");
            writer.write(getFibonacci(1000000).toString());

            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}