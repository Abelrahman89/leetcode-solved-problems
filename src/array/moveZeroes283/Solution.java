package array.moveZeroes283;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        moveZeroes(new int[]{0, 1, 0, 3, 12});
    }

    public static void moveZeroes(int[] nums) {
        int index=0;
        for (int j = 0 ; j<nums.length; j++) {
            if (nums[j] != 0) {
                nums[index++]=nums[j];}

        }
        for (int j = index ; j<nums.length; j++)
            nums[j]=0;


    }
}
