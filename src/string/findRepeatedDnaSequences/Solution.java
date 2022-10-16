package string.findRepeatedDnaSequences;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution {

    public static void main(String[] args) {
        System.out.println(findRepeatedDnaSequences("AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT"));
    }

    public static List<String> findRepeatedDnaSequences(String s) {
        List<String> result = new ArrayList<>();
         if(s.length()>10) {
            HashMap<String, Integer> map = new HashMap<>();
            for (int i = 0; i < s.length()-10; i++) {
                    String subString = s.substring(i, i + 10);
                    if (map.containsKey(subString)) {
                        if(!result.contains(subString))
                            result.add(subString);
                    } else
                        map.put(subString, 1);
            }
        }
        return result;
    }
}
