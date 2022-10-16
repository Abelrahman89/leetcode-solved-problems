package string.romanToInt;

import java.util.HashMap;
import java.util.Map;

public class RomanToInt {
    public static void main(String[] args) {
        System.out.println(romanToInt("IIIV"));
    }

    public static  int romanToInt(String s) {
        int result = 0;
        Map<Character, Integer> map = new HashMap<>();

        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int valueBefore =50000;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (map.containsKey(c)) {
                if (map.get(c) > valueBefore)
                    result += map.get(c) - (valueBefore * 2);
                else {
                    result += map.get(c);
                    valueBefore = map.get(c);
                }
            }

        }
        return result;


    }

}
