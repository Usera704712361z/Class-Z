package com.hspedu_16.Draw_;

import javax.swing.*;
import java.awt.*;
@SuppressWarnings({"all"})
public class DrawCircle_ extends JFrame {
    private MyPanel mp = null;
    public static void main(String[] args) {
        new DrawCircle_();
    }
    public DrawCircle_() {
        mp = new MyPanel();
        this.add(mp);
        this.setSize(400,300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}

class MyPanel extends JPanel {
    public void paint(Graphics g) {
        super.paint(g);
        g.drawOval(10, 10, 100, 100);

        //g.drawLine(10, 10, 100, 100);

        //g.drawRect(10, 10, 100, 100);

        //g.setColor(Color.blue);
        //g.fillRect(10, 10, 100, 100);

        //g.setColor(Color.red);
        //g.fillOval(10, 10, 50, 100);

        //Image image = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/bg.png"));
        //g.drawImage(image, 10, 10, 175, 221, this);

        //g.setColor(Color.red);
        //g.setFont(new Font("隶书", Font.BOLD,50));
        //g.drawString("hello Japan", 50, 100);

//        g.setColor(Color.blue);
//        g.fillRect(10, 10, 15, 60);
//        g.fillRect(50, 10, 15, 60);
//
//        g.fillRect(25, 25, 25,30);
//        g.drawOval(30, 30, 15, 15);
//        g.drawLine(37, 10, 37, 40);
    }
}
