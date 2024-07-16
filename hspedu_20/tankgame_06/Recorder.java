package com.hspedu_20.tankgame_06;

import java.io.*;
import java.util.Vector;

public class Recorder {
    //定义变量，记录己方击毁敌方坦克数
    private static int allEnemyTankNum = 0;
    //定义IO对象,写数据到文件中
    private static BufferedWriter bw = null;
    private static BufferedReader br = null;
    private static String recordFile = "/Users/dreamtank/Desktop/hspedu/myRecord.txt";
    //定义Vector，指向 MyPanel 对象的敌方坦克Vector
    private static Vector<EnemyTank> enemyTanks = null;

    //定义一个Node 的Vector， 用于保存敌人的信息node
    private static Vector<Node> nodes = new Vector<>();

    public static void setEnemyTanks(Vector<EnemyTank> enemyTanks) {
        Recorder.enemyTanks = enemyTanks;
    }

    //增加一个方法， 用于读取recordFile， 恢复相关信息
    //该方法， 在继续上局的时候调用即可
    public static Vector<Node> getNodesAndEnemyTankRec() {
        try {
            br = new BufferedReader(new FileReader(recordFile));
            allEnemyTankNum = Integer.parseInt(br.readLine());
            //循环读取文件， 生成nodes 集合
            String line = "";//坦克x坐标, 坦克y坐标, 坦克方向(direct)
            while ((line = br.readLine()) != null) {
                String[] xyd = line.split(" ");
                Node node = new Node(Integer.parseInt(xyd[0]), Integer.parseInt(xyd[1]), Integer.parseInt(xyd[2]));
                nodes.add(node);//放入Vector<Node>集合中
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return nodes;
    }

    //增加一个方法，当游戏退出时，我们将allEnemyTankNum 保存到 recordFile
    //对 keepRecord 进行升级， 保存敌人坦克的坐标和方向
    public static void keepRecord() {
        try {
            bw = new BufferedWriter(new FileWriter(recordFile));
            bw.write(allEnemyTankNum + "\r\n");//写进数据
            //遍历敌方坦克的Vector， 然后根据情况保存即可
            //OOP， 定义一个属性，然后通过setXX得到 敌方坦克的 Vector
            for (int i = 0; i < enemyTanks.size(); i++) {
                //取出敌方坦克
                EnemyTank enemyTank = enemyTanks.get(i);
                if (enemyTank.isLive) {//建议判断
                    //保存该enemyTank信息
                    String record = enemyTank.getX() + " " + enemyTank.getY() + " " + enemyTank.getDirect();
                    bw.write(record + "\r\n");
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bw != null) {
                    bw.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static int getAllEnemyTankNum() {
        return allEnemyTankNum;
    }

    public static void setAllEnemyTankNum(int allEnemyTankNum) {
        Recorder.allEnemyTankNum = allEnemyTankNum;
    }

    //当己方坦克击毁一个敌人坦克，就应当 allEnemyTankNum++
    public static void addAllEnemyTankNum() {
        Recorder.allEnemyTankNum++;
    }
}
