package array.remove_duplicates;

public class RemoveDuplicates {
    public static void main(String[] args) {
        //  System.out.println(removeDuplicates(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4}));
        System.out.println(removeDuplicates(new int[]{-3, -1, 0, 0, 0, 3, 3}));
        System.out.println(removeDuplicates(new int[]{1,1,2}));
        System.out.println(removeDuplicates(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4}));
    }

    public static int removeDuplicates(int[] nums) {
        int pointer=0;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i]!=nums[pointer]) {
                pointer++;
                nums[pointer] = nums[i];
            }
        }
        return pointer+1;
    }

    /*
    public static int removeDuplicatesOld(int[] nums) {
        Set<Integer> copyNums = new HashSet<>();
        copyNums.add(nums[0]);
        for (int i = 1; i < nums.length; i++) {
            if (!copyNums.contains(nums[i]))
                copyNums.add(nums[i]);
        }
//        for (int i = copyNums.size() ; i < nums.length; i++) {
//            nums[i] =  0;
//        }
        int index = 0;
        int[] copyNumsArray = new int[copyNums.size()];

        for (Integer i : copyNums) {
            copyNumsArray[index] = i;

            index++;
        }
        Arrays.sort(copyNumsArray);
        for (int i : copyNumsArray) {
            nums[index] = i;

            index++;
        }
      //nums = copyNumsArray;
       System.out.println(Arrays.toString(nums));
     //   System.out.println(copyNums);
        return copyNums.size();
    }

     */
}
