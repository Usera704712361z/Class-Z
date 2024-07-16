package com.hspedu_19.writer_;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriter_ {
    public static void main(String[] args) throws IOException {
        String filePath = "/Users/dreamtank/Desktop/hspedu/a1.txt";
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath, true));
        bufferedWriter.write("hspedu");
        bufferedWriter.newLine();
        bufferedWriter.write("hspedu");
        bufferedWriter.newLine();
        bufferedWriter.write("hspedu");
        bufferedWriter.newLine();
        bufferedWriter.close();
    }
}
