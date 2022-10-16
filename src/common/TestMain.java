package common;

import common.testingaditi.Person;

import java.util.*;

public class TestMain {
    public static <K, V> Map<K, V> sortByKeys(Map<K, V> unsortedMap)
    {
        // construct a `TreeMap` from the given map and return it
        return new TreeMap<>(unsortedMap);
    }
    public static void main(String[] args) {
        Map<String, String> country = new HashMap<>();

        country.put("India", "New Delhi");
        country.put("USA", "Washington D.C.");
        country.put("Japan", "Tokyo");
        country.put("China", "Beijing");
        System.out.println("Sorted map by keys :\n" + country);
        country = sortByKeys(country);
        System.out.println("Sorted map by keys :\n" + country);
        System.out.println(new TreeMap<>(country));
//        String s = "abdahdbsfhybksd";
//      // s.chars().collect(Collectors.groupingBy(), , );
//        LocalDate dt= LocalDate.now();
//        String dd=dt.getYear() + "-"+dt.getMonthValue();
//        String year=String.valueOf(dt.getYear());
//        String x= "07";
//        int rr=Integer.parseInt(x);
//        System.out.println(rr);
//        System.out.println(dd);
       /* List<Integer> l = new ArrayList<Integer>() {
            {
                add(5);
                add(6);

            }
        };
        LinkedList<Integer> linkedList = new LinkedList<>();

        Set<Integer> h = new HashSet<>();
        h.add(5);
        h.add(5);
        h.add(7);
        h.add(10);
        System.out.println(h);
        h.remove(7);
        System.out.println(h);
        System.out.println(l);

        Person[] a = new Person[50];

//        try{
//            System.out.println(5/0);
//        }
//        catch (Exception e){
//            System.out.println("ddfdf");
//            //System.exit(0);
//        }
//        finally {
//            System.out.println("finally");
//        }

        */
    }
}
