package com.hspedu_21.udp_;

import java.io.IOException;
import java.net.*;

public class UDPSenderB {//UDP发送端B
    public static void main(String[] args) throws IOException {
        //1. 创建 DatagramSocket 对象， 准备在 9998 端口 接收数据
        DatagramSocket socket = new DatagramSocket(9998);

        //2. 将要发送的数据， 封装到 DatagramPacket 对象
        byte[] data = "hello, 明天吃火锅".getBytes();

        //3. 封装的 DatagramPacket 对象 data 内容字节数组， data.length， 主机(IP)
        //   ， 端口
        DatagramPacket packet = new DatagramPacket(data, data.length,
                InetAddress.getByName("192.168.3.18"), 9999);
        socket.send(packet);

        byte[] buf = new byte[1024];
        packet = new DatagramPacket(buf, buf.length);
        System.out.println("接收端B, 等待接收数据...");
        socket.receive(packet);
        int length = packet.getLength();
        data = packet.getData();
        String s = new String(data, 0, length);
        System.out.println(s);

        //4. 关闭资源
        socket.close();
        System.out.println("B端退出..");
    }
}
