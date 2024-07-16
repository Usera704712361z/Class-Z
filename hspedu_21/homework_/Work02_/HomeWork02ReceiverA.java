package com.hspedu_21.homework_.Work02_;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class HomeWork02ReceiverA {
    public static void main(String[] args) throws IOException {
        DatagramSocket socket = new DatagramSocket(8888);
        byte[] buf = new byte[1024];
        DatagramPacket packet = new DatagramPacket(buf, buf.length);
        System.out.println("接收端A，等待接收数据..");
        socket.receive(packet);

        int length = packet.getLength();
        byte[] data = packet.getData();
        String s = new String(data, 0, length);
        String answer = "";
        if("四大名著是哪些".equals(s)) {
            answer = "四大名著是...";
        } else {
            answer = "what?";
        }

        data = answer.getBytes();
        packet = new DatagramPacket(data, data.length,
                InetAddress.getByName("192.168.3.18"), 8887);
        socket.send(packet);

        socket.close();
        System.out.println("A端退出...");
    }
}
