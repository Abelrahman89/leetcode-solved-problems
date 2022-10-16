package testingstring;

import com.sun.source.tree.SynchronizedTree;

import java.util.concurrent.BlockingDeque;

public class Solution {
    public static void main(String[] args) {


//        String word = "hello";
//        System.out.println(isPalindrome(word));
//        word = "madam";
//        System.out.println(isPalindrome(word));
        String word = "hello";
        System.out.println(reverseString(word));
    }

    public static boolean isPalindrome(String word) {
        for (int i = 0; i < word.length() / 2; i++) {
            if (word.charAt(i) != word.charAt(word.length() - 1 - i))
                return false;
        }

        return true;
    }

    public static String reverseString(String word) {
        StringBuilder reversedWord = new StringBuilder();
        for (int i = word.length() - 1; i >= 0; i--)
            reversedWord.append(word.charAt(i));

        return reversedWord.toString();
    }
}
