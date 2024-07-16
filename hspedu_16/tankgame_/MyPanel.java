package com.hspedu_16.tankgame_;

import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel {
    //定义己方坦克
    Hero hero = null;

    public MyPanel() {
        hero = new Hero(100, 100);//初始化自己的坦克
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillRect(0, 0, 1000, 750);//填充矩形，游戏区域的绘制
        drawTank(hero.getX(), hero.getY(), g, 0, 0);//画出坦克
    }

    /**
     * 下面方法是绘制坦克的方法
     *
     * @param x      坦克的左上角x坐标
     * @param y      坦克的左上角y坐标
     * @param g      画笔
     * @param direct 坦克的方向（上下左右）
     * @param type   坦克的类型
     */
    public void drawTank(int x, int y, Graphics g, int direct, int type) {
        //根据不同类型坦克，设置不同的颜色
        switch (type) {
            case 0://己方的坦克
                g.setColor(Color.cyan);
                break;
            case 1://敌方坦克
                g.setColor(Color.yellow);
                break;
        }
        //根据坦克的方向绘制坦克
        switch (direct) {
            case 0://表示向上
                g.fill3DRect(x, y, 10, 60, false);
                g.fill3DRect(x + 30, y, 10, 60, false);
                g.fill3DRect(x + 10, y + 10, 20, 40, false);
                g.fillOval(x + 10, y + 20, 20, 20);
                g.drawLine(x + 20, y + 30, x + 20, y);
                break;
            default:
                System.out.println("暂时没有处理");
        }
    }
}
