package common.test;

public class SingleTon {
    private static SingleTon instance;

    private SingleTon() {
        // super();
        System.out.println("instance created");
    }

    public static synchronized SingleTon getInstance() {

        if (instance == null)
            instance = new SingleTon();
        return instance;
    }

    public static SingleTon getInstanceFast() {

        if (instance == null) {
            synchronized (SingleTon.class) {
                if (instance == null)
                    instance = getInstance();
            }
        }
        return instance;
    }
}
