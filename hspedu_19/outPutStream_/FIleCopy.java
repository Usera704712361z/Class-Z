package com.hspedu_19.outPutStream_;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FIleCopy {
    public static void main(String[] args) {
        String srcFilePath = "/Users/dreamtank/Desktop/hspedu/a.txt";
        String destFilePath = "/Users/dreamtank/Desktop/a.txt";
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        try {
            fileInputStream = new FileInputStream(srcFilePath);
            fileOutputStream = new FileOutputStream(destFilePath);
            //定义一个字节数组，提高读取效果
            byte[] buf = new byte[1024];
            int readLen = 0;
            while((readLen = fileInputStream.read(buf)) != -1) {
                //读取到后， 就写入到文件 通过 fileOutputStream 一边读一边写
                fileOutputStream.write(buf, 0, readLen);//一定是这个方法
            }
            System.out.println("拷贝成功……");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(fileInputStream != null) {
                    fileInputStream.close();
                }
                if(fileOutputStream != null) {
                    fileOutputStream.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
