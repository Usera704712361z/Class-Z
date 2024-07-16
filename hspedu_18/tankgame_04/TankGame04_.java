package com.hspedu_18.tankgame_04;

import javax.swing.*;

public class TankGame04_ extends JFrame {
    MyPanel mp = null;

    public static void main(String[] args) {
        TankGame04_ tankGame04 = new TankGame04_();
    }

    public TankGame04_() {
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
