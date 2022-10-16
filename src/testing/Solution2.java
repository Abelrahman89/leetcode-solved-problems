package testing;

public class Solution2 {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 3, 1, 1, 4};
        arr = new int[]{3, 2, 1, 0, 4};

        System.out.println(jumps(arr));
    }

    public static boolean jumps(int[] arr) {
     //Time Complexity O(n), Space Complexity O(1)
        int index = 0;
        for (int i = 0; i < arr.length && i <= index; i++) {
            index = Math.max(index, arr[i] + i);
            if (index >= arr.length - 1)
                return true;
        }
        return false;
    }

    public static boolean jumps2(int[] nums) {
//        for (int i = 0; i < arr.length; i++) {
//            if (i + arr[i] >= arr.length)
//                return true;
//            else {
//                for (int j = i; j < arr[i]; j++) {
//                    if (j + arr[j] >= arr.length)
//                        return true;
//                    else if (arr[j] == 0)
//                        return false;
//                }
//            }
//        }
        int index = 0;
        for (int i = 0; i < nums.length && i <= index; i++) {
            index = Math.max(index, nums[i] + i);
            if (index >= nums.length - 1)
                return true;
        }
        return false;
        // return false;
    }
}
