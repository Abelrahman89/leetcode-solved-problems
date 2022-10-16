package string.counteachcharacter;

import java.util.HashMap;

public class CountEachCharInString {
    public static void main(String[] args) {
    //    System.out.println();
        print("ahbacbhki;dajfrvaabetrah");

    }
    public  static void print(String str)
    {
        HashMap<Character,Integer> characterCount=new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char letter=str.charAt(i);
            if(!characterCount.containsKey(letter))
                characterCount.put(letter, 1);
            else {
                int counter=characterCount.get(letter)+1;
                characterCount.put(letter, counter);
            }

        }
     //   characterCount.forEach();
        System.out.println( characterCount);
    }
}
