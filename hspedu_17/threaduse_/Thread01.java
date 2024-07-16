package com.hspedu_17.threaduse_;

public class Thread01 {
    public static void main(String[] args) throws InterruptedException {
        Cat cat = new Cat();
        cat.start();

        System.out.println("主线程继续执行" + Thread.currentThread().getName());
        for (int i = 0; i < 20; i++) {
            System.out.println("主线程 i=" + i);
            Thread.sleep(1000);
        }
    }
}

class Cat extends Thread {
    int times = 0;

    @Override
    public void run() {
        while (true) {
            System.out.println("小猫喵喵叫～" + ++times);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if (times == 8) {
                break;
            }
        }
    }
}
