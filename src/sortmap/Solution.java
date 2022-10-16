package sortmap;

import java.util.*;

import static java.util.Map.Entry.comparingByKey;
import static java.util.stream.Collectors.toMap;

public class Solution {
    public static void main(String[] args) {
        List<String> l =new ArrayList<>();
        l.add("aas");
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Jayant", 80);
        map.put("Abhishek", 90);
        map.put("Anushka", 80);
        map.put("Amit", 75);
        map.put("Danish", 40);
        System.out.println(map);
     //   map.entrySet().stream().sorted(Comparator.comparing((a,b)-> a.getKey().compareTo(b.)))

        map.entrySet()
                .stream()
                .sorted(Map.Entry.<String, Integer>comparingByKey())
                .forEach(System.out::println);

        Map sorted = map .entrySet() .stream() .sorted(comparingByKey())
        .collect(toMap(e -> e.getKey(), e -> e.getValue(), (e1, e2) -> e2));

        //System.out.println(map);
    }

}
