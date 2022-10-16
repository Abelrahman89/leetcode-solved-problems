package array.firstMissingPositive;

public class Solution {
    public static void main(String[] args) {

    }

    public int firstMissingPositive(int[] nums) {
        int length = nums.length;
        if (length == 0)
            return 1;
        int i = 0;
        while (i < nums.length) {
            if (nums[i] > length || nums[i] < 0)
                i++;
            else if (nums[nums[i] - 1] == nums[i])
                i++;
            else {
                int temp = nums[nums[i] - 1];
                nums[nums[i] - 1] = nums[i];
                nums[i] = temp;
            }
        }
        for (int j = 0; j < nums.length; j++) {
            if (nums[i] != i + 1)
                return i + 1;
        }
        return nums[length - 1] + 1;
    }
}