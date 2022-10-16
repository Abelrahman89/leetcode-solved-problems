package string.valid_parentheses;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        System.out.println(isValid("()"));
    }
    public static boolean isValid2(String s) {

        Map<Character, Character> mappings = new HashMap<>();
        mappings.put( ')','(');
        mappings.put( '}','{');
        mappings.put( ']','[');

        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            // If the current character is a closing bracket.
            if (mappings.containsKey(c)) {

                // Get the top element of the stack. If the stack is empty, set a dummy value of '#'
                char topElement = stack.empty() ? '#' : stack.pop();

                // If the mapping for this bracket doesn't match the stack's top element, return false.
                if (topElement != mappings.get(c)) {
                    return false;
                }
            } else {
                // If it was an opening bracket, push to the stack.
                stack.push(c);
            }
        }

        // If the stack still contains elements, then it is an invalid expression.
        return stack.isEmpty();
    }
    public static boolean isValid(String s) {

        Map<Character, Character> map = new HashMap<>();
        map.put( ')','(');
        map.put( '}','{');
        map.put( ']','[');

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                Character c = stack.empty() ? '#' : stack.pop();
                if (c != map.get(s.charAt(i)))
                    return false;
            } else
                stack.push(s.charAt(i));

        }

        return stack.isEmpty();
    }
}
