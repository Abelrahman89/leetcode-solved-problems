package testingRevision.jpmorgan;

public class SearchInArray {

    public static int reverseNumber(int n){
        int result = 0;
        while(n >= 1)
        {
            result = result * 10 + n %10;
            n /=10;
        }
        return result;
    }
    public static int countOccurrences(int[] arr, int target) {

        if (arr.length == 0)
            return 0;
        int result = 0;
//1 2 3 4 5 5 5 5 5 6 7 8 9
        int left = 0;
        int right = arr.length - 1;
        int mid = 0;
        while (left < right) {
            mid = left + (right - left) / 2;
            if(arr[mid]== target)
            {
             /*   if(arr[mid+1] != target  && arr[mid-1] != target)
                    return 1;
                int firstOcurrences= mid -1;

              */

            }
            if(target < arr[mid])
                right = mid -1;
            else
                left = mid + 1;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(reverseNumber(1234));
    }
}
