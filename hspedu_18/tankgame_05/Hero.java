package com.hspedu_18.tankgame_05;

import java.util.Vector;

public class Hero extends Tank {
    Shot shot = null;
    Vector<Shot> shots = new Vector<>();

    public Hero(int x, int y) {
        super(x, y);
    }
    public void shotEnemy() {
        //控制子弹个数
        if(shots.size() == 5) {
            return;
        }
        switch(getDirect()) {
            case 0://上
                shot = new Shot(getX() + 20, getY(), 0);
                break;
            case 1://右
                shot = new Shot(getX() + 60, getY() + 20, 1);
                break;
            case 2://下
                shot = new Shot(getX() + 20, getY() + 60, 2);
                break;
            case 3://左
                shot = new Shot(getX(), getY() + 20, 3);
                break;
        }
        //把新创建的shot放入到送他的
        shots.add(shot);
        new Thread(shot).start();
    }
}
