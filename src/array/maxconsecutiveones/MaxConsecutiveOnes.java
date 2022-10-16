package array.maxconsecutiveones;

public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        System.out.println(findMaxConsecutiveOnes(new int[]{1,1,0,1,1,1,0,1,1,1,1}));

    }

    public static int findMaxConsecutiveOnes(int[] nums) {
        int maxCount = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1)
                count++;
            else {
                if (count > maxCount)
                    maxCount = count;
                count = 0;
            }
        }

        return  Math.max(maxCount, count);
    }


}
