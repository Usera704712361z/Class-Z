package com.hspedu_18.tankgame_05;

import java.util.Vector;

public class EnemyTank extends Tank implements Runnable {
    //在敌人坦克类，使用Vector 保存多个Shot
    Vector<Shot> shots = new Vector<>();
    boolean isLive = true;

    public EnemyTank(int x, int y) {
        super(x, y);
    }

    @Override
    public void run() {
        while (true) {

            //这里判断如果shot size() = 0，就创建一颗子弹,放入到shots集合中并启动
            if (isLive && shots.size() < 5) {

                Shot s = null;

                //判断坦克的方向，创建对应的子弹
                switch (getDirect()) {
                    case 0://上
                        s = new Shot(getX() + 20, getY(), 0);
                        break;
                    case 1://右
                        s = new Shot(getX() + 60, getY() + 20, 1);
                        break;
                    case 2://下
                        s = new Shot(getX() + 20, getY() + 60, 2);
                        break;
                    case 3://左
                        s = new Shot(getX(), getY() + 20, 0);
                        break;
                }
                shots.add(s);
                new Thread(s).start();
            }

            //根据坦克的方向来继续移动
            switch (getDirect()) {
                case 0://上
                    //让坦克保持一个方向走30步
                    for (int i = 0; i < 30; i++) {
                        if (getY() > 0) {
                            moveUp();
                        }
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    break;
                case 1://右
                    for (int i = 0; i < 30; i++) {
                        if (getX() + 60 < 1000) {
                            moveRight();
                        }
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    break;
                case 2://下
                    for (int i = 0; i < 30; i++) {
                        if (getY() + 60 < 750) {
                            moveDown();
                        }
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    break;
                case 3://左
                    for (int i = 0; i < 30; i++) {
                        if (getX() > 0) {
                            moveLeft();
                        }
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    break;
            }

            //然后随机的改变坦克方向0-3
            setDirect((int) (Math.random() * 4));
            //写并发程序，一定要考虑清楚，该线程什么时候结束
            if (!isLive) {
                break;
            }
        }
    }
}
