package array.canJump;

class Solution2 {
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

    public static boolean canJump2(int[] nums) {
        int i = 0;
        int count = 0;
        if (nums.length > 1) {
            while (i < nums.length) {
                if (nums[i] == 0 && i < nums.length)
                    return false;

                i += nums[i];
            }
        }
        return true;
    }
}