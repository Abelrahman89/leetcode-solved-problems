package testingRevision.singleton;

import java.util.stream.Stream;

public class MySingleTon {

    private static volatile  MySingleTon instance;

    private MySingleTon() {
        System.out.println("instance" + this);
    }

    public static  MySingleTon getInstance() {

        if (instance == null) {
            synchronized (MySingleTon.class) {
                if (instance == null)
                    instance = new MySingleTon();
            }

        }
        return instance;
    }

    public static void main(String[] args) {
//        for (int i = 0; i < 10; i++) {
//            MySingleTon.getInstance();
//        }

        Long timeBefore = System.currentTimeMillis();
        Stream.iterate(1, (i) -> i + 1).limit(1000000).parallel().forEach(l -> MySingleTon.getInstance());
        Long timeAfter = System.currentTimeMillis();
        System.out.println(timeAfter - timeBefore);
    }
}
