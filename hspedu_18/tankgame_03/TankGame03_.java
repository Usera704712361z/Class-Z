package com.hspedu_18.tankgame_03;

import javax.swing.*;

public class TankGame03_ extends JFrame {
    MyPanel mp = null;

    public static void main(String[] args) {
        TankGame03_ tankGame03 = new TankGame03_();
    }

    public TankGame03_() {
        mp = new MyPanel();
        Thread thread = new Thread(mp);
        thread.start();
        this.add(mp);
        this.setSize(1000, 750);//绘制游戏区域
        this.addKeyListener(mp);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
