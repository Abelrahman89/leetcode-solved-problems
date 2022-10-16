package twodarraymatrix.matrixdiagonalsum;

class Solution {

    public int diagonalSum(int[][] mat) {
        int sum = 0, length = mat.length, j = 0;
        for (int i = 0; i < length; i++) {
            sum += mat[i][i];

            //to prevent add the value 2 times
            if (length - 1 - i != j)
                sum += mat[j][length - 1 - i];
            j++;

        }
        return sum;
    }


    public int diagonalSum2(int[][] mat) {
        int sum = 0, length = mat.length, j = 0;
        for (int i = 0; i < length; i++) {
            sum += mat[i][i];
        }
        for (int i = length - 1; i >= 0; i--) {
            if (i != j)
                sum += mat[j][i];
            j++;
        }
        return sum;
    }
}

