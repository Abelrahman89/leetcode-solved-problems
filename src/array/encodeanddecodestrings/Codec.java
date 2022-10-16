package array.encodeanddecodestrings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Codec {
    public static void main(String[] args) {

        decode(encode(Arrays.asList(new String[]{"Hello","World"})));
    }

    // Encodes a list of strings to a single string.
    //TC= o(n), SC=o(n)
    public static  String encode(List<String> strs) {
        StringBuilder encoded = new StringBuilder();
        for (String str : strs) {
            encoded.append(str.length()).append("#").append(str);

        }
        return encoded.toString();
    }

    // Decodes a single string to a list of strings.
    public static  List<String> decode(String s) {
        List<String> decoded = new ArrayList<>();
        int i = 0;
        while (i < s.length()) {
            int j = i;
            while (s.charAt(j) != '#')
                j++;
            int length = Integer.valueOf(s.substring(i, j));
            i = j + length + 1;
            decoded.add(s.substring(j + 1, i));

        }
        return decoded;

    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(strs));