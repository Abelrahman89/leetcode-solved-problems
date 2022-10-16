package common.testThread.threads;

public class InterviewBitThreadExample2 implements Runnable {
    public void run() {
        System.out.println("Thread runs...");
    }

    public static void main(String args[]) {
        Thread ib = new Thread(new InterviewBitThreadExample2());
        ib.start();
    }
}
