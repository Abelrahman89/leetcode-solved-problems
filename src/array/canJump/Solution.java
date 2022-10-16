package array.canJump;

class Solution {
    public static void main(String[] args) {
        System.out.println(canJump(new int[]{3, 2, 1, 0, 4}));
    }

    public static boolean canJump(int[] nums) {

        int index = 0;
        for (int i = 0; i < nums.length &&i<=index; i++) {
            index = Math.max(index, nums[i] + i);
            if (index >= nums.length - 1)
                return true;
        }
        return false;
    }

  
}