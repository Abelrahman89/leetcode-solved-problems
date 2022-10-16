package array.numsubarrayproductlessthanK;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Solution {
    public static void main(String[] args) {
        System.out.println(numSubarrayProductLessThanK(new int[]{10, 5, 2, 6}, 100));
    }


    public static int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k <= 1) // nums = [1], k = 1
            return 0;
        int count = 0, product = 1, left = 0,right=0;
        for( right=0;right<nums.length;right++) {
            product *= nums[right];
            while (product >= k) {
                product /= nums[left++];
            }
            count +=right - left + 1;
        }
        return count;
    }

    public static int numSubarrayProductLessThanK2(int[] nums, int k) {
        int count = 0, product = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < k)
                count++;
            product = nums[i];
            for (int j = i + 1; j < nums.length && product < k; j++) {
                product *= nums[j];
                if (product < k)
                    count++;
                else
                    break;
            }
        }
        return count;
    }
}