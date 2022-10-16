package common;

import java.util.ArrayList;
import java.util.List;

public class Anadrome {

    /*
    Given a string word, count the minimum number of characters that needs to be added to word
     to make it anadrome - a string which is an anagram of some palindrome.

    case 0: if all of characters have even count, return 0;
case 1: if only one character has odd count, return 0; //place it in the middle of the string
case 2: if there are more odd counts, we can make it to even count just by add 1. Therefore, when we see the odd count, we increment the "result". However, we can subtract one just for case 1
Time: O(N). N represents the length of the string word
Space: O(26)
     */
    public static int count(String word){
        int[] cnt = new int[26];
        for(char c: word.toCharArray()){
            cnt[c-'a']++;
        }
        int ans = 0;
        for(int i = 0; i < 26; i++){
            if(cnt[i]%2 != 0){
                ans++;
            }
        }
        if(ans == 1 || ans == 0){
            return 0;
        }
        return ans - 1;
    }
    public static void main(String[] args){
        String[] words = {"tattoo", "abcb", "abab", "abc"};
        for(int i = 0; i < words.length; i++){
            System.out.println(count(words[i]));
        }
        List<String> s=new ArrayList<>();


    }
}
