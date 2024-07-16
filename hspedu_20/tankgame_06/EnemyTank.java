package com.hspedu_20.tankgame_06;

import java.util.Vector;

public class EnemyTank extends Tank implements Runnable {
    //在敌人坦克类，使用Vector 保存多个Shot
    Vector<Shot> shots = new Vector<>();
    //增加成员，EnemyTank 可以得到敌方坦克的Vector
    Vector<EnemyTank> enemyTanks = new Vector<>();
    boolean isLive = true;

    public EnemyTank(int x, int y) {
        super(x, y);
    }

    //提供方法，可以将 MyPanel 的成员 Vector<EnemyTank> enemyTanks = new Vector<>();
    //设置到 EnemyTank 的成员 enemyTanks
    public void setEnemyTanks(Vector<EnemyTank> enemyTanks) {
        this.enemyTanks = enemyTanks;
    }

    //编写方法，判断当前敌方坦克，是否和 enemyTanks 中的其他坦克发生重叠或碰撞
    public boolean isTouchEnemyTank() {
        switch (this.getDirect()) {
            case 0://上
                //让当前敌方坦克和其他所有的敌方坦克比较
                for (int i = 0; i < enemyTanks.size(); i++) {
                    //从Vector 中取出一个敌方坦克
                    EnemyTank enemyTank = enemyTanks.get(i);
                    //不和自己比较
                    if (enemyTank != this) {
                        //如果敌方坦克是 上/下
                        //如果敌方坦克是上下 x的范围[enemyTank.getX(), enemyTank.getX() + 40]
                        //                y的范围[enemyTank.getY(), enemyTank.getY() + 60]

                        if (enemyTank.getDirect() == 0 || enemyTank.getDirect() == 2) {
                            //当前坦克 左上角的坐标[this.getX(), this.getY()]
                            if (this.getX() >= enemyTank.getX() && this.getX() <= enemyTank.getX() + 40
                                    && this.getY() >= enemyTank.getY() && this.getY() <= enemyTank.getY() + 60) {
                                return true;
                            }

                            //当前坦克右上角的坐标 [this.getX() + 40, this.getY()]
                            if (this.getX() + 40 >= enemyTank.getX() && this.getX() + 40 <= enemyTank.getX() + 40
                                    && this.getY() >= enemyTank.getY() && this.getY() <= enemyTank.getY() + 60) {
                                return true;
                            }
                        }
                        //如果敌方坦克是 右/左
                        //如果敌方坦克是 右/左 x的范围[enemyTank.getX(), enemyTank.getX() + 60]
                        //                  y的范围[enemyTank.getY(), enemyTank.getY() + 40]
                        if (enemyTank.getDirect() == 1 || enemyTank.getDirect() == 3) {
                            //当前坦克 左上角的坐标[this.getX(), this.getY()]
                            if (this.getX() >= enemyTank.getX() && this.getX() <= enemyTank.getX() + 60
                                    && this.getY() >= enemyTank.getY() && this.getY() <= enemyTank.getY() + 40) {
                                return true;
                            }

                            //当前坦克右上角的坐标 [this.getX() + 40, this.getY()]
                            if (this.getX() + 40 >= enemyTank.getX() && this.getX() + 40 <= enemyTank.getX() + 60
                                    && this.getY() >= enemyTank.getY() && this.getY() <= enemyTank.getY() + 40) {
                                return true;
                            }
                        }
                    }
                }
                break;
            case 1://右
                //让当前敌方坦克和其他所有的敌方坦克比较
                for (int i = 0; i < enemyTanks.size(); i++) {
                    //从Vector 中取出一个敌方坦克
                    EnemyTank enemyTank = enemyTanks.get(i);
                    //不和自己比较
                    if (enemyTank != this) {
                        //如果敌方坦克是 上/下
                        //如果敌方坦克是上下 x的范围[enemyTank.getX(), enemyTank.getX() + 40]
                        //                y的范围[enemyTank.getY(), enemyTank.getY() + 60]

                        if (enemyTank.getDirect() == 0 || enemyTank.getDirect() == 2) {
                            //当前坦克 右上角的坐标[this.getX() + 60, this.getY()]
                            if (this.getX() + 60 >= enemyTank.getX() && this.getX() + 60 <= enemyTank.getX() + 40
                                    && this.getY() >= enemyTank.getY() && this.getY() <= enemyTank.getY() + 60) {
                                return true;
                            }

                            //当前坦克右下角的坐标 [this.getX() + 60, this.getY() + 40]
                            if (this.getX() + 60 >= enemyTank.getX() && this.getX() + 60 <= enemyTank.getX() + 40
                                    && this.getY() + 40 >= enemyTank.getY() && this.getY() + 40 <= enemyTank.getY() + 60) {
                                return true;
                            }
                        }
                        //如果敌方坦克是 右/左
                        //如果敌方坦克是 右/左 x的范围[enemyTank.getX(), enemyTank.getX() + 60]
                        //                  y的范围[enemyTank.getY(), enemyTank.getY() + 40]
                        if (enemyTank.getDirect() == 1 || enemyTank.getDirect() == 3) {
                            //当前坦克 右上角的坐标[this.getX() + 60, this.getY()]
                            if (this.getX() + 60 >= enemyTank.getX() && this.getX() + 60 <= enemyTank.getX() + 60
                                    && this.getY() >= enemyTank.getY() && this.getY() <= enemyTank.getY() + 40) {
                                return true;
                            }

                            //当前坦克右下角的坐标 [this.getX() + 60, this.getY() + 40]
                            if (this.getX() + 60 >= enemyTank.getX() && this.getX() + 60 <= enemyTank.getX() + 60
                                    && this.getY() + 40 >= enemyTank.getY() && this.getY() + 40 <= enemyTank.getY() + 40) {
                                return true;
                            }
                        }
                    }
                }
                break;
            case 2://下
                //让当前敌方坦克和其他所有的敌方坦克比较
                for (int i = 0; i < enemyTanks.size(); i++) {
                    //从Vector 中取出一个敌方坦克
                    EnemyTank enemyTank = enemyTanks.get(i);
                    //不和自己比较
                    if (enemyTank != this) {
                        //如果敌方坦克是 上/下
                        //如果敌方坦克是上下 x的范围[enemyTank.getX(), enemyTank.getX() + 40]
                        //                y的范围[enemyTank.getY(), enemyTank.getY() + 60]

                        if (enemyTank.getDirect() == 0 || enemyTank.getDirect() == 2) {
                            //当前坦克 左下角的坐标[this.getX(), this.getY() + 60]
                            if (this.getX() >= enemyTank.getX() && this.getX() <= enemyTank.getX() + 40
                                    && this.getY() + 60 >= enemyTank.getY() && this.getY() + 60 <= enemyTank.getY() + 60) {
                                return true;
                            }

                            //当前坦克右下角的坐标 [this.getX() + 40, this.getY() + 60]
                            if (this.getX() + 40 >= enemyTank.getX() && this.getX() + 40 <= enemyTank.getX() + 40
                                    && this.getY() + 60 >= enemyTank.getY() && this.getY() + 60 <= enemyTank.getY() + 60) {
                                return true;
                            }
                        }
                        //如果敌方坦克是 右/左
                        //如果敌方坦克是 右/左 x的范围[enemyTank.getX(), enemyTank.getX() + 60]
                        //                  y的范围[enemyTank.getY(), enemyTank.getY() + 40]
                        if (enemyTank.getDirect() == 1 || enemyTank.getDirect() == 3) {
                            //当前坦克 左下角的坐标[this.getX(), this.getY() + 60]
                            if (this.getX() >= enemyTank.getX() && this.getX() <= enemyTank.getX() + 60
                                    && this.getY() + 60 >= enemyTank.getY() && this.getY() + 60 <= enemyTank.getY() + 40) {
                                return true;
                            }

                            //当前坦克右下角的坐标 [this.getX() + 40, this.getY() + 60]
                            if (this.getX() + 60 >= enemyTank.getX() && this.getX() + 60 <= enemyTank.getX() + 60
                                    && this.getY() + 40 >= enemyTank.getY() && this.getY() + 40 <= enemyTank.getY() + 40) {
                                return true;
                            }
                        }
                    }
                }
                break;
            case 3://左
                //让当前敌方坦克和其他所有的敌方坦克比较
                for (int i = 0; i < enemyTanks.size(); i++) {
                    //从Vector 中取出一个敌方坦克
                    EnemyTank enemyTank = enemyTanks.get(i);
                    //不和自己比较
                    if (enemyTank != this) {
                        //如果敌方坦克是 上/下
                        //如果敌方坦克是上下 x的范围[enemyTank.getX(), enemyTank.getX() + 40]
                        //                y的范围[enemyTank.getY(), enemyTank.getY() + 60]

                        if (enemyTank.getDirect() == 0 || enemyTank.getDirect() == 2) {
                            //当前坦克 左上角的坐标[this.getX(), this.getY()]
                            if (this.getX() >= enemyTank.getX() && this.getX() <= enemyTank.getX() + 40
                                    && this.getY() >= enemyTank.getY() && this.getY() <= enemyTank.getY() + 60) {
                                return true;
                            }

                            //当前坦克左下角的坐标 [this.getX(), this.getY() + 40]
                            if (this.getX() >= enemyTank.getX() && this.getX() <= enemyTank.getX() + 40
                                    && this.getY() + 40 >= enemyTank.getY() && this.getY() + 40 <= enemyTank.getY() + 60) {
                                return true;
                            }
                        }
                        //如果敌方坦克是 右/左
                        //如果敌方坦克是 右/左 x的范围[enemyTank.getX(), enemyTank.getX() + 60]
                        //                  y的范围[enemyTank.getY(), enemyTank.getY() + 40]
                        if (enemyTank.getDirect() == 1 || enemyTank.getDirect() == 3) {
                            //当前坦克 左上角的坐标[this.getX(), this.getY()]
                            if (this.getX() >= enemyTank.getX() && this.getX() <= enemyTank.getX() + 60
                                    && this.getY() >= enemyTank.getY() && this.getY() <= enemyTank.getY() + 40) {
                                return true;
                            }

                            //当前坦克左下角的坐标 [this.getX(), this.getY() + 40]
                            if (this.getX() >= enemyTank.getX() && this.getX() <= enemyTank.getX() + 60
                                    && this.getY() + 40 >= enemyTank.getY() && this.getY() + 40 <= enemyTank.getY() + 40) {
                                return true;
                            }
                        }
                    }
                }
                break;
        }
        return false;
    }

    @Override
    public void run() {
        while (true) {

            //这里判断如果shot size() = 0，就创建一颗子弹,放入到shots集合中并启动
            if (isLive && shots.size() < 5) {

                Shot s = null;

                //判断坦克的方向，创建对应的子弹
                switch (getDirect()) {
                    case 0://上
                        s = new Shot(getX() + 20, getY(), 0);
                        break;
                    case 1://右
                        s = new Shot(getX() + 60, getY() + 20, 1);
                        break;
                    case 2://下
                        s = new Shot(getX() + 20, getY() + 60, 2);
                        break;
                    case 3://左
                        s = new Shot(getX(), getY() + 20, 3);
                        break;
                }
                shots.add(s);
                new Thread(s).start();
            }

            //根据坦克的方向来继续移动
            switch (getDirect()) {
                case 0://上
                    //让坦克保持一个方向走30步
                    for (int i = 0; i < 30; i++) {
                        if (getY() > 0 && !isTouchEnemyTank()) {
                            moveUp();
                        }
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    break;
                case 1://右
                    for (int i = 0; i < 30; i++) {
                        if (getX() + 60 < 1000 && !isTouchEnemyTank()) {
                            moveRight();
                        }
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    break;
                case 2://下
                    for (int i = 0; i < 30; i++) {
                        if (getY() + 60 < 750 && !isTouchEnemyTank()) {
                            moveDown();
                        }
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    break;
                case 3://左
                    for (int i = 0; i < 30; i++) {
                        if (getX() > 0 && !isTouchEnemyTank()) {
                            moveLeft();
                        }
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    break;
            }

            //然后随机的改变坦克方向0-3
            setDirect((int) (Math.random() * 4));
            //写并发程序，一定要考虑清楚，该线程什么时候结束
            if (!isLive) {
                break;
            }
        }
    }
}
