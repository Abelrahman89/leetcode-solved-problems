package common.martin;

import java.util.*;

public class MainApp {
    public static void main(String[] args) {
        List<Country>l=new ArrayList<>();
        l.add(new Country("India"));
        l.add(new Country("USA"));
        l.add(new Country("India"));
        l.add(new Country("Russia"));
        l.add(new Country("Egypt"));
        l.add(new Country("Morroco"));
        l.add(new Country("Egypt"));
        l.add(new Country("-1"));

        HashMap<String,Integer> map=new HashMap<>();
     //   map=l.stream().mapTo.collect(Collectors.groupingBy(c->c.getName(),Collectors.counting()));
        for(Country c : l){
            map.put(c.getName(),map.getOrDefault(c.getName(),0)+1);

        }
        System.out.println(map);
        map.forEach((k,v)->{
            if(v > 1){
                System.out.println(k+" : "+v);
            }
        });
    }
}
