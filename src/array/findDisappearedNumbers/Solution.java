package array.findDisappearedNumbers;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        List<Integer> result=findDisappearedNumbers(new int[]{4,3,2,7,8,2,3,1});
        System.out.println(result);
    }
    public static  List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();
        Set<Integer> set=new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        for (int i = 1; i <=nums.length ; i++) {
            if(!set.contains(i))
                result.add(i);
        }
        return result;
    }

    public List<Integer> findDisappearedNumbers2(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            int newIndex = Math.abs(nums[i]) - 1;
            if (nums[newIndex] > 0) {
                nums[newIndex] *= -1;
            }
        }

        List<Integer> result = new LinkedList<Integer>();
        // Iterate over the numbers from 1 to N and add all those
        // that have positive magnitude in the array
        for (int i = 1; i <= nums.length; i++) {
            if (nums[i - 1] > 0) {
                result.add(i);
            }
        }

        return result;
    }
}
