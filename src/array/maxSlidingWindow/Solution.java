package array.maxSlidingWindow;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

class Solution {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(maxSlidingWindow(new int[]{1, 3, -1, -3, 5, 3, 6, 7}, 3)));
    }

    public static int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        if (n == 0 || k == 0)
            return new int[0];

        int[] result = new int[n - k + 1];
        Deque<Integer> deque = new ArrayDeque<>();
        for (int i = 0; i < n ; i++) {

            // remove indices that are out of bound
            while (deque.size() > 0 && deque.peekFirst() <= i - k )
                deque.pollFirst();

            // remove indices whose corresponding values are less than nums[i]
            while (deque.size() > 0 && nums[deque.peekLast()] < nums[i])
                deque.pollLast();

            // add index i
            deque.offerLast(i);

            // add to result
            if (i >=k-1 )
                result[i - k + 1] = nums[deque.peekFirst()];
        }
        return result;
    }

    public static int[] maxSlidingWindow2(int[] nums, int k) {
        int[] result = new int[nums.length - k + 1];
        int max = Integer.MIN_VALUE;
        if (nums.length < k)
            return null;
        int index = 0;
        for (int i = 0; i <= nums.length - k; i++) {
            max = nums[i];
            for (int j = 1; j < k; j++) {
                max = Math.max(max, nums[j + i]);
            }
            if (index < result.length)
                result[index++] = max;
            else
                return result;
        }
        return result;
    }
}