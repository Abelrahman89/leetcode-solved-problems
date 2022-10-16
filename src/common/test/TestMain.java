package common.test;

import java.util.*;

public class TestMain {
//    public static  boolean canBeConnected(Friend friend) {
//        Queue<Friend> queue = new LinkedList<>();
//        queue.add(friend);
//        Set<Friend> visited = new HashSet<>();
//        while (!queue.isEmpty()) {
//            Friend cur = queue.poll();
//            visited.add(cur);
//            Collection<Friend> temp = cur.getFriends();
//            for (Friend m : temp) {
//                if (visited.contains(m))
//                    continue;
//                if (this.friends.contains(cur))
//                    return true;
//                visited.add(m);
//                queue.add(m);
//            }
//        }
//        return false;
//    }
  public static  int maxSize(List<Integer> l) {
        Collections.sort(l);
        Map<Integer, List<Integer>> map = new HashMap<>();
        Set<Integer> s = new HashSet<>();

        for (int i = 0; i < l.size(); i++) {
         //int s=Math.sqrt(l.get(i));

            if (map.containsKey((int) Math.sqrt(l.get(i))) || s.contains((int) Math.sqrt(l.get(i)))) {
                map.get(i).add(l.get(i));
                s.add(l.get(i));
            } else if (s.contains((int) Math.sqrt(l.get(i)))) {
                map.get(i).add(l.get(i));
                s.add(l.get(i));
            } else {

                map.put(l.get(i), new ArrayList<>());
            }
        }


        return 0;

    }

    double methodA(byte x, double y) /* Line 3 */ {
        return (long) x / y * 2;
    }

    public static void main(String[] args) {
        LinkedList<String> animals = new LinkedList<>();

        // Add elements to LinkedList
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Cow");
        System.out.println("LinkedList: " + animals);

        System.out.println((int) Math.sqrt(4));
        List<Integer> l = new ArrayList<>();
        l.add(3);
        l.add(9);
        l.add(4);
        l.add(2);
        l.add(16);


    //    System.out.println(maxSize(l));
        HashMap<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();
        map.get("letter").add("ahmed");
        map.put("letter", map.get("letter"));
        /* SingleTon ***********************
//        System.out.println(SingleTon.getInstance());
//        System.out.println(SingleTon.getInstance());
//        System.out.println(SingleTon.getInstance());
//        System.out.println(SingleTon.getInstance());
      //  Stream.iterate(1,i->i+1).limit(1000).forEach(i->SingleTon.getInstance());
        //parallel
//        long start=System.currentTimeMillis();
//        //Stream.iterate(1,i ->i+1 ).limit(100000).parallel().forEach(i-> SingletonWithLazyInstantiation.getInstance());
//
//
//        Stream.iterate(1,i->i+1).limit(10000000).parallel().forEach(i->SingleTon.getInstance());
//        long end=System.currentTimeMillis();
//        System.out.println(end-start);
//
//        start=System.currentTimeMillis();
//        Stream.iterate(1,i->i+1).limit(10000000).parallel().forEach(i->SingleTon.getInstanceFast());
//         end=System.currentTimeMillis();
//        System.out.println(end-start);
        /* SingleTon ***********************

         */
//        c1 i = new c1();
//        i.m2();
//        MyStack<Integer> myStack = new MyStack<>();
//        myStack.push(3434);
//        myStack.push(55);
//        System.out.println(myStack.pop());
//
//        MyQueue<Integer> myQueue = new MyQueue<>();
//        myQueue.push(1111);
//        myQueue.push(4444);
//        System.out.println(myQueue.pop());

//  int []arr=new int[]{5,1,4,3};
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));

//        String s1="Hello";
//        String s2=new String("Hello");
//        String s3="Hello";
//        System.out.println(s1==s2); //false
//        System.out.println(s1.equals(s2));//true
//        System.out.println(s1==s3); //true
//        System.out.println(Integer.toHexString(s1.hashCode()));//42628b2
//        System.out.println(Integer.toHexString(s3.hashCode()));//42628b2
//        System.out.println(Integer.toHexString(s2.hashCode()));//42628b2
//        System.out.println(7*Math.log(7));
//
//        System.out.println(System.identityHashCode(s1));
//        System.out.println(System.identityHashCode(s2));
//        System.out.println(System.identityHashCode(s3));


    }

}

