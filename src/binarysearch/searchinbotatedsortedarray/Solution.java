package binarysearch.searchinbotatedsortedarray;

class Solution {
    public static void main(String[] args) {

        //    System.out.println(search(new int[]{4,5,6,7,0,1,2}, 0));
    //    System.out.println(search(new int[]{5,1,3}, 1));
        System.out.println(search(new int[]{148,149,151,152,160,161,163,166,168,169,170,173,174,175,
                178,182,188,189,192,193,196,198,199,200,201,202,212,218,219,220,224,225,229,231,232,234,237,238,242,248,249,
                250,252,253,254,255,257,260,266,268,270,273,276,280,281,283,288,290,291,292,294,295,298,299,4,10,13,15,16,
                17,18,20,22,25,26,27,30,31,34,38,39,40,47,53,54},        30));


    }
    public static int search(int[] nums, int target) {
        int index = 0, left = 0, right = nums.length - 1;
        while (left <= right) {
            index = left + (right - left) / 2;
            if (nums[index] == target)
                return index;
            if (nums[left] <= nums[index]) {
                if (nums[left] <= target && target < nums[index])
                    right = index - 1;
                else
                    left = index + 1;
            } else {
                if (nums[index] < target && target <= nums[right])
                    left = index + 1;
                else
                    right = index - 1;
            }
        }
        return -1;
    }

    public static int searchArray(int[] nums, int target, int left, int right) {
        int index = 0;
        while (left <= right) {
            index = left + (right - left) / 2;
            if (nums[index] == target)
                return index;
            if (nums[left] == target)
                return left;
            if (nums[right] == target)
                return right;
            else if (target < nums[index]) {
                //  left = 0;
                right = index - 1;
            } else {
                left = index + 1;
            }

        }

        return -1;
    }
    public static int search2(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        int index = left + (right - left) / 2;
        int returnVal = searchArray2(nums, target, left, index);
        if (returnVal == -1)
            return searchArray2(nums, target, index +1, right);
        else
            return returnVal;
    }

    public static int searchArray2(int[] nums, int target, int left, int right) {
        int index = 0;
        while (left <= right) {
            index = left + (right - left) / 2;
            if (nums[index] == target)
                return index;
            if (nums[left] == target)
                return left;
            if (nums[right] == target)
                return right;
            else if (target < nums[index]) {
                //  left = 0;
                right = index - 1;
            } else {
                left = index + 1;
            }

        }

        return -1;
    }
}

