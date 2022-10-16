package twodarraymatrix.rotateimage;

class Solution {
    public void rotate(int[][] matrix) {
        swapDiagonally(matrix);
        swapHorizontally(matrix);
    }
    private void swapDiagonally(int[][] matrix) {
        for (int i = 0; i < matrix.length - 1; i++) {
            for (int j = 0; j < matrix.length - i - 1; j++) {
                int current = matrix[i][j];
                matrix[i][j] = matrix[matrix.length - j - 1][matrix.length - i - 1];
                matrix[matrix.length - j - 1][matrix.length - i - 1] = current;
            }
        }
    }
    private void swapHorizontally(int[][] matrix) {
        for (int i = 0; i < matrix.length / 2; i++) {
            for (int j = 0; j < matrix.length; j++) {
                int current = matrix[i][j];
                matrix[i][j] = matrix[matrix.length - i - 1][j];
                matrix[matrix.length - i - 1][j] = current;
            }
        }
    }
}
