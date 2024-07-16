package com.hspedu_21.homework_.Work01_;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class HomeWork01Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9999);
        System.out.println("服务器监听 9999 端口，等待连接");
        Socket socket = serverSocket.accept();
        InputStream inputStream = socket.getInputStream();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        String s = bufferedReader.readLine();

        String answer = "";
        if("name".equals(s)) {
            answer = "我是nova";
        } else if("hobby".equals(s)) {
            answer = "编写java 程序";
        } else {
            answer = "你在说什么..";
        }

        //接收后输出
        OutputStream outputStream = socket.getOutputStream();
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));
        bufferedWriter.write(answer);
        bufferedWriter.flush();

        bufferedWriter.close();
        bufferedReader.close();
        socket.close();
        serverSocket.close();
    }
}
