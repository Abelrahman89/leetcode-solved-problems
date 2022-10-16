package array.productExceptSelf;

class Solution {
    public static void main(String[] args) {

    }

    public static int[] productExceptSelf(int[] nums) {
        int[] prefix = new int[nums.length];
        int suffix = 1;
        int result[] = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (i == 0)
                prefix[i] = 1;
            else
                prefix[i] = prefix[i - 1] * nums[i - 1];
        }
        for (int i = nums.length - 1; i >= 0; i--) {
            if (i == nums.length - 1)
                suffix = 1;
            else {

                suffix *= nums[i - 1];
            }
            result[i] = suffix * prefix[i];
        }
        return result;
    }
}