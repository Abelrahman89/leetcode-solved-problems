package common;

public class sumwithoutusingplus {
    public static void main(String[] args) {
        System.out.println(sum(5,5));
    }
    // Returns sum of a and b using bitwise  operators.
    public static int sum(int a, int b)
    {
        int s = a ^ b;
        int carry = a & b;

        if (carry == 0) return s;
        else return sum(s, carry << 1);

    }
}
