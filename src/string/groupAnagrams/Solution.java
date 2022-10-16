package string.groupAnagrams;

import java.util.*;

class Solution {
    public static void main(String[] args) {
        //  System.out.println());
        groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"});
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        if (strs.length == 0)
            return new ArrayList<>();
        Map<String, List<String>> result = new HashMap<>();

        for (String s : strs) {
            char c[] = s.toCharArray();
            Arrays.sort(c);
            String word = String.valueOf(c);
            if (!result.containsKey(word))
                result.put(word, new ArrayList<>());

            result.get(word).add(s);

        }
        return new ArrayList(result.values());

    }

}