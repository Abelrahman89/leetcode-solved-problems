package array.single_number;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SingleNumber {
    public static void main(String[] args) {
        System.out.println(singleNumber(new int[]{1, 2, 1, 7, 5, 5, 7}));
    }

    public static int singleNumber(int[] nums) {
     int abs=nums[0];
        for (int i = 1; i < nums.length; i++) {
            abs=abs ^ nums[i];

        }
     return abs;
    }
    public static int singleNumber1(int[] nums) {
        HashMap<Integer, Integer> copyNums = new HashMap<>();
        copyNums.put(nums[0], 1);
        for (int i = 1; i < nums.length; i++) {
                copyNums.put(nums[i], copyNums.getOrDefault(nums[i],0)+1);
        }
        for (int i:nums)
            if(copyNums.get(i)==1)
                return i;
        return -1;
    }

    public static int singleNumberOld2(int[] nums) {
        List<Integer> singleNumber = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (singleNumber.contains(nums[i]))
                singleNumber.remove(new Integer(nums[i]));
            else
                singleNumber.add(new Integer(nums[i]));
        }
        return singleNumber.get(0);
    }

    public static int singleNumberOld(int[] nums) {
        HashMap<Integer, Integer> copyNums = new HashMap<>();
        copyNums.put(nums[0], 1);
        for (int i = 1; i < nums.length; i++) {
            if (copyNums.containsKey(nums[i]))
                copyNums.put(nums[i], 2);
            else
                copyNums.put(nums[i], 1);
        }
        for (Map.Entry<Integer, Integer> entry : copyNums.entrySet())
            if (entry.getValue() == 1)
                return entry.getKey();
        return -1;
    }
}
