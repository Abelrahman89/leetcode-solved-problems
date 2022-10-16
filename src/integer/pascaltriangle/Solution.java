package integer.pascaltriangle;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        List<List<Integer>> result = generate(5);
        System.out.println(result);
    }
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> subList ;
            for (int i =1; i <= numRows; i++) {
                subList = new ArrayList<>();
                subList.add(1);
                List<Integer> previousSubList =new ArrayList<>();
                if(i>2)
                    previousSubList = result.get(i - 2);
                for (int j = 1; j < i - 1; j++) {
                    subList.add(previousSubList.get(j) + previousSubList.get(j - 1));
                }
                if(i>1)
                    subList.add(1);

                result.add(subList);

            }

        return result;
    }
}
