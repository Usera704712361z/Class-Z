package com.hspedu_19.homeWork_.work02_;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class work02 {
    public static void main(String[] args) {
        String filePath = "/Users/dreamtank/Desktop/hspedu/story.txt";
        BufferedReader bfr = null;
        String line = "";
        int lineNum = 0;
        try {
            bfr = new BufferedReader(new FileReader(filePath));
            while((line = bfr.readLine()) != null) {
                System.out.println(++lineNum + line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if(bfr != null) {
                try {
                    bfr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
