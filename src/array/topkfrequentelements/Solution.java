package array.topkfrequentelements;

import java.util.*;

class Solution {
    public static void main(String[] args) {
        topKFrequent(new int[]{3, 2, 3, 1, 2, 4, 5, 5, 6, 7, 7, 8, 2, 3, 1, 1, 1, 10, 11, 5, 6, 2, 4, 7, 8, 5, 6}, 10);
    }

    public static int[] topKFrequent(int[] nums, int k) {
        //TC: O(N log k)
        //SC: O(n+k)
        if (nums.length == k)
            return nums;
        int[] answer = new int[k];

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++)
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);

        Queue<Integer> heap = new PriorityQueue<>(
                (n1, n2) -> map.get(n1) - map.get(n2)
        );
        // 2. keep k top frequent elements in the heap
        // O(N log k) < O(N log N) time
        for (int n : map.keySet()) {
            heap.add(n);
            if (heap.size() > k)
                heap.poll();
        }
        // 3. build an output array
        // O(k log k) time
        for (int i = k - 1; i >= 0; --i)
            answer[i] = heap.poll();
        return answer;
    }

}