package testingRevision.testingAmazon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Solution {
    public static List<List<String>> groupAnagrams2(String[] strs) {
        //TC = NK, SC = NK
        List<List<String>> res = new ArrayList<>();
        if (strs.length == 0) return res;
        HashMap<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            char[] hash = new char[26];
            for (char c : s.toCharArray()) {
                hash[c - 'a']++;
            }
            String key = new String(hash);
            map.computeIfAbsent(key, k -> new ArrayList<>());
            map.get(key).add(s);
        }
        res.addAll(map.values());
        return res;
    }
    /*
    Given an array of strings strs, group the anagrams together. You can return the answer
    in any order. An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
    typically using all the original letters exactly once.

Example 1:
Input: strs = ["eat","tea","tan","ate","nat","bat"]
Output: [["bat"],["nat","tan"],["ate","eat","tea"]]

Example 2:
Input: strs = [""]
Output: [[""]]

Example 3:
Input: strs = ["a"]
Output: [["a"]]


Your Task: Complete the function groupAnagrams() which takes an array of strings as input and
returns a List<List<String>> containing the anagrams.

has context menu
     */

    public static List<List<String>> groupAnagrams(String[] words) {
        //TC = NKLogK, SC = NK
        if (words == null || words.length == 0)
            return null;
        HashMap<String, ArrayList<String>> wordsMap = new HashMap<String, ArrayList<String>>();
        for (int i = 0; i < words.length; i++) {
            char[] wordToArray = words[i].toCharArray();
            Arrays.sort(wordToArray);
            String wordAfterSorted = String.valueOf(wordToArray);
            if (wordsMap.containsKey(wordAfterSorted))
                wordsMap.put(wordAfterSorted, new ArrayList<>());
            wordsMap.get(wordAfterSorted).add(words[i]);
//            if (wordsMap.containsKey(wordAfterSorted))
//                wordsMap.get(wordAfterSorted).add(words[i]);
//            else {
//                ArrayList<String> wordToBeAdded = new ArrayList<>();
//                wordToBeAdded.add(words[i]);
//                wordsMap.put(wordAfterSorted, wordToBeAdded);
//            }
        }
        return new ArrayList<>(wordsMap.values());
    }

    public static void main(String[] args) {
        String[] values = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(groupAnagrams2(values));
        System.out.println(groupAnagrams(null));
    }

}
