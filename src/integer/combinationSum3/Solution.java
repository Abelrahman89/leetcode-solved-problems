package integer.combinationSum3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        // backtracking approach
        List<List<Integer>> result = new ArrayList<>();
        backtrackingHelper(1, k, n, new LinkedList(), result);
       // return Collections.unmodifiableList(result); just for testing
        return result;
    }

    public void backtrackingHelper(int start, int k, int n, LinkedList l, List<List<Integer>> result) {
        if (k < 0 || n < 0)
            return;
        if (k == 0 && n == 0) {
            result.add(new ArrayList(l));
            return;
        }
        for (int i = start; i <= 9; i++) {
            l.add(i);
            backtrackingHelper(i + 1, k - 1, n - i, l, result);
            l.removeLast();

        }
    }
}