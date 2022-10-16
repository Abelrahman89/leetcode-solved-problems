package common.testThread.threads;

class InterviewBitThreadExample extends Thread{
    public void run(){
        System.out.println("Thread runs...");
    }
    public static void main(String args[]){
        InterviewBitThreadExample ib = new InterviewBitThreadExample();
        ib.start();
    }
}