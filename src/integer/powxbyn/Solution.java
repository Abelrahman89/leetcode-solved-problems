package integer.powxbyn;

public class Solution {
    public static void main(String[] args) {
        System.out.println(myPow(2.0, -2147483648));
        //System.out.println(Math.pow(2, 0));
    }

    public static double myPow(double x, int n) {

        double result = 1.0;
        boolean negative = false;
        long num=n;
        if (n < 0) {
            num =   -1 * num;
            negative = true;
        }

        while (num >= 1) {
            if (num % 2 == 0) {
                x = x * x;
                num /= 2;
            } else {
                result = result * x;
                num -= 1;

            }

        }
        if (negative == true)
            result = 1 / result;
        return result;
    }

    public static double myPow2(double x, int n) {
        if (n == 0)
            return 1.0;
        double result = x;
        boolean negative = false;
        if (n < 0) {
            n = n * -1;
            negative = true;
        }

        while (n > 1) {
            result = result * x;
            n -= 1;
        }
        if (negative == true)
            result = 1 / result;
        return result;
    }

}
