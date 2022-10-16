package string.compare2strings;

import java.util.HashMap;

public class CompareTwoStrings {
    public static void main(String[] args) {
        System.out.println(compare("abdo","bado"));
    }

    public static boolean compare(String firstWord, String secondWord) {
        boolean result = false;
        if (firstWord.length() != secondWord.length())
            return false;
        HashMap<Character, Integer> firstStringCharacterCount = charactersCount(firstWord);
        HashMap<Character, Integer> secondStringCharacterCount = charactersCount(secondWord);
//        System.out.println(firstStringCharacterCount);
//        System.out.println(secondStringCharacterCount);
        if (firstStringCharacterCount.equals(secondStringCharacterCount))
            return true;
        return result;
    }

    public static HashMap<Character, Integer> charactersCount(String str) {
        HashMap<Character, Integer> characterCount = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char letter = str.charAt(i);
            if (!characterCount.containsKey(letter))
                characterCount.put(letter, 1);
            else {
                int counter = characterCount.get(letter) + 1;
                characterCount.put(letter, counter);
            }

        }
        return characterCount;
    }
}
