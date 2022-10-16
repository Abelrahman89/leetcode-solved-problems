package binarysearch.binary_search;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest {
    public static void main(String[] args) {
     //   System.out.println(binarySearch(new int[]{1, 4, 7, 5, 18, 21}, 10));
        System.out.println(binarySearch2(new int[]{1, 4, 7, 5, 18, 21}, 4));
    }
    public static int binarySearch2(int[] arr, int val) {
        List<Integer> l=new ArrayList<>();
        for (int s : arr) {
            l.add(s);
        }
        return Collections.binarySearch(l,val);
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
