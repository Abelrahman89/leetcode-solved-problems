package testingRevision.threading.singlethread;

public class ThreadRunnable implements Runnable{


    @Override
    public void run(){
        for (int i = 0; i < 10 ; i++) {
            System.out.println(" i = " + i);
        }
    }

    public static void main(String[] args) {
        System.out.println("Starting runnable thread");
        Thread  threadRunnable = new Thread(new ThreadRunnable());

        threadRunnable.start();
        System.out.println("ending runnable thread");
    }
}
