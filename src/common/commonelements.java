package common;

import java.util.*;
import java.util.stream.Collectors;

public class commonelements {
    public static void main(String[] args) {
        int []nums1=new int []{1,3,7,5,3,4,7,3,7,4,5,3};
        int []nums2=new int []{3,4,7,4,3,4,7,5,3,2};

       // output should be {3,3,3,4,4,7,7,5} because want to show the smallest occurences
        System.out.println(Arrays.toString(intersect(nums1,nums2)));//3, 4, 7, 4, 3, 7, 5, 3 if you want to sort use Arrays.sort()
    }
    //https://leetcode.com/problems/intersection-of-two-arrays-ii/submissions/
    public static int[] intersect(int []nums1, int []nums2){
        if(nums1.length==0 ||nums2.length==0)
            return new int[]{};

        List<Integer> result=new LinkedList<>();
        HashMap<Integer,Integer> occurences=new HashMap<>();
        for(int i=0;i<nums1.length;i++)
            occurences.put(nums1[i],occurences.getOrDefault(nums1[i],0)+1);
        for (int i = 0; i <nums2.length ; i++) {
            if(occurences.containsKey(nums2[i]) && occurences.get(nums2[i])>0 )
            {
                result.add(nums2[i]);
                occurences.put(nums2[i],occurences.get(nums2[i])-1);
            }
        }
        return result.stream().mapToInt(i->i).toArray();

    }
}
