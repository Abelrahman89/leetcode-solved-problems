package string.reverseString;

import java.util.Arrays;
import java.util.Collections;

public class ReverseString {
    public static void main(String[] args) {
        reverseString(new char[]{'h','e','l','l','o'});
    }
    public static void reverseString(char[] s) {

        char temp;
        int left=0;
        int right=s.length-1;
     while (left<right){
             temp=s[left];
            s[left]=s[right];
            s[right]=temp;
            left++;
            right--;
        }
        System.out.println( Arrays.toString(s));
    }
}
