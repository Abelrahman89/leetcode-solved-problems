package integer.factorialtrailinzeroes;

class Solution {
    public static void main(String[] args) {
        System.out.println(trailingZeroes(6));

    }

    public static int factorial(int n) {
        int f = n;
        int cnt = 0;
        if (n == 1 || n == 0)
            return f;
        if (f % 5 == 0)
            cnt++;
        while (n > 1) {
            return (f * factorial(n - 1));
        }
        return f;
    }

    public static int factorial2(int n) {
        int f = n;
        if (n == 1 || n == 0)
            return f;
        while (n > 1) {
            return (f * factorial(n - 1));
        }
        return f;
    }

    public static int countZero(int n) {
        int reverse = 0;
        int cnt = 0;
        while (n > 1) {
            if (n % 10 == 0)
                cnt++;
            reverse = reverse * 10 + n % 10;
            n = n / 10;
        }
        return cnt;
    }

    public static int trailingZeroes(int n) {

//        System.out.println(factorial(n));
//        System.out.println(countZero(factorial(n)));
//        return countZero(factorial(n));
        if (n == 0)
            return 0;
        int cnt = 0;

        for (int i = 5; i <= n; i = i * 5) {
            cnt += n / i;

        }

        return cnt;
    }

}