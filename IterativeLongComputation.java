public class IterativeLongComputation {

    public static long getFibonacci(long n){
        long previous = 0;
        long result = 1;
        for (long i = 2; i <= n; i++) {
            long temp = result + previous;
            previous = result;
            result = temp;
        }
        return result;
    }

    public static long getFactorial(long n){
        long result = 1;
        for (long i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Maksymalna poprawna silnia n=20: " + getFactorial(20));
        System.out.println("Maksymalny poprawny wyraz ciągu Fibonacciego n=92: " + getFibonacci(92));

    }
}
