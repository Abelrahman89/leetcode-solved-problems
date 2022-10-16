package array.rotate_array;

import java.util.Arrays;

public class rotateArray {
    public static void main(String[] args) {
        rotate(new int[]{1, 2, 3, 4, 5, 6, 7}, 3);
       // rotate(new int[]{-1}, 2);
        //rotate(new int[]{1, 2}, 3);
    }
    public static void rotate(int[] nums, int k) {
        k=k%nums.length;
        reverse(nums,0,nums.length-1);
      reverse(nums,0,k-1);
       reverse(nums,k,nums.length-1);
    }
    public static void reverse(int[] nums, int start,int end) {
        for (int i = start; i <= end; i++) {
            int temp=nums[i];
            nums[i]=nums[end];
            nums[end--]=temp;
        }
    }
    public static void rotate2(int[] nums, int k) {
        if (k > 0 && nums.length != k) {
            if (nums.length > 2) {
                if (k >= nums.length)
                    k = k - nums.length;
                int j = k < nums.length ? k - 1 : nums.length - 1;
                int[] copy = new int[j + 1];
                for (int i = nums.length - 1; i >= 0; i--) {
                    if (j >= 0) {
                        copy[j] = nums[i];
                        j--;
                    }
                    if (i > k - 1)
                        nums[i] = nums[i - k];
                    else
                        nums[i] = copy[i];
                }
            } else if (nums.length == 2) {
                int temp = nums[0];
                nums[0] = nums[1];
                nums[1] = temp;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
