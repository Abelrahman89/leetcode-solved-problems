package array.intersection_of_two_arrays;

import java.util.*;

public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(intersect(new int[]{1,2,2,1},
                new int[]{ 2})));
        System.out.println(Arrays.toString(intersect(new int[]{3,1,2},
                new int[]{1,  1})));
        System.out.println(Arrays.toString(intersect(new int[]{4,9,5},
                new int[]{9,4,9,8,4})));

    }
    public static int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> result = new ArrayList<>();
        List<Integer> numList=new ArrayList<>();
        for (Integer i:nums2)
            numList.add(i);
        for (Integer i:nums1)
            if (numList.contains(i)) {
                result.add(i);
                numList.remove(i);
            }
        return result.stream().mapToInt(i->i).toArray();

    }
    public static int[] intersectold(int[] nums1, int[] nums2) {
     //    int[] result = new int[nums1.length];
        List<Integer> result = new ArrayList<>();
        List<Integer> numList=new ArrayList<>();
        for (Integer i:nums1.length>nums2.length?nums2:nums1)
             numList.add(i);
        for (Integer i:nums1.length>nums2.length?nums1:nums2)
             if (numList.contains(i))
                 result.add(i);
        return result.stream().mapToInt(i->i).toArray();

    }
}
