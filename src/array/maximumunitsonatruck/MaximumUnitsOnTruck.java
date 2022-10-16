package array.maximumunitsonatruck;

import java.util.Arrays;

public class MaximumUnitsOnTruck {
    public static void main(String[] args) {

    }

    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (a, b) -> a[1] - b[1]);
        int unitCount = 0;
        for (int[] box : boxTypes) {
            int boxCount = Math.min(truckSize, box[0]);
            unitCount += boxCount * box[1];
            truckSize -= boxCount;
            if (truckSize == 0)
                break;
            ;
        }
        return unitCount;
    }
}
