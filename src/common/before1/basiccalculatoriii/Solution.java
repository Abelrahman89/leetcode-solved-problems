package common.before1.basiccalculatoriii;


import java.util.Stack;

//https://leetcode.com/problems/basic-calculator-iii/
class Solution {
    public static void main(String[] args) {
        System.out.println(calculate("2*5"));
        //      System.out.println(calculate("2*5+5*2"));
        System.out.println(calculate("2*(5+5*2)/3+(6/2+8)"));
    }

    static char[] arr;
    static int index;

    public static int calculate(String s) {
        index = 0;
        arr = s.toCharArray();
        return dfs();
    }

    public static int dfs() {
        int total = 0;
        Stack<Integer> values = new Stack<>();
        char operator = '+';
        while (index < arr.length) {
            if (arr[index] != ' ') {
                if (Character.isDigit(arr[index])) {
                    StringBuilder sb = new StringBuilder();
                    while (index < arr.length && Character.isDigit(arr[index]))
                        sb.append(arr[index++]);
                    index--;
                    int current = Integer.parseInt(sb.toString());
                    performOperation(values, current, operator);
                } else if (arr[index] == '(') {
                    index++;
                    int current = dfs();
                    performOperation(values, current, operator);

                } else if (arr[index] == ')')
                    break;
                else
                    operator = arr[index];
            }

        index++;
    }

        while(!values.isEmpty())
            total+=values.pop();
        return total;
}

    public static void performOperation(Stack<Integer> stack, int current, char operator) {
        if (operator == '-')
            current = stack.pop() - current;
        else if (operator == '*')
            current *= stack.pop();
        else if (operator == '/')
            current = stack.pop() / current;
        stack.push(current);

    }


}