package array.find132pattern;

import java.util.Stack;

class Solution {
    public static void main(String[] args) {
        System.out.println(find132pattern(new int[]{1, 2, 10, 3, 4}));
    }

    public static boolean find132pattern(int[] nums) {
        if (nums.length < 3)
            return false;
        Stack<Integer> stack = new Stack<>();
        int[] min = new int[nums.length];
        min[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            min[i] = Math.min(min[i - 1], nums[i]);
        }
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] > min[i]) {
                while (!stack.isEmpty() && stack.peek() <= min[i])
                    stack.pop();
                if (!stack.isEmpty() && stack.peek() < nums[i])
                    return true;
                stack.push(nums[i]);
            }
        }
        return false;
    }

    public static boolean find132patternon2(int[] nums) {
        if (nums.length < 3) return false;
        int min = nums[0];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] > min && nums[i] > nums[j] && min < nums[j])
                    return true;
            }
            min = Math.min(min, nums[i]);
        }
        return false;
    }
}