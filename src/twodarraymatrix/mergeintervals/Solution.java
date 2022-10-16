package twodarraymatrix.mergeintervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

class Solution {
    public static void main(String[] args) {
        merge(new int[][]{{2, 6}, {1, 3}, {8, 10}, {15, 18}});
    }

    public static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        LinkedList<int[]> result = new LinkedList<>();
        for (int[] interval : intervals) {
            {
                if (result.isEmpty() || result.getLast()[1] < interval[0])
                    result.add(interval);
                else {
                    result.getLast()[1] =Math.max(result.getLast()[1],interval[1]);
                }
            }
        }
        return result.toArray(new int[result.size()][]);
    }

    //Another Solution but wrong because if the elements size
    // is not equal the length will give extra elements that not needed
    public static int[][] merge2(int[][] intervals) {
        int length = intervals.length, j = 0;
        int[][] result = new int[length][2];
        List<List<Integer>> l = new ArrayList<>();

        for (int i = 1; i < length; i++) {
            if (intervals[i][0] <= intervals[i - 1][1]) {
                result[j][0] = intervals[i - 1][0];
                result[j][1] = intervals[i][1];
                j++;
            } else {
                result[j] = intervals[i];
                j++;
            }
        }
        return result;
    }
}
