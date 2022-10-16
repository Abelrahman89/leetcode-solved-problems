package integer.palindrome;

public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println(isPalindrome(156727651));
    }
    /*public static boolean isPalindrome(int x) {
        if(x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        else{
            String t = String.valueOf(x);
            char[] c = t.toCharArray();
            for (int i = 0; i < c.length; i++) {
                if (c[i] != c[c.length - 1 - i])
                    return false;
            }
        }
        return true;
    }

     */
    public static boolean isPalindrome(int x) {
        if(x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        else{
            int revertedNumber = 0;
            while(x > revertedNumber) {
                revertedNumber = revertedNumber * 10 + x % 10;
                x /= 10;
            }

            return x == revertedNumber || x == revertedNumber/10;
            }


        }


}
