package com.hspedu_19.homeWork_.work01_;

import java.io.*;

public class work01 {
    public static void main(String[] args) throws IOException {
        String directoryPath = "/Users/dreamtank/Desktop/hspedu/mytemp";
        File file = new File(directoryPath);
        if(!file.exists()) {
            if(file.mkdirs()) {
                System.out.println("mytemp 创建成功");
            } else {
                System.out.println("mytemp 创建失败");
            }
        }
        String filePath = directoryPath +"/hello.txt";
        file = new File(filePath);
        if(!file.exists()) {
            if(file.createNewFile()) {
                System.out.println("hello.txt 创建成功");
                BufferedWriter bfw = new BufferedWriter(new FileWriter(file));
                bfw.write("hello, world");
                bfw.close();
            } else {
                System.out.println("hello.txt 创建失败");
            }
        } else {
            System.out.println(filePath + " 已经存在， 不再创建");
        }
    }
}
