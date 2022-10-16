package array.plusOne;

import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        plusOne(new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1, 0});
    }

    public static int[] plusOne(int[] digits) {
        int addedValue = 1;
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] + addedValue > 9) {
                digits[i] = 0;
            } else {
                digits[i] = digits[i] + addedValue;
                return digits;
            }
        }

        if (addedValue == 1) {
            int[] result = new int[digits.length + 1];
            result[0] = 1;
            return result;
        }
        return digits;
    }
}