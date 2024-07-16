package com.hspedu_17.threaduse_.method;

public class ThreadMethodExercise {
    public static void main(String[] args) throws InterruptedException {
        Thread t3 = new Thread(new T3());
        for (int i = 1; i <= 10; i++) {
            System.out.println("hi " + i);
            if(i == 5) {
                t3.start();
                t3.join();
            }
            Thread.sleep(1000);
        }
    }
}
class T3 implements Runnable {
    private int countNum = 0;
    @Override
    public void run() {
        while(true) {
            System.out.println("hello " + (++countNum));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if(countNum == 10) {
                break;
            }
        }
    }
}