package com.hspedu_19.inputStream_;


import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.IOException;

public class FileinputStream_ {
    public static void main(String[] args) {

    }

    /**
     * 演示读取文件
     * 单个字节读取，效率比较低
     * -> 使用read(byte[] b)
     */
    @Test
    public void readFile01() {
        String filePath = "/Users/dreamtank/Desktop/hspedu/news.txt";
        int readDate = 0;
        FileInputStream fileInputStream = null;
        try {
            //创建 FileInputStream 对象， 用于读取 文件   ,   /Users/dreamtank/Desktop
            fileInputStream = new FileInputStream(filePath);
            //从该输入流读取一个字节的数据， 如果没有输入可用，此方法将阻止。
            //如果返回-1， 表示读取完毕
            while((readDate = fileInputStream.read()) != -1) {
                System.out.print((char)readDate);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * -> 使用read(byte[] b) 读取文件，提高效率
     */
    @Test
    public void readFile02() {
        String filePath = "/Users/dreamtank/Desktop/hspedu/news.txt";
        int readDate = 0;
        //字节数组
        byte [] buf = new byte[8];
        int readLen = 0;
        FileInputStream fileInputStream = null;
        try {
            //创建 FileInputStream 对象， 用于读取 文件   ,   /Users/dreamtank/Desktop
            fileInputStream = new FileInputStream(filePath);
            //从该输入流读取一个字节的数据， 如果没有输入可用，此方法将阻止。
            //如果返回-1， 表示读取完毕
            //如果读取正常，返回实际读取的字节数
            while((readLen = fileInputStream.read(buf)) != -1) {
                System.out.print(new String(buf, 0, readLen));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
