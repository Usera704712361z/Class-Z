package com.hspedu_16.tankgame_;

import javax.swing.*;

public class TankGame01_ extends JFrame {
    MyPanel mp = null;

    public static void main(String[] args) {
        TankGame01_ tankGame01 = new TankGame01_();
    }

    public TankGame01_() {
        mp = new MyPanel();
        this.add(mp);
        this.setSize(1000, 750);//绘制游戏区域
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
