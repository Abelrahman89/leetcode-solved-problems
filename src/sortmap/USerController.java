package sortmap;


import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class USerController {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Emma", "Oliver", "Robert",   "James","Jone", "Emma","smith", "Patricia", "Sara","Oliver");
        HashMap<String,Integer> occurrences = new HashMap<>();

        for(String name: names)
            occurrences.put(name, occurrences.getOrDefault(name,0)+1);

        System.out.println(occurrences);
    }

}


