package binarysearch.binary_search;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        System.out.println(binarySearch(new int[]{1, 4, 7, 5, 18, 21}, 10));
    }

    public static boolean binarySearch(int[] arr, int val) {
        boolean result = false;//1
        if (arr.length <= 0) return false;//1
        else {
            Arrays.sort(arr);//n
            if (arr[arr.length - 1] < val) return false;//1
            int low = 0;//1
            int high = arr.length - 1;//1
            int mid = (high + low) / 2;//1
            while (low <= high) {//log(n)
                if (arr[mid] == val) return true;//
                else {
                    if (val > arr[mid]) low = mid + 1;
                    else high = mid - 1;
                    mid = (low + high) / 2;
                }
            }
        }

        return result;

    }
}
