import java.math.BigDecimal;

public class RecursiveBigDecimal {
    public static BigDecimal getFibonacci(int index) throws Exception {
        if (index == 0)
            return new BigDecimal(0);
        else if (index == 1)
            return new BigDecimal(1);
        else if (index > 1) {
            return fibo(index, 1, BigDecimal.ONE, BigDecimal.ZERO);
        }
        else
            return new BigDecimal(-1);
    }

    private static BigDecimal fibo(int target_index, int current_index, BigDecimal prev, BigDecimal prevprev) throws Exception{
        if (current_index == target_index){
            return prev;
        }
        else {
            current_index++;
            BigDecimal result = prev.add(prevprev);

            return fibo(target_index, current_index, result, prev);
        }
    }

    public static BigDecimal getFactorial(int index) throws Exception {
        return silnia(index, 1, BigDecimal.ONE);
    }

    private static BigDecimal silnia(int target_index, int current_index, BigDecimal value) throws Exception{
        if (current_index == target_index){
            return value;
        }
        else {
            current_index++;
            BigDecimal result = value.multiply(new BigDecimal(current_index));

            return silnia(target_index, current_index, result);
        }
    }

    public static void main(String[] args) throws Exception {
        System.out.println("silnia: " + getFactorial(11000));
        System.out.println("fibo: " + getFibonacci(11500));
    }
}