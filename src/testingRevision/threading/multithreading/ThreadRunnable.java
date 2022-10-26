package testingRevision.threading.multithreading;

public class ThreadRunnable implements Runnable {
    private static int count;

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            count++;
            //   System.out.println(" i = " + i);
        }
    }

    public  int getCount() {
        return count;
    }

    public static void main(String[] args) {
        System.out.println("Starting runnable thread");
        Thread threadRunnable1 = new Thread(new ThreadRunnable());
        Thread threadRunnable2 = new Thread(new ThreadRunnable());
        threadRunnable1.start();
     //   System.out.println("Thread 1 count = "+threadRunnable1.getCount());
        System.out.println("ending runnable thread");
    }
}
