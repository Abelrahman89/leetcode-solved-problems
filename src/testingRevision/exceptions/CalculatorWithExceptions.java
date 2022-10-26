package testingRevision.exceptions;

public class CalculatorWithExceptions {
    public static void main(String[] args) {
        System.out.println(division(50, 0));
        try {
            String x = null;
            System.out.println(x.charAt(0));
        } catch (NullPointerException e) {
            System.out.println("Null value");
        }
    }

    public static int division(int number1, int number2) {
        try {
            return number1 / number2;
        } catch (ArithmeticException e) {
            // throw e;
            System.out.println("division by Zero not allowed");
        } catch (NullPointerException e) {

            System.out.println("division by Zero not allowed");
        } catch (Exception e) {
            System.out.println("division by Zero not allowed");
        } finally {
            System.out.println("finally Block");
        }
        return 0;
    }
}
