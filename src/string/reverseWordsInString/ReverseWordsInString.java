package string.reverseWordsInString;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseWordsInString {

    public static void main(String[] args) {
        System.out.println(reverseWords("  hello world  "));

    }


    public static String reverseWords(String s) {
        String s2 = s.trim();
        List<String> l =Arrays.asList(s2.split("\\s+"));
        Collections.reverse(l);
        return String.join(" ", l);



    }


    public static String reverseWords2(String s) {
        String result = "";
        String[] stringArray = s.split("\\s+");
        for (int i = stringArray.length - 1; i >= 0; i--) {
            if (!stringArray[i].equals("")) {
                if (i == 0 || (i > 0 && stringArray[i - 1].equals("")))
                    result += stringArray[i];
                else
                    result += stringArray[i] + " ";
            }
        }
        return result;
    }
}
