package array.tow_sum;

public class TwoSumII {
    public int[] twoSum(int[] numbers, int target) {
        int left=0,right=numbers.length-1;
        while(left<right &&left<numbers.length)
        {
            if(target-numbers[left]==numbers[right])
                return new int[]{left+1,right+1};
            else if(target<numbers[left]+numbers[right])
                right--;
            else if(target>numbers[left]+numbers[right])
                left++;
        }
        return new int[]{};
    }
}
