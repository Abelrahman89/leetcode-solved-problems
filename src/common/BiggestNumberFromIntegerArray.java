package common;

import java.util.Arrays;
import java.util.stream.Collectors;

public class BiggestNumberFromIntegerArray {
    public static void main(String[] args) {

        //output should be 975330
        System.out.println( biggestNumber(new int[]{9, 30, 3, 75}));
    }

    public static int biggestNumber(int[] arr) {
        String[] arrString = Arrays.stream(arr).mapToObj(String::valueOf).toArray(String[]::new);
        Arrays.sort(arrString, (a, b) -> {
            String s1 = a + b;
            String s2 = b + a;
            return s1.compareTo(s2);
        });
        String result = "";
        for (int i = arrString.length - 1; i >= 0; i--) {
            result += arrString[i];
        }
       // System.out.println(Arrays.toString(arrString));//[30, 3, 75, 9]
     //   System.out.println(result);//975330


        return Integer.valueOf(result);

    }
}
