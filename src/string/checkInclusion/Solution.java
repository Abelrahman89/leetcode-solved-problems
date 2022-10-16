package string.checkInclusion;

class Solution {
    public boolean checkInclusion(String s1, String s2) {

        if (s2.length() < s1.length())
            return false;
        int[] arr = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            arr[s1.charAt(i) - 'a']++;
        }

        for (int i = 0; i < s1.length(); i++) {
            arr[s2.charAt(i) - 'a']--;
        }
        if (isEmpty(arr))
            return true;
        int i = 0, j = s1.length() - 1;
        while (j < s2.length()) {
            arr[s2.charAt(i) - 'a']++;
            j++;
            i++;
            if (j < s2.length())
                arr[s2.charAt(j) - 'a']--;
            if (isEmpty(arr))
                return true;

        }
        return isEmpty(arr);
    }

    public boolean isEmpty(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0)
                return false;
        }
        return true;
    }

}

