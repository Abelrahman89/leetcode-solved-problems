package string.longestPalindrome;
public class LongestPalindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome("abac"));
        System.out.println(longestPalindrome2("abb"));
    }

    int start = 0, end = 0;

    public String longestPalindrome(String s) {

        for (int i = 0; i < s.length(); i++) {
            expandAround(s, i, i);
            expandAround(s, i, i + 1);
        }
        return s.substring(start, end + 1);
    }

    private  void expandAround(String s, int left, int right) {
        while (left >= 0 && right < s.length() &&s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        left=left+1;
        right=right-1;
        if(end-start+1< right-left+1)
        {
            start=left;
            end=right;
        }
    }


    public static String longestPalindrome2(String s) {
        if (isPalindrome(s))
            return s;
        String longestPalindrome = "", substring = "";
        for (int i = 0; i < s.length(); i++) {
            substring += s.charAt(i);
            for (int j = i + 1; j < s.length(); j++) {

                if (isPalindrome(substring)) {
                    if (longestPalindrome.length() < substring.length()) {
                        longestPalindrome = substring;
                        //     break;
                    }

                }
                substring += s.charAt(j);
            }
            if (isPalindrome(substring)) {
                if (longestPalindrome.length() < substring.length()) {
                    longestPalindrome = substring;
                    //     break;
                }

            }
            substring = "";
        }
        return longestPalindrome;
    }

    public static boolean isPalindrome(String s) {
        if (s.length() == 1)
            return true;
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i))
                return false;
        }
        return true;
    }
}
