package twopointers.issubsequence;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public static void main(String[] args) {
        System.out.println(isSubsequence("b", "abc"));
    }

    public static boolean isSubsequence(String s, String t) {
        if ( s.length() == 0)
            return true;
        if (s.length() > t.length() )
            return false;
        int sPointer = 0, tPointer = 0;
        while (tPointer < t.length() && sPointer<s.length()) {
            if (s.charAt(sPointer) == t.charAt(tPointer)) {
                sPointer++;
                tPointer++;
            } else
                tPointer++;
        }

        if (sPointer == s.length())
            return true;
        else
            return false;

    }

    public static boolean isSubsequence2(String s, String t) {

        if (s.length() > t.length() || s.length() == 0)
            return false;
        Map<Character, Integer> map = new HashMap<>();
        char c = s.charAt(0);
        int index = t.indexOf(c);
        if (index == -1)
            return false;
        else
            map.put(c, index);


        for (int i = 1; i < s.length(); i++) {
            c = s.charAt(i);
            index = t.indexOf(c);
            if (index == -1 || map.get(s.charAt(i - 1)) > index)
                return false;
            else
                map.put(c, index);

        }
        return true;
    }
}