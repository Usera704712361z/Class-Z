package com.hspedu_20.tankgame_06;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Vector;

//为了让Panel不停的重绘子弹，需要将 MyPanel 实现Runnable，当作一个线程使用
public class MyPanel extends JPanel implements KeyListener, Runnable {
    //定义己方坦克
    Hero hero = null;
    Vector<EnemyTank> enemyTanks = new Vector<>();//用于存放多个敌方坦克
    //定义一个存放Node 对象的Vector， 用于恢复敌人坦克的坐标和方向
    Vector<Node> nodes = new Vector<>();
    //定义一个Vector，用于存放炸弹
    //当子弹击中坦克时，加入一个Bomb对象到bombs
    Vector<Bomb> bombs = new Vector<>();
    int enemyTankSize = 3;

    //定义三张炸弹图片， 用于显示爆炸效果
    Image image1 = null;
    Image image2 = null;
    Image image3 = null;



    public MyPanel(String key) {
        nodes = Recorder.getNodesAndEnemyTankRec();
        //将MyPanel对象的 enemyTanks 设置给 Recorder 的 enemyTanks
        Recorder.setEnemyTanks(enemyTanks);
        hero = new Hero(500, 500);//初始化己方坦克

        switch(key) {
            case "1":
                for (int i = 0; i < enemyTankSize; i++) {
                    //初始化敌方坦克
                    EnemyTank enemyTank = new EnemyTank((100 * (i + 1)), 0);
                    //将enemyTanks 设置给 enemyTank !!!
                    enemyTank.setEnemyTanks(enemyTanks);
                    enemyTank.setDirect(2);
                    //启动敌人坦克线程，让它动起来
                    Thread thread = new Thread(enemyTank);
                    thread.start();
                    //给该enemyTank 加入一颗子弹
                    Shot shot = new Shot(enemyTank.getX() + 20, enemyTank.getY() + 60, enemyTank.getDirect());
                    //加入enemyTank的Vector 成员
                    enemyTank.shots.add(shot);
                    //启动 shot 对象
                    new Thread(shot).start();
                    enemyTanks.add(enemyTank);
                }
                break;
            case "2"://继续上局游戏
                for (int i = 0; i < nodes.size(); i++) {
                    Node node = nodes.get(i);
                    //初始化敌方坦克
                    EnemyTank enemyTank = new EnemyTank(node.getX(), node.getY());
                    //将enemyTanks 设置给 enemyTank !!!
                    enemyTank.setEnemyTanks(enemyTanks);
                    enemyTank.setDirect(node.getDirect());
                    //启动敌人坦克线程，让它动起来
                    Thread thread = new Thread(enemyTank);
                    thread.start();
                    //给该enemyTank 加入一颗子弹
                    Shot shot = new Shot(enemyTank.getX() + 20, enemyTank.getY() + 60, enemyTank.getDirect());
                    //加入enemyTank的Vector 成员
                    enemyTank.shots.add(shot);
                    //启动 shot 对象
                    new Thread(shot).start();
                    enemyTanks.add(enemyTank);
                }
                break;
                default:
                    System.out.println("你的输入有误...");
        }


        //初始化图片对象
        image1 = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/bomb_1.gif"));
        image2 = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/bomb_2.gif"));
        image3 = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/bomb_3.gif"));
    }

    //编写方法，显示己方击毁敌方坦克的信息
    public void showInfo(Graphics g) {
        //画出玩家的总成绩
        g.setColor(Color.BLACK);
        Font font = new Font("宋体", Font.BOLD, 25);
        g.setFont(font);

        g.drawString("您累计击毁敌方坦克", 1020, 30);
        drawTank(1020, 60, g, 0, 0);//画出一个敌方坦克
        g.setColor(Color.BLACK);
        g.drawString(Recorder.getAllEnemyTankNum() + "", 1080, 100);
    }


    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillRect(0, 0, 1000, 750);//填充矩形，游戏区域的绘制
        showInfo(g);
        if(hero != null && hero.isLive) {
            //画出己方坦克-封装方法
            drawTank(hero.getX(), hero.getY(), g, hero.getDirect(), 1);
            hero.setSpeed(10);
        }


        //画出hero射击的子弹
//        if (hero.shot != null && hero.shot.isLive != false) {
//            //g.fill3DRect(hero.shot.x, hero.shot.y, 1, 1, false);
//            g.draw3DRect(hero.shot.x, hero.shot.y, 1, 1, false);
//        }

        //将hero的子弹合集 shots， 遍历取出绘制
        for (int i = 0; i < hero.shots.size(); i++) {
            Shot shot = hero.shots.get(i);
            if(shot != null && shot.isLive == true) {
                g.fill3DRect(shot.x, shot.y, 1, 1, false);
            } else {//如果该shot对象已经无效，就从shots集合中拿掉
                hero.shots.remove(shot);
            }
        }

        //如果bombs集合中有对象，就画出
        for (int i = 0; i < bombs.size(); i++) {
            //取出炸弹
            Bomb bomb = bombs.get(i);
            //根据当前这个bomb对象的life值去画出对应的图片
            if (bomb.life > 6) {
                g.drawImage(image1, bomb.x, bomb.y, 60, 60, this);
            } else if (bomb.life > 3) {
                g.drawImage(image2, bomb.x, bomb.y, 60, 60, this);
            } else {
                g.drawImage(image3, bomb.x, bomb.y, 60, 60, this);
            }
            bomb.lifeDown();
            //如果bomb life 为0，就从bombs的集合中删除
            if (bomb.life == 0) {
                bombs.remove(bomb);
            }
        }

        //画出敌方坦克，遍历Vector
        for (int i = 0; i < enemyTanks.size(); i++) {
            //从Vector 取出坦克
            EnemyTank enemyTank = enemyTanks.get(i);
            //判断当前坦克是否还存活
            if (enemyTank.isLive) {//当敌方坦克存活，才画出该坦克
                drawTank(enemyTank.getX(), enemyTank.getY(), g, enemyTank.getDirect(), 0);
                //画出 enemyTank 所有子弹
                for (int j = 0; j < enemyTank.shots.size(); j++) {
                    //取出子弹
                    Shot shot = enemyTank.shots.get(j);
                    //绘制
                    if (shot.isLive) {//isLive = true
                        g.draw3DRect(shot.x, shot.y, 1, 1, false);
                    } else {
                        //从Vector 移除
                        enemyTank.shots.remove(shot);
                    }
                }
            }
        }
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
            case 0://敌方坦克
                g.setColor(Color.cyan);
                break;
            case 1://己方坦克
                g.setColor(Color.yellow);
                break;
        }
        //根据坦克的方向绘制坦克
        //direct表示方向（0: 向上 1 向右 2 向下 3 向左）
        switch (direct) {
            case 0://表示向上
                g.fill3DRect(x, y, 10, 60, false);
                g.fill3DRect(x + 30, y, 10, 60, false);
                g.fill3DRect(x + 10, y + 10, 20, 40, false);
                g.fillOval(x + 10, y + 20, 20, 20);
                g.drawLine(x + 20, y + 30, x + 20, y);
                break;
            case 1://表示向右
                g.fill3DRect(x, y, 60, 10, false);
                g.fill3DRect(x, y + 30, 60, 10, false);
                g.fill3DRect(x + 10, y + 10, 40, 20, false);
                g.fillOval(x + 20, y + 10, 20, 20);
                g.drawLine(x + 30, y + 20, x + 60, y + 20);
                break;
            case 2://表示向下
                g.fill3DRect(x, y, 10, 60, false);
                g.fill3DRect(x + 30, y, 10, 60, false);
                g.fill3DRect(x + 10, y + 10, 20, 40, false);
                g.fillOval(x + 10, y + 20, 20, 20);
                g.drawLine(x + 20, y + 30, x + 20, y + 60);
                break;
            case 3://表示向下
                g.fill3DRect(x, y, 60, 10, false);
                g.fill3DRect(x, y + 30, 60, 10, false);
                g.fill3DRect(x + 10, y + 10, 40, 20, false);
                g.fillOval(x + 20, y + 10, 20, 20);
                g.drawLine(x + 30, y + 20, x, y + 20);
                break;
            default:
                System.out.println("暂时没有处理");
        }
    }

    //如果我们坦克可以发射多个子弹
    //在判断我放子弹是否击中敌人坦克时，就需要把我们的子弹集合中
    //所有的子弹，都取出和敌人的所有坦克，进行判断
    public void hitEnemyTank() {
        //遍历我们的子弹
        for(int j = 0; j < hero.shots.size(); j++) {
            Shot shot = hero.shots.get(j);
            //判断是否击中敌方坦克
            if (shot != null && shot.isLive) {//当己方的子弹还活着
                //遍历敌方所有的坦克
                for (int i = 0; i < enemyTanks.size(); i++) {
                    EnemyTank enemyTank = enemyTanks.get(i);
                    hitTank(shot, enemyTank);
                }
            }
        }
    }

    //编写方法，判断敌方坦克是否击中我方坦克
    public void hitHero() {
        //遍历所有的敌方坦克
        for (int i = 0; i < enemyTanks.size(); i++) {
            //取出敌方坦克
            EnemyTank enemyTank = enemyTanks.get(i);
            //遍历enemyTank 对象的所有子弹
            for (int j = 0; j < enemyTank.shots.size(); j++) {
                //取出子弹
                Shot shot = enemyTank.shots.get(j);
                //判断 shot 是否击中我方坦克
                if(hero.isLive && shot.isLive) {
                    hitTank(shot, hero);
                }
            }
        }
    }



    //编写方法，判断己方的子弹是否击中敌人坦克(什么时候判断？)
    public void hitTank(Shot s, Tank tank) {
        //判断s 击中坦克
        switch (tank.getDirect()) {
            case 0://上
            case 2://下
                if (s.x > tank.getX() && s.x < tank.getX() + 40 && s.y > tank.getY()
                        && s.y < tank.getY() + 60) {
                    s.isLive = false;
                    tank.isLive = false;
                    //当己方子弹击中敌方坦克后，将enemyTank从Vector中拿掉
                    enemyTanks.remove(tank);
                    //当己方击毁一个敌方坦克时， 就对数据 allEnemyTankNum++
                    //因为 tank 可以是 Hero 也可以是 EnemyTank
                    if(tank instanceof EnemyTank) {
                        Recorder.addAllEnemyTankNum();
                    }
                    Bomb bomb = new Bomb(tank.getX(), tank.getY());
                    bombs.add(bomb);
                }
                break;
            case 1://右
            case 3://左
                if (s.x > tank.getX() && s.x < tank.getX() + 60 && s.y > tank.getY()
                        && s.y < tank.getY() + 40) {
                    s.isLive = false;
                    tank.isLive = false;
                    enemyTanks.remove(tank);
                    //当己方击毁一个敌方坦克时， 就对数据 allEnemyTankNum++
                    //因为 tank 可以是 Hero 也可以是 EnemyTank
                    if(tank instanceof EnemyTank) {
                        Recorder.addAllEnemyTankNum();
                    }
                    Bomb bomb = new Bomb(tank.getX(), tank.getY());
                    bombs.add(bomb);
                }
                break;
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_W) {
            hero.setDirect(0);
            if (hero.getY() > 0) {
                hero.moveUp();
            }
        } else if (e.getKeyCode() == KeyEvent.VK_D) {
            hero.setDirect(1);
            if (hero.getX() + 60 < 1000) {
                hero.moveRight();
            }
        } else if (e.getKeyCode() == KeyEvent.VK_S) {
            hero.setDirect(2);
            if (hero.getY() + 60 < 750) {
                hero.moveDown();
            }
        } else if (e.getKeyCode() == KeyEvent.VK_A) {
            hero.setDirect(3);
            if (hero.getX() > 0) {
                hero.moveLeft();
            }
        }
        //如果用户按下J键，就发射
        if (e.getKeyCode() == KeyEvent.VK_J) {
            //判断hero的子弹是否销毁
//            if (hero.shot == null || !hero.shot.isLive) {
//                hero.shotEnemy();
//            }
            hero.shotEnemy();
        }
        this.repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void run() {//每隔100毫秒，重绘区域，刷新绘图区域，子弹移动
        while (true) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            hitEnemyTank();
            hitHero();
            this.repaint();
        }
    }
}
