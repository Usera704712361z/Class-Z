package com.hspedu_19.writer_;

import java.io.*;

public class BufferedCopy_ {
    public static void main(String[] args) {
        String srcFilePath = "/Users/dreamtank/Desktop/hspedu/a1.txt";
        String destFilePath = "/Users/dreamtank/Desktop/hspedu/a2.txt";
        BufferedReader br = null;
        BufferedWriter bw = null;
        String line;
        try {
            br = new BufferedReader(new FileReader(srcFilePath));
            bw = new BufferedWriter(new FileWriter(destFilePath));
            while((line = br.readLine()) != null) {
                bw.write(line);
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(br != null) {
                    br.close();
                }
                if(bw != null) {
                    bw.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
