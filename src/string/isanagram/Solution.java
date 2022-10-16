package string.isanagram;

import java.util.Arrays;

class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.equals(t))
            return true;
        if (s.length() != t.length())
            return false;
        char[] sToCharArray = s.toCharArray();
        char[] tToCharArray = t.toCharArray();
        Arrays.sort(sToCharArray);
        Arrays.sort(tToCharArray);
        return Arrays.equals(sToCharArray, tToCharArray);
    }
}