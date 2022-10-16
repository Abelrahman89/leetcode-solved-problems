package array.NumbersWithevenNumberOfDigits;

public class NumbersWithEvenNumberOfDigits {

    public static int findNumbers(int[] nums) {
        int maxNumberOfEvenDigits = 0;
        for (int i = 0; i < nums.length; i++) {
            if (String.valueOf(nums[i]).length() % 2 == 0)
                maxNumberOfEvenDigits++;
        }
        return maxNumberOfEvenDigits;
    }

    public static void main(String[] args) {
        System.out.println(findNumbers(new int[]{12, 345, 2, 24, 6, 7896}));
    }
}
