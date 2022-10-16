package array.findDuplicates;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {
    public static void main(String[] args) {
        findDuplicates(new int[]{1,1});
    }
    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.length ; i++) {
            int n = Math.abs(nums[i]);
            if (nums[n - 1] <0)
                result.add(Math.abs(nums[i]));

                nums[n - 1] *= -1;
        }
        return result;
    }
}