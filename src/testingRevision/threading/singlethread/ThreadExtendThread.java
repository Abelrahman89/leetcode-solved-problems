package testingRevision.threading.singlethread;

public class ThreadExtendThread extends Thread {

    @Override
    public void run() {

        for (int i = 0; i < 10; i++) {
            System.out.println(" i = " + i);
        }
    }

    public static void main(String[] args) {
        System.out.println("Starting Thread thread");
        ThreadExtendThread threadExtendThread = new ThreadExtendThread();
        threadExtendThread.start();
     //   threadExtendThread.run();
        System.out.println("ending Thread thread");
    }
}
