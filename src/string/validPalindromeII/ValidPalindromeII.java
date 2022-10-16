package string.validPalindromeII;

public class ValidPalindromeII {
    public static void main(String[] args) {
        System.out.println(validPalindrome("tebbem"));
    }
public static boolean checkPalindrome(String x,int i,int j){
    while (i<j){
        if(x.charAt(i)!=x.charAt(j))
            return false;
        i++;
        j--;
    }
        return true;
}

    public static boolean validPalindrome(String s) {

        int right = s.length()-1;
        int left=0;
        while (left<right){
            if (s.charAt(left) != s.charAt(right) ) {
                return (checkPalindrome(s,left+1,right) || checkPalindrome(s,left,right-1) );

            }
            left++;
            right--;

        }
        return true;
    }
    public static boolean validPalindromeOld(String s) {
        char[] c = s.toCharArray();
        int countRight = 0;
        for (int i = 0; i < c.length/2; i++) {
            if (c[i] != c[c.length - 1 - i] && c[i+1] != c[c.length - 1 - i] && c[i] != c[c.length - 2 - i]) {
                countRight++;
            }
            if (countRight > 1 )
                return false;
        }

        if (countRight == 1 && c.length==3)
            return false;
        return true;
    }
}
