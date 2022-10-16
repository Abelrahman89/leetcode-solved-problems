package array.intersection;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        if (nums1.length == 0 || nums2.length == 0)
            return new int[]{};

        List<Integer> result = new LinkedList<>();
        HashMap<Integer, Integer> occurences = new HashMap<>();
        for (int i = 0; i < nums1.length; i++)
            occurences.put(nums1[i], occurences.getOrDefault(nums1[i], 0) + 1);
        for (int i = 0; i < nums2.length; i++) {
            if (occurences.containsKey(nums2[i]) && occurences.get(nums2[i]) > 0) {
                result.add(nums2[i]);
                occurences.put(nums2[i], 0);
            }
        }
        return result.stream().mapToInt(i -> i).toArray();
    }

}