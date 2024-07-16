package com.hspedu_17.threaduse_;

public class Thread02 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Thread thread = new Thread(dog);
        thread.start();
    }
}
class Dog implements Runnable {
    int count = 0;

    @Override
    public void run() {
        while(true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("小狗汪汪叫～" + ++count);
            if(count == 10) {
                break;
            }
        }
    }
}
