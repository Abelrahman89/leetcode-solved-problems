package string.removeDuplicates;

class Solution {
    public String removeDuplicates(String s) {
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