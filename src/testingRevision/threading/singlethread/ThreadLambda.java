package testingRevision.threading.singlethread;

public class ThreadLambda {
    public static void main(String[] args) {
        System.out.println("Starting Thread thread");
        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(" i = " + i);
            }
        }).start();
        System.out.println("ending Thread thread");
    }
}
