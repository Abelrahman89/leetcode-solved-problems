package twodarraymatrix.validsudoku;

import java.util.Arrays;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) {
        int val = '9' - '0';
        System.out.println(val);
      //  String s="#HelloW #World";
        //System.out.println( Integer.valueOf(s.substring(0, 5)));



    }


    public boolean isValidSudoku(char[][] board) {
        int size = 9;
        int[] rows = new int[size];
        int[] cols = new int[size];
        int[] boxes = new int[size];

        for (int r = 0; r < size; r++) {
            for (int c = 0; c < size; c++) {

                // check if the position is filled with the number
                if (board[r][c] == '.') {
                    continue;
                }
                int val = board[r][c] - '0'; // change the char to integer number

                // using left shift operator <<1 whill add 0  to the right
                //>>1 will remove  one  digits from  the right
                int pos = 1 << (val - 1);//will remove one  digits from the right

                //check the row
                //using Bitwise Operator 1&1-> 1, 1&0 -> 0
                if ((rows[r] & pos) > 0) {
                    return false; //means it is repeated
                }
                rows[r] |= pos;

                //check the column
                if ((cols[c] & pos) > 0)
                    return false;

                cols[c] |= pos; // Bitwise | Operator 1 | 1-> 1 , 0 |0 -> 0 , 1 |0 -> 1

                //check the box
                int idx = (r / 3) * 3 + c / 3;
                if ((boxes[idx] & pos) > 0)
                    return false;
                boxes[idx] |= pos;

            }
        }
        return true;

    }


}
