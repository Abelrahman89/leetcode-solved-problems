package array;

import java.util.HashMap;

public class removingDuplicates {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 1, 3, 3, 5, 3, 5, 6, 7, 7, 5};
        HashMap<Integer, Integer> map = new HashMap<>();
        int max = 0, result=-1;
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        for (int i = 0; i < arr.length; i++) {
            if(max<map.get(arr[i])) {
                result = arr[i];
                max=map.get(arr[i]);
            }
        }
        System.out.println(result);

    }
}
