package array.lemonadeChange;

import java.util.HashMap;
import java.util.Map;

public class LemonadeChange {
    public static void main(String[] args) {
        System.out.println(lemonadeChange(new int[]{5, 5, 10, 10, 20}));
    }

    public static boolean lemonadeChange(int[] bills) {
        int fiveCount = 0, tenCount = 0;
        for (int i = 0; i < bills.length; i++) {
            if (bills[i] == 5)
                fiveCount++;
            else if (bills[i] == 10) {
                if (fiveCount < 1)
                    return false;
                else {
                    fiveCount--;
                    tenCount++;
                }
            } else if (bills[i] == 20) {
                if (fiveCount < 1 && tenCount < 1)
                    return false;
                else {
                    if (tenCount >= 1 && fiveCount > 0) {
                        fiveCount--;
                        tenCount--;

                    } else if (fiveCount >= 3) {
                        fiveCount -= 3;
                    } else
                        return false;
                }
            }
        }
        return true;

    }

    public static boolean lemonadeChange2(int[] bills) {
        if (bills[0] >= 10)
            return false;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(5, 0);
        map.put(10, 0);
        map.put(20, 0);

        for (int i = 0; i < bills.length; i++) {
            map.put(bills[i], map.get(bills[i]) + 1);
            if (bills[i] == 10) {
                if (map.get(5) < 1)
                    return false;
                else {
                    map.put(5, map.get(5) - 1);
                }
            }
            if (bills[i] == 20) {
                if (map.get(10) < 1 && map.get(5) < 3)
                    return false;
                else if (map.get(5) < 1 && map.get(10) > 1)
                    return false;
                else {
                    if (checkMapChange(map) == false)
                        return false;
                    else
                        continue;
                }
            }

        }
        return true;


    }

    private static boolean checkMapChange(Map<Integer, Integer> map) {
        if (map.get(5) >= 3 || (map.get(10) >= 1 && map.get(5) > 0)) {
            if (map.get(10) >= 1 && map.get(5) > 0) {
                map.put(20, map.get(20) - 1);
                map.put(5, map.get(5) - 1);
                map.put(10, map.get(10) - 1);

            } else {
                map.put(20, map.get(20) - 1);
                map.put(5, map.get(5) - 3);
            }

        } else
            return false;

        return true;
    }
}
