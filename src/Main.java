public class Main {

    public static void main(String[] args) {
        RecursiveBigDecimal ddd = new RecursiveBigDecimal();
        try {
            System.out.println(ddd.ciagFibonacciego(12));
            System.out.println(ddd.silnia(4));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}