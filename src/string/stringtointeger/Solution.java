package string.stringtointeger;

class Solution {
    public static void main(String[] args) {
        System.out.println(myAtoi("  -42"));
    }


    public static  int myAtoi(String s) {
        //log10n
        int MAX_VALUE = 2147483647;
        int MIN_VALUE = -2147483648;
        int sign = 1;
        int index = 0;
        double result = 0;
        s = s.replaceAll("^\\s+", "");
        if (s.length() == 0 || Character.isLetter(s.charAt(0)))
            return 0;


        if (s.charAt(0) == '-') {
            index++;
            sign = -1;
        }
        if (s.charAt(0) == '+')
            index++;

        while (index < s.length() && s.charAt(index) >= '0' && s.charAt(index) <= '9') {

            result = result * 10 + (s.charAt(index) - '0');

            if (result > MAX_VALUE) {
                if (sign > 0)
                    return MAX_VALUE;
                else
                    return MIN_VALUE;
            }
            index++;
        }

        return ((int) result) * sign;
    }
}