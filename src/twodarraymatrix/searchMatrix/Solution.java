package twodarraymatrix.searchMatrix;


class Solution {
    public static void main(String[] args) {
        System.out.println(searchMatrix(new int[][]{{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}}, 3));
     //   System.out.println(searchMatrix(new int[][]{{1}, {3}}, 2));
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length, columns = matrix[0].length;
        if (rows == 0 || columns == 0)
            return false;
        //binary search to find the target  row
        int left = 0, right = rows - 1, mid = 0;
        while (left <= right) {
            mid = left + (right - left) / 2;
            if ((matrix[mid][0] <= target) && (matrix[mid][columns - 1] >= target))
                break;
            if (target < matrix[mid][0])
                right = mid - 1;
            else
                left = mid + 1;
        }
        //binary search to find the target  column
        return binarySearch(matrix, mid, 0, columns - 1, target);
    }
    private static boolean binarySearch(int[][] matrix, int i, int left, int right, int target) {
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (matrix[i][mid] == target)
                return true;
            if (target < matrix[i][mid])
                right = mid - 1;
            else
                left = mid + 1;
        }
        return false;
    }

    //log(no of rows) + log(no of columns)
}