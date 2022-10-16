package binarysearch.findminimuminrotatedsortedarray;

class Solution {
    public static void main(String[] args) {
       System.out.println(findMin(new int[]{148, 149, 151, 152, 160, 161, 163, 166, 168, 169, 170, 173, 174, 175,
                178, 182, 188, 189, 192, 193, 196, 198, 199, 200, 201, 202, 212, 218, 219, 220, 224, 225, 229, 231, 232, 234, 237, 238, 242, 248, 249,
                250, 252, 253, 254, 255, 257, 260, 266, 268, 270, 273, 276, 280, 281, 283, 288, 290, 291, 292, 294, 295, 298, 299, 4, 10, 13, 15, 16,
                17, 18, 20, 22, 25, 26, 27, 30, 31, 34, 38, 39, 40, 47, 53, 54}));


        System.out.println(findMin(new int[]{4, 5, 1, 2, 3}));
    }

    public static int findMin2(int[] nums) {
        int min = nums[0], left = 0, right = nums.length - 1;
        int index = 0;
        while (left <= right) {
            index = left + (right - left) / 2;
            if (nums[index] > nums[index + 1])
                return nums[index + 1];
            if (nums[index - 1] > nums[index])
                return nums[index];
            if (nums[left] < nums[index])
               left=index+1;
            else
                right=index-1;

        }
        return 0;
    }

    public static int findMin(int[] nums) {
        int min = nums[0], left = 0, right = nums.length - 1;
        int index = left + (right - left) / 2;
        int v1 = findMinNumber(nums, left, index);
        min = Math.min(v1, min);
        int v = findMinNumber(nums, index + 1, right);
        return Math.min(min, v);

    }

    public static int findMinNumber(int[] nums, int left, int right) {
        int min = nums[0];
        int index = 0;
        while (left <= right) {
            index = left + (right - left) / 2;
            min = Math.min(min, nums[left]);
            min = Math.min(min, nums[right]);
            min = Math.min(min, nums[index]);
            if (nums[left] <= nums[index]) {
                if (nums[left] <= min && min < nums[index])
                    right = index - 1;
                else
                    left = index + 1;
            } else {
                if (nums[index] < min && min <= nums[right])
                    left = index + 1;
                else
                    right = index - 1;
            }
        }
        return min;
    }

}