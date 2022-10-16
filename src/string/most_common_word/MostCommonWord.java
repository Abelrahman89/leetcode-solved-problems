package string.most_common_word;

import java.util.*;

public class MostCommonWord {
    public static void main(String[] args) {
        System.out.println(mostCommonWord("Bob hit a ball, the hit BALL flew far after it was hit.",

                new String[]{"hit"}));
        String g=   "Bob hit a ball, the hit BALL flew far after it was hit.";
        System.out.println(g);
        System.out.println( g.replaceAll("[^a-zA-Z0-9 ]", " ").toLowerCase());
//
//        System.out.println(mostCommonWord("a.",
//                new String[]{}));
//
//        System.out.println(mostCommonWord("bob",
//                new String[]{}));

//        System.out.println(mostCommonWord(
//                "Bob. hIt, baLl",
//                new String[]{
//                        "bob", "hit"}));

//        System.out.println(mostCommonWord(
//                "abc abc? abcd the jeff!",
//                new String[]{
//                        "abc", "abcd", "jeff"}));
    }

    public static String mostCommonWordOld(String paragraph, String[] banned) {
        String result = "";
        if (paragraph.length() > 0) {
            String copyParagraph = paragraph.replaceAll("[^a-zA-Z0-9 ]", " ");
            String[] paragraphWords = copyParagraph.split("\\s+");
            HashMap<String, Integer> commonWords = new HashMap<>();
            String word = "";
            for (int i = 0; i < paragraph.length(); i++) {

                char alphabet = paragraph.charAt(i);
                if ((alphabet >= 'a' && alphabet <= 'z') || (alphabet >= 'A' && alphabet <= 'Z'))
                    word += alphabet;
                else if (word != "") {

                    checkingWord(word, commonWords, banned);
                    word = "";
                }

            }
            if (word != "") {
                checkingWord(word, commonWords, banned);
            }
            int counter = 0;
            counter = commonWords.values().stream().reduce((a, b) -> a > b ? a : b).orElse(0);

            if (counter > 0) {
                for (Map.Entry<String, Integer> entry : commonWords.entrySet()) {
                    if (entry.getValue() == counter) {
                        result = entry.getKey();


                    }
                }
            }

            System.out.println(commonWords);
        }

        return result;
    }

    public static String mostCommonWord(String paragraph, String[] banned) {
        String result = "";
        if (paragraph.length() > 0) {
            String copyParagraph = paragraph.replaceAll("[^a-zA-Z0-9 ]", " ").toLowerCase();
            String[] paragraphWords = copyParagraph.split("\\s+");
            Map<String, Integer> commonWords = new HashMap<>();

            Set<String> bannedWords = new HashSet<>();
            for (int i = 0; i < banned.length; i++)
                bannedWords.add(banned[i]);

            for (String word : paragraphWords) {
                if (!bannedWords.contains(word))
                    commonWords.put(word, commonWords.getOrDefault(word, 0) + 1);
            }

//            int counter = 0;
//            counter = commonWords.values().stream().reduce((a, b) -> a > b ? a : b).orElse(0);
//
//            if (counter > 0) {
//                for (Map.Entry<String, Integer> entry : commonWords.entrySet()) {
//                    if (entry.getValue() == counter) {
//                        result = entry.getKey();
//
//
//                    }
//                }
//            }

            result = Collections.max(commonWords.entrySet(), Map.Entry.comparingByValue()).getKey();
            System.out.println("fgfg"+commonWords.entrySet());
            System.out.println(Collections.max(commonWords.entrySet(), Map.Entry.comparingByValue()));
            System.out.println(commonWords);
        }

        return result;
    }

    public static void checkingWord(String word, HashMap<String, Integer> commonWords, String[] banned) {

        boolean isBanned = false;
        word = word.toLowerCase();
        for (int j = 0; j < banned.length; j++) {
            if (banned[j].equals(word)) {
                isBanned = true;
                break;
            }
        }

        if (isBanned == false) {

            if (commonWords.containsKey(word)) {
                int counter = commonWords.get(word) + 1;
                commonWords.put(word, counter);
            } else {
                commonWords.put(word, 1);
            }
        }
    }
}
