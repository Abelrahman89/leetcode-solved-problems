package algorithm.lab1;

import java.util.ArrayList;

public class Problem2 {
    public static ArrayList<Integer> knapsack(int[] s, int[] v, int[] w, int W) {

        ArrayList<Integer> result = new ArrayList<Integer>();
        int last = 0;
        int max = 0;
        for (int i = 0; i < w.length; i++) {
            if (w[i] + last <= W) {
                last += w[i];
                max += v[i];
                result.add(s[i]);
            } else break;


        }
        return result;
    }

    public static void main(String[] args) {
        int s[] = new int[]{0, 1, 2};
        int v[] = new int[]{1, 3, 10};
        int w[] = new int[]{1, 2, 4};
        int W = 4;
        System.out.println(knapsack(s, v, w, W));
    }
}
