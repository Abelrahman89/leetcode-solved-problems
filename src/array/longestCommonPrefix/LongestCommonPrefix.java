package array.longestCommonPrefix;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"carghgh","car","cargh"}));
        String str1="car",str2="carghgh";

//        System.out.println(str1.indexOf(str2));
//        System.out.println(str2.substring(0,str2.length()-1));
    }
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        String prefix=strs[0];
        for (int i =1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix)!=0)
            {
                prefix=prefix.substring(0,prefix.length()-1);
                if(prefix.length()==0)
                    return "";
            }
        }
        return prefix;
    }
    public static String longestCommonPrefix3(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        for (int i = 0; i < strs[0].length(); i++) {
            char c = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (i == strs[j].length() || strs[j].charAt(i) != c)
                    return strs[0].substring(0, i);
            }
        }
        return strs[0];
    }

    public static String longestCommonPrefix2(String[] strs) {
        if (strs.length == 1)
            return strs[0];


        Map<Character, Integer> map = new HashMap<>();
        int smallestSizeIndex = 0;
        int smallestSize = 999999999;
        for (int i = 0; i < strs.length; i++) {
            if (strs[i].length() < smallestSize) {
                smallestSizeIndex = i;
                smallestSize = strs[i].length();
            }
        }
        String[] result = new String[smallestSize];
        for (int i = 0; i < smallestSize; i++) {
            result[i] = "";
        }

        for (int i = 0; i < strs[smallestSizeIndex].length(); i++) {
            map.put(strs[smallestSizeIndex].charAt(i), i);
        }
        int index = 0;
        for (int i = 0; i < strs.length; i++) {
            if (i != smallestSizeIndex) {
                index = 0;
                for (int j = 0; j < strs[i].length(); j++) {
                    Character c = strs[i].charAt(j);
                    if (map.containsKey(c) && map.get(c) == j) {
                        if (!result[index].equals("") && map.get(result[index].charAt(result[index].length() - 1)) == j - 1)
                            result[index] += c;
                        else {
                            if (result[index].length() > 0)
                                index++;
                            result[index] = "" + c;
                        }
                    }
                }
            }
        }
        smallestSizeIndex = 0;
        smallestSize = 999999999;
        for (int i = 0; i < result.length; i++) {
            if (result[i].length() > smallestSize) {
                smallestSizeIndex = i;
                smallestSize = result[i].length();
            }
        }
        return result[smallestSizeIndex];

    }

}
