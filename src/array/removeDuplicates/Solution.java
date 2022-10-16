package array.removeDuplicates;

class Solution {
    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{0,0,1,1,1,1,2,3,3}));
    }

    public static int removeDuplicates(int[] nums) {
        int j=1,count=1;
        for (int i =1; i < nums.length; i++) {
            if (nums[i] == nums[i-1] ) {
                count++;
            }
            else
                count=1;
            if(count<=2)
                nums[j++]=nums[i];
        }
        return nums.length - j;
    }
}