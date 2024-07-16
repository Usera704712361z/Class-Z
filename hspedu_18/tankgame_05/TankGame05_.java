package com.hspedu_18.tankgame_05;

import javax.swing.*;

public class TankGame05_ extends JFrame {
    MyPanel mp = null;

    public static void main(String[] args) {
        TankGame05_ tankGame05 = new TankGame05_();
    }

    public TankGame05_() {
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
