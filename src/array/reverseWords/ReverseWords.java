package array.reverseWords;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseWords {
    public static void main(String[] args) {
//reverseWords(new char[]{'t','h','e',' ','s','k','y',' ','i','s',' ','b','l','u','e'});
        char[] s3 = new char[]{'t', 'h', 'e', ' ', 's', 'k', 'y', ' ', 'i', 's', ' ', 'b', 'l', 'u', 'e'};
      //  reverse(s3, 0, s3.length - 1);
       // reverse(s3, 0, 3);
        reverseWords(s3);
    }

    public static void reverseWords(char[] s) {
        reverse(s, 0, s.length - 1);
        int left = 0;
        int right = 0;
        for (int i = 0; i < s.length; i++) {
            if (s[i] == ' ') {
                right = i - 1;
                reverse(s, left, right);
                left = i + 1;
            }

        }
        reverse(s, left, s.length-1);
    }

    public static void reverse(char[] s, int left, int right) {
        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }

    }

}
