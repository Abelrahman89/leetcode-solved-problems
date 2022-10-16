package string.lengthOfLongestSubstring;

import java.util.HashMap;

public class LengthOfLongestSubstring {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("dvdf"));
    }

    public static int lengthOfLongestSubstring(String s) {
        int ans = 0, left = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);
            if (!map.containsKey(ch)) {

            } else {

                left = Math.max(left, map.get(ch) + 1);

            }
            map.put(ch, right);
            ans = Math.max(ans, right - left + 1);
        }

        return ans;
    }

    public static int lengthOfLongestSubstring2(String s) {
        if (s.length() == 0)
            return 0;
        String subString = "";
        int maxLength = 0;
        for (int i = 0; i < s.length(); i++) {
            subString = "" + s.charAt(i);
            for (int j = i + 1; j < s.length(); j++) {
                if (subString.indexOf(s.charAt(j)) == -1) {
                    subString += s.charAt(j);
                } else
                    break;

            }
            if (subString.length() > maxLength)
                maxLength = subString.length();
        }
        return Math.max(maxLength, subString.length());
    }
}
