package com.hspedu_18.tankgame_04;

public class Bomb {
    int x, y;
    int life = 9;
    boolean isLive = true;

    public Bomb(int x, int y) {
        this.x = x;
        this.y = y;
    }

    //减少生命值
    public void lifeDown() {//配合出现图片的爆炸效果
        if(life > 0) {
            life--;
        } else {
            isLive = false;
        }
    }
}
