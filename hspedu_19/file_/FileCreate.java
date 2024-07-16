package com.hspedu_19.file_;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

public class FileCreate {
    public static void main(String[] args) {

    }

    //方式1 new File(String pathname)
    @Test
    public void create01() {
        String filePath = "/Users/dreamtank/Desktop/hspedu/news1.md";
        File file = new File(filePath);
        try {
            file.createNewFile();
            System.out.println("文件创建成功1");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //方式2 new File(File parent, String child)
    @Test
    public void create02() {
        File parentFile = new File("/Users/dreamtank/Desktop/hspedu");
        String fileName = "/news2.md";
        File file = new File(parentFile, fileName);
        try {
            file.createNewFile();
            System.out.println("文件创建成功2");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //方式3 new File(String parent, String child)
    @Test
    public void create03() {
        String parentPath = "/Users/dreamtank/Desktop/hspedu";
        String filePath = "/news3.md";
        File file = new File(parentPath, filePath);
        try {
            file.createNewFile();
            System.out.println("文件创建成功3");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}