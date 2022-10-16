package common;

import java.util.Arrays;

public class resolveteck {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{-1, -3}));
    }

    public static int solution(int[] A) {
        Arrays.sort(A);
        for (int i = 1; i < A.length; i++) {

            if (A[i] - A[i - 1] > 1 && A[i] > 0)
                return A[i] - 1;
        }
        if (A[A.length - 1] < 1)
            return 1;
        return A[A.length - 1] + 1;
    }

}
