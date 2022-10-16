package array.containerWithmostWater;

class Solution {
    public int maxArea(int[] height) {
        int result = 0, left = 0, right = height.length - 1;
        while (left < right) {
            int containerLength =right-left;
            int area = containerLength * Math.min(height[left], height[right]);
            result=Math.max(result,area);
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return result;
    }
}

