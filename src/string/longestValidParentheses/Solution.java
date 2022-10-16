package string.longestValidParentheses;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

class Solution {
    public static void main(String[] args) {
        System.out.println(longestValidParentheses(")()()"));
    }

    public static int longestValidParentheses(String s) {
        int longestParentheses = 0;
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ')') {
                stack.pop();
                if (stack.isEmpty())
                    stack.push(i);
                else {
                    longestParentheses = Math.max(i - stack.peek(), longestParentheses);
                    if (stack.isEmpty())
                        stack.push(longestParentheses);
                }
            } else if (c == '(') {
                stack.push(i);
            }
        }

        return longestParentheses;
    }

    public static int longestValidParentheses2(String s) {
        int longestParentheses = 0;
        int currentLongest = 0;
        Map<Character, Character> map = new HashMap<>();

        map.put(')', '(');
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c != '(' && c != ')') {
                longestParentheses = Math.max(currentLongest, longestParentheses);
                currentLongest = 0;
            } else {
                if (map.containsKey(c)) {
                    if (stack.size() > 0 && stack.pop() == map.get(c))
                        currentLongest += 2;
                    else {
                        longestParentheses = Math.max(currentLongest, longestParentheses);
                        currentLongest = 0;
                    }
                } else
                    stack.push(c);

            }
        }
        if (stack.size() > 0)
            currentLongest -= 2;
        return Math.max(currentLongest, longestParentheses);
    }
}