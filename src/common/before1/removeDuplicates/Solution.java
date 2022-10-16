package common.before1.removeDuplicates;

class Solution {
    public static void main(String[] args) {


        System.out.println(removeDuplicates("aabacbba"));


    }


    public static String removeDuplicates(String s) {
        StringBuilder sb = new StringBuilder();
        int length = 0;
        for (char c : s.toCharArray()) {
            if (length != 0 && sb.charAt(length - 1) == c) {
                sb.deleteCharAt(length - 1);
                length--;
            } else {
                sb.append(c);
                length++;
            }

        }
        return sb.toString();
    }

}