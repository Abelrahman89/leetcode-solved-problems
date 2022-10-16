package testrandom;

import java.util.*;
import java.util.stream.Collectors;

public class MAinApp {
    //    public static void main(String[] args) {
//        List<String> l = Arrays.asList("Ahmed", "Khalifa", "Bdsds");
//        Long count = l.stream().filter(s -> s.startsWith("Ah")).collect(Collectors.counting());
//
//        Collections.sort(l,(s1,s2)->s1.compareTo(s2));
//        Collections.sort(l,(s1,s2)-> {
//        String c=s1+s2;
//        String f=s2+s1;
//        return c.compareTo(f);
//        });
////
////        Collections.sort(list, Comparator.comparing(Book::getAuthor)
////                .thenComparing(Comparator.comparing(Book::getName)));
////
////       String x = l.stream().map(Comparator.comparing(String::length)).
////                thenComparing(Comparator.naturalOrder()).reversed().toString();
//
//
//        System.out.println(count);
//        System.out.println(l);
//        l.stream().map(s -> s.toLowerCase()).sorted().forEach(System.out::println);
//    }
    static int myMethod(String[] strings, String prefix) {
        if (strings.length == 0)
            return 0;
        int count = 0;
        for (String s : strings) {
            if (s.startsWith(prefix))
                count++;
        }
        return count;
    }
    public static  String removeVowels(String str) {
        return str.replaceAll("[aeiouAEIOU]", "");
    }
    static int myMethod (int [] arr){


        HashMap<Integer,Integer> sum= new HashMap<>();
        for(Integer i : arr){
            if(sum.containsKey(i))
                sum.put(i,sum.get(i)+1);
            else
                sum.put(i,1);
        }
        int dupSum=0;

        for(Integer x: sum.keySet()){
            if(sum.get(x)>1)
                dupSum+=sum.get(x);
        }
        return dupSum;



    }
    public static int[] maxFrequency (List<Integer> list){

        HashMap <Integer,Integer> freq=new HashMap<>();

        for(Integer i : list){
            if(freq.containsKey(i))
                freq.put(i, freq.getOrDefault(i,0)+1);

            else
                freq.put(i,1);
        }

        int maxFreq=0, maxKey=0;

        for(Integer x: freq.keySet()){
            if(freq.get(x)>maxFreq){
                maxFreq=freq.get(x);
                maxKey=x;
            }
        }
        return new int[] {maxKey, maxFreq};
    }

    public static int maxOcc (int [] nums){
        int max = 0,count = 0,len=nums.length;

        for (int i=0 ; i<len ; i++){
            if (nums[i] == 1) {
                count++;
            }
            else {
                count = 0;
            }
            max = Math.max(max,count);
        }
        return max;
    }


        static void counterMethod(int[] arr) {

            Map<Integer, Integer> hm = new HashMap<>();

            for (Integer i : arr) {
                if (hm.containsKey(i))
                    hm.put(i, hm.get(i) + 1);

                else
                    hm.put(i, 1);
            }

            System.out.println(hm);
        }

    public static void main(String[] args) {
        int [] arr1 = new int [] {1, 2, 1, 2};
        counterMethod(arr1);

//        List<Integer> list1 = new ArrayList<>(List.of(1,1,1,1,2,3,4,4,4,4,4,4,5));
//        System.out.println(Arrays.toString(maxFrequency(list1)));
//        int [] a1 = new int[] {1,1,1,0,0,0,1,0,1,1,1,1};
//        System.out.println(maxOcc(a1));

        //int [] arr1 = new int[] {1,1,1,1,2,9,8,9,6,6,5,7};

      //  System.out.println(myMethod(arr1));
//        String[] stringArray = new String[]{"Hello", "Hence", "Hi", "Hero", "Holland", "Ready"};
//        String prefix = "H";
//String s="sdasdAkfekEl";
//        System.out.println(myMethod(stringArray, prefix));
//        System.out.println(removeVowels(s));
    }
}
