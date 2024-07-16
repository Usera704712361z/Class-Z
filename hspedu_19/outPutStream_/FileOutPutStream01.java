package com.hspedu_19.outPutStream_;

import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutPutStream01 {
    public static void main(String[] args) {

    }

    /**
     * 演示使用FileOutputStream 将数据写到文件中
     * 如果数据不存在，则创建该文件
     */
    @Test
    public void writeFile() {

        //创建 FileOutputStream对象
        String filePath = "/Users/dreamtank/Desktop/hspedu/a.txt";
        FileOutputStream fileOutputStream = null;
        try {
            //得到 FileOutputStream对象
            //1.new FileOutputStream(filePath) 创建方式是覆盖
            //2.new FileOutputStream(filePath, true) 创建方式是追加
            fileOutputStream = new FileOutputStream(filePath, true);
            //写入一个字节
            //str.getBytes() 可以把 字符串-> 字节数组
            //fileOutputStream.write('H');

            //写入字符串
            String str = "hello,world";
            //fileOutputStream.write(str.getBytes());

            //write(byte[] b, int off, int len) 将 len字节从位于偏移量 off的指定字节数组
            fileOutputStream.write(str.getBytes(), 0, 5);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
