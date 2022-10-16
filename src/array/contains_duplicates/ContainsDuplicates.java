package array.contains_duplicates;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicates {
    public static void main(String[] args) {
        System.out.println(containsDuplicate(new int[] {1,2,3,5}) );

    }
    static boolean containsDuplicate(int[] nums) {
        Set<Integer> numSet=new HashSet<>();
        numSet.add(nums[0]);
        for(int i=1;i<nums.length;i++)
        {
            if(numSet.contains(nums[i]))
                return true;
            else
                numSet.add(nums[i]);
        }
        return false;
    }

}
