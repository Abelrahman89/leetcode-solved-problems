package array.sortColors;

class Solution {
    public static void main(String[] args) {
        sortColors(new int[]{2, 0, 2, 1, 1, 0});
    }

    public static void sortColors(int[] nums) {
        int countRed = 0, countWhite = 0, countBlue = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0)
                countRed++;
            else if (nums[i] == 1)
                countWhite++;
            else if (nums[i] == 2)
                countBlue++;
        }
        for (int i = 0; i < nums.length; i++) {
            if (countRed > 0) {
                nums[i] = 0;
                countRed--;
            } else if (countWhite > 0) {
                nums[i] = 1;
                countWhite--;
            } else if (countBlue > 0) {
                nums[i] = 2;
                countBlue--;
            }
        }
    }
}