package string.integertoenglishwords;

import java.util.HashMap;
import java.util.Map;

class Solution {
    private static final String[] LESS_THAN_20 = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven",
            "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
    private static final String[] TENS = {"", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
    private static final String[] THOUSANDS = {"", "Thousand", "Million", "Billion"};

    public static String numberToWords(int num) {
        if (num == 0)
            return "Zero";
        int i = 0;
        String words = "";
        while (num > 0) {
            if (num % 1000 != 0)
                words = helper(num % 1000) + THOUSANDS[i] +" " + words;
            num /= 1000;
            i++;
        }
        return words.trim();
    }
    private static String helper(int num) {
        if (num == 0)
            return "";
        else if (num < 20)
            return LESS_THAN_20[num] + " ";

        else if (num < 100)
            return TENS[num / 10] + " " + helper(num % 10);
        else
            return LESS_THAN_20[num / 100] + " Hundred " + helper(num % 100);
    }
    public static void main(String[] args) {
        String str = "12345";
        System.out.println(str.length());
        // System.out.println(numberToWords(123) );
        System.out.println(numberToWords(1234567) );

    }

    public static String numberToWordsold(int num) {
        Map<Integer, String> map = new HashMap<>();

        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        map.put(4, "four");
        map.put(5, "five");
        map.put(6, "six");
        map.put(7, "seven");
        map.put(8, "eight");
        map.put(9, "nine");
        map.put(10, "ten");
        map.put(11, "eleven");
        map.put(12, "twelve");
        map.put(13, "thirteen");
        map.put(14, "fourteen");
        map.put(15, "fifteen");
        map.put(16, "sixteen");
        map.put(17, "seventeen");
        map.put(18, "eighteen");
        map.put(19, "nineteen");
        map.put(20, "twenty");
        map.put(30, "forty");
        map.put(40, "fifty");
        map.put(50, "fifty");
        map.put(60, "sixty");
        map.put(70, "seventy");
        map.put(80, "eighty");
        map.put(90, "ninety");
        map.put(100, "hundred");
        map.put(1000, "Thousand ");
        map.put(1000000, "Million ");
        map.put(1000000000, "Billion");

        String str = String.valueOf(num);
        for (int i = 0; i < str.length(); i++) {
            int j = Character.getNumericValue(str.charAt(str.length() - 1 - i));
            String s = "" + str.charAt(str.length() - 1 - i);
            if (i == 1)
                j += 10;
            else if (i == 2) {
                j += 10;
            } else if (i == 3) {


                if (i == 1)
                    j += 10;
                else if (i == 2) {
                    j += 10;
                }
                System.out.println(map.get(j));

            }

        }
        return "";
    }
}