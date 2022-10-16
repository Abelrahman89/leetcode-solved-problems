package binarysearch.binarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        System.out.println(search(new int[]{2, 5}, 5));
    }

    public static int search(int[] nums, int target) {
        int index = 0, left = 0, right = nums.length - 1;
        while (left <= right) {
            index = left + (right - left) / 2;
            if (nums[index] == target)
                return index;
            else if (target < nums[index]) {
                left = 0;
                right = index - 1;
            } else {
                left = index + 1;
            }

        }

        return -1;
    }
}
