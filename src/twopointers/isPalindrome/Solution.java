package twopointers.isPalindrome;

import java.nio.charset.StandardCharsets;
import java.util.Locale;

class Solution {
    public static void main(String[] args) {
        // String s = "race a car";
        String s = "v' 5:UxU:5 v'";//"8V8K;G;K;V;";//"A man, a plan, a canal: Panama";
        // String  b="v' 5:UxU:5 v'";
        //  s.trim().split("\\s+|,|:");

        // System.out.println(s.toLowerCase().trim());

        // System.out.println(Character.isV(c));
        System.out.println(isPalindrome(s));
    }

    public static boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right && left < s.length()) {
            char leftChar = s.charAt(left), rightChar = s.charAt(right);
            if (!Character.isLetterOrDigit(leftChar))
                left++;
            else if (!Character.isLetterOrDigit(rightChar))
                right--;
            else {
                if (Character.toLowerCase(leftChar) != Character.toLowerCase(rightChar))
                    return false;
                else {
                    right--;
                    left++;
                }
            }
        }
        return true;
    }
}