package array.square_of_sorted_array;

import java.util.Arrays;

public class SquareOfSortedArray {
    public static void main(String[] args) {
        //System.out.println(Arrays.toString(sortedSquares(new int[]{-4, -1, 0, 3, 10})));
        System.out.println(Math.log(64));
    }

    public static int[] sortedSquares(int[] nums) {
        int sortedSquaresArray[] = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            sortedSquaresArray[i] = nums[i] * nums[i];
        }
        Arrays.sort(sortedSquaresArray);
        return sortedSquaresArray;

    }
    
//    public static long findTotalImbalance(List<Integer> rank)
//    {
//
//        if (rank.size()<=1)
//            return 0;
//
//        int answer=0;
//        for (int i = 0; i < rank.size(); i++) {
//
//        }
//        return answer;
//    }

}
