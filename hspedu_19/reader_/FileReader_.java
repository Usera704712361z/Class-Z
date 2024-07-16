package com.hspedu_19.reader_;

import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReader_ {
    public static void main(String[] args) {

    }

    /**
     * 单个字符读取文件
     */
    @Test
    public void readFile01() {
        System.out.println("readFile01 方法读取");
        String filePath = "/Users/dreamtank/Desktop/hspedu/story.txt";
        FileReader fileReader = null;
        int date = 0;
        //创建FileReader 对象
        try {
            fileReader = new FileReader(filePath);
            while ((date = fileReader.read()) != -1) {
                System.out.print((char) date);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(fileReader != null) {
                    fileReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     *字符数组读取文件
     */
    @Test
    public void readFile02() {
        System.out.println("readFile02 方法读取");
        String filePath = "/Users/dreamtank/Desktop/hspedu/story.txt";
        FileReader fileReader = null;
        int readLen = 0;
        char[] buf = new char[8];
        //创建FileReader 对象
        try {
            fileReader = new FileReader(filePath);
            while ((readLen = fileReader.read(buf)) != -1) {
                System.out.print(new String(buf, 0, readLen));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(fileReader != null) {
                    fileReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}