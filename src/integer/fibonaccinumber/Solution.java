package integer.fibonaccinumber;

import java.util.HashMap;

class Solution {
 static    HashMap <Integer,Integer>map=new HashMap<>();
    public static void main(String[] args) {
        System.out.println(fib(10));
    }
    public static int fib(int n) {
        if (map.containsKey(n))
            return map.get(n);
        else {
            if (n < 2)
                return n;
            else {
                map.put(n, fib(n - 1) + fib(n - 2));
                return map.get(n);
            }
        }

    }

    public static int fib2(int n) {
        if(n<2)
            return n;
        else
            return fib(n-1)+fib(n-2);

    }

}