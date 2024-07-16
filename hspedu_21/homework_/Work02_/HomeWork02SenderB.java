package com.hspedu_21.homework_.Work02_;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

public class HomeWork02SenderB {
    public static void main(String[] args) throws IOException {
        DatagramSocket socket = new DatagramSocket(8887);

        //接收用户输入
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你的问题");
        String question = scanner.next();

        byte[] data = question.getBytes();
        DatagramPacket packet = new DatagramPacket(data, data.length,
                InetAddress.getByName("192.168.3.18"), 8888);
        socket.send(packet);

        byte[] buf = new byte[1024];
        packet = new DatagramPacket(buf, buf.length);
        System.out.println("接收端B， 等待接收数据...");
        socket.receive(packet);
        int length = packet.getLength();
        data = packet.getData();
        String s = new String(data, 0, length);
        System.out.println(s);

        socket.close();
        System.out.println("B端退出...");
    }
}
