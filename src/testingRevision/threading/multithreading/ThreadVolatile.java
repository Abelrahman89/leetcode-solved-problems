package testingRevision.threading.multithreading;

public class ThreadVolatile extends Thread {
    private static volatile   boolean stop = false;

    @Override
    public void run() {
        while(!stop) {
            System.out.println("stop still not changed"+stop);
        }

    }

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Starting Thread thread");
        ThreadVolatile threadExtendThread1 = new ThreadVolatile();

        threadExtendThread1.start();
       // threadExtendThread1.join();
        stop =true;
        ThreadVolatile threadExtendThread2 = new ThreadVolatile();

        threadExtendThread2.start();
        System.out.println("finished");

    }
}
