package array.sequentialDigits;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public static void main(String[] args) {
sequentialDigits(100,1000);
    }

    public static List<Integer> sequentialDigits(int low, int high) {
        List<Integer> result = new ArrayList<>();
        String digits = "123456789";
        for (int i = 2; i <= 9; i++) {
            for (int j = 0; j <= digits.length() - i; j++) {
                String subStr = digits.substring(j, i + j);
                int value = Integer.parseInt(subStr);
                if ((value >= low && value <= high))
                    result.add(value);
            }

        }
        return result;
    }
}