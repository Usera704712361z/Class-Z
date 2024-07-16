package com.hspedu_17.threaduse_.syn;

public class SellTicket {
    public static void main(String[] args) {
//        SellTicket01 sellTicket01 = new SellTicket01();
//        SellTicket01 sellTicket02 = new SellTicket01();
//        SellTicket01 sellTicket03 = new SellTicket01();
//
//        sellTicket01.start();
//        sellTicket02.start();
//        sellTicket03.start();
//        SellTicket02 sellTicket02 = new SellTicket02();
//        new Thread(sellTicket02).start();
//        new Thread(sellTicket02).start();
//        new Thread(sellTicket02).start();

        SellTicket03 sellTicket03 = new SellTicket03();
        new Thread(sellTicket03).start();
        new Thread(sellTicket03).start();
        new Thread(sellTicket03).start();
    }
}

//
class SellTicket03 implements Runnable {
    private int ticketNum = 100;
    private boolean loop = true;
    Object object = new Object();

    public /*synchronized*/ void sell() {//同步方法，在同一时刻，只能有一个线程来执行sell方法
        synchronized (/*this*/object) {
            if (ticketNum <= 0) {
                System.out.println("售票结束～");
                loop = false;
                return;
            }
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("窗口 " + Thread.currentThread().getName() + " 售出一张票" + " 剩余票数" + (--ticketNum));
        }
    }

    @Override
    public void run() {
        while (loop) {
            sell();
        }
    }
}
//class SellTicket01 extends Thread {
//    private static int ticketNum = 100;
//
//    @Override
//    public void run() {
//        while (true) {
//            if (ticketNum <= 0) {
//                System.out.println("售票结束～");
//                break;
//            }
//            try {
//                Thread.sleep(1);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//            System.out.println("窗口 " + Thread.currentThread().getName() + " 售出一张票" + " 剩余票数=" + (--ticketNum));
//        }
//    }
//}
//class SellTicket02 implements Runnable {
//    private int ticketNum = 100;
//
//    @Override
//    public void run() {
//        while(true) {
//            if(ticketNum <= 0) {
//                System.out.println("售票结束～");
//                break;
//            }
//            try {
//                Thread.sleep(50);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//            System.out.println("窗口 " + Thread.currentThread().getName() + " 售出一张票" + " 剩余票数" + (--ticketNum));
//        }
//    }
//}
