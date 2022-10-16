package string.decodeString;

import java.util.Stack;

public class DecodeString {
    public static void main(String[] args) {
        System.out.println( decodeString("3[a]2[bc]"));
    }
    public static  String decodeString(String s) {
        Stack<String> substrings=new Stack<>();
        Stack<Integer>repeatedNumber=new Stack<>();
        String result = "";
        String subString="";
        int i = 0;
        int n = 0;
        while (i < s.length()) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                n = Character.getNumericValue(c);
                repeatedNumber.push(Character.getNumericValue(c));
                substrings.push(subString);
                subString="";
            }
            else if (c == ']') {
                while(repeatedNumber.size()>0) {
                    int repeat = repeatedNumber.pop();
                    String st = substrings.pop();
                    for (int j = 0; j < repeat; j++) {
                        result += st;
                    }
                }

            } else if (c != '[') {
                subString += c;
            }
            i++;
        }
        return result;
    }
    public static  String decodeString2(String s) {

        String result = "";
        String subString="";
        int i = 0;
        int n = 0;
        while (i < s.length()) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                n = Character.getNumericValue(c);
                subString="";
            }
            else if (c == ']') {
                for (int j = 0; j < n; j++) {
                    result+=subString;
                }

            } else if (c != '[') {
                subString += c;
            }
            i++;
        }




        return result;

}
}
