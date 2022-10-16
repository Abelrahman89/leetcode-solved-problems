package array.canPlaceFlowers;

public class Solution {
    public static void main(String[] args) {
        System.out.println(canPlaceFlowers(new int[]{1,0,0,0,1},2));
    }
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int threeZeroCount=0;
        if(flowerbed[0]==0)
            threeZeroCount++;

        for (int i = 0; i <flowerbed.length ; i++) {
            if(flowerbed[i]==0)
                threeZeroCount++;
            else{
                threeZeroCount=0;
            }
            if(threeZeroCount==3)
            {
                threeZeroCount=1;
                n--;
            }
            if(n==0)
                return true;
        }
        if(threeZeroCount==2)
        {
            threeZeroCount=1;
            n--;
        }
        if(n==0)
            return true;
        return false;
    }
}