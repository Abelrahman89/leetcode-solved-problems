package array.longestconsecutivesequence;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        longestConsecutive(new int[]{0, 3, 7, 2, 5, 8, 4, 6, 0, 1});
    }

    public static int longestConsecutive(int[] nums) {
        if (nums.length == 0)
            return 0;
        Set<Integer> set = new HashSet<Integer>();
        int ans = 0;
        for (int num : nums) {
            set.add(num);
        }
        for (int num : nums) {
            if (!set.contains(num - 1)) {
                int count = 1;
                while (set.contains(num + 1)) {
                    num += 1;
                    count++;
                }
                ans = Math.max(ans, count);
            }
        }
        return ans;
    }

}
