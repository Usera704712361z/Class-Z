package com.hspedu_19.writer_;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriter_ {
    public static void main(String[] args) {
        String filePath = "/Users/dreamtank/Desktop/hspedu/note.txt";
        FileWriter fileWriter = null;
        char[] chars = {'a', 'b', 'c'};
        try {
            fileWriter = new FileWriter(filePath);
            //write(int)：写入单个字符
            fileWriter.write('H');
            //write(char[])： 写入指定数组
            fileWriter.write(chars);
            //write(char[], off, len)：写入指定数组的指定部分
            fileWriter.write(" mary,stick,jack", 0, 5);
            //write(string)：写入整个字符串
            fileWriter.write(" hello, world");
            fileWriter.write(" 风雨过后，定见彩虹");
            //write(string, off, len):写入字符串的指定部分
            fileWriter.write(" ~hello, ~world", 0, 7);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(fileWriter != null) {
                try {
                    fileWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}