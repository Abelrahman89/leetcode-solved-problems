package dynamicProgramming.climbStairs;

class Solution {
    public int climbStairs(int n) {
        int a = 1;
        int b = 1;
        int c = b;
        for(int i=0; i< n-1; i++)
        {
            c = b + a;
            a = b;
            b = c;
        }
        return b;
    }
}