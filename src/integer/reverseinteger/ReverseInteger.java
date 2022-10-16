package integer.reverseinteger;

public class ReverseInteger {
    public static void main(String[] args) {
        System.out.println(reverse(1534236469));
    }

    public static int reverse(int x) {
        int result = 0;
        int negative = 1;
        if (x < 0) {
            x = x * -1;
            negative = -1;
        }
        while (x > 0) {
            int divRemaining = x % 10;
            if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && divRemaining > 7)) return 0;
            if (result < Integer.MIN_VALUE / 10 || (result == Integer.MIN_VALUE / 10 && divRemaining < -8)) return 0;
            result = result * 10 + divRemaining;
            x = x / 10;
        }
        return result * negative;
    }
}
