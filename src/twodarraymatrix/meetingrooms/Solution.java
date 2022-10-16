package twodarraymatrix.meetingrooms;

import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
       // System.out.println(canAttendMeetings(new int[][]{{0, 30}, {5, 10}, {15, 20}}));
      //  System.out.println(canAttendMeetings(new int[][]{{7, 10}, {2, 4}, {15, 20}}));
      //  System.out.println(canAttendMeetings(new int[][]{{6, 15}, {13, 20}, {6, 17}}));
        System.out.println(canAttendMeetings(new int[][]{{13, 15}, {1, 13}}));
    }

    public static boolean canAttendMeetings(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0] ,b[0]));
        for (int i = 0; i < intervals.length-1; i++) {
            if ( intervals[i+1][0] < intervals[i][1])
                return false;
        }
        return true;
    }


}