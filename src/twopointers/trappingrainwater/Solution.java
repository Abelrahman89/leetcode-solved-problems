package twopointers.trappingrainwater;

class Solution {
    public int trap(int[] height) {
        int result = 0, left = 0, right = height.length - 1;
        while (left < right) {
            if (height[left] <= height[right]) {
               int current = left;
                while (height[++left] < height[current]) {
                    result += height[current] - height[left];
                }
            } else {
              int  current = right;
                while (height[--right] < height[current]) {
                    result += height[current] - height[right];
                }
            }
        }
        return result;
    }
}