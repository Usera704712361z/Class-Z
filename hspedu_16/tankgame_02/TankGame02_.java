package com.hspedu_16.tankgame_02;

import javax.swing.*;

public class TankGame02_ extends JFrame {
    MyPanel mp = null;

    public static void main(String[] args) {
        TankGame02_ tankGame02 = new TankGame02_();
    }

    public TankGame02_() {
        mp = new MyPanel();
        this.add(mp);
        this.setSize(1000, 750);//绘制游戏区域
        this.addKeyListener(mp);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
