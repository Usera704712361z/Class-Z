package com.hspedu_18.tankgame_04;

public class Shot implements Runnable {
    int x;//子弹的x坐标
    int y;//子弹的y坐标
    int direct = 0;//子弹的方向
    int speed = 2;//子弹的速度
    boolean isLive = true;//子弹是否存活


    public Shot(int x, int y, int direct) {
        this.x = x;
        this.y = y;
        this.direct = direct;
    }

    @Override
    public void run() {//射击
        while (true) {
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            switch(direct) {
                case 0://上
                    y -= speed;
                    break;
                case 1://右
                    x += speed;
                    break;
                case 2://下
                    y += speed;
                    break;
                case 3://左
                    x -= speed;
                    break;
            }
            System.out.println("x = " + x + "，y = " + y);
            //当子弹碰到敌方坦克时，也应该结束
            if(!(x >= 0 && x <= 1000 && y >= 0 && y <= 750 && isLive)) {
                isLive = false;
                System.out.println("子弹线程结束");
                break;
            }
        }
    }
}
