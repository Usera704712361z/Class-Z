package com.hspedu_21.udp_;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class UDPReceiverA {//UDP接收端A
    public static void main(String[] args) throws IOException {
        //1. 创建一个DatagramSocket 对象，准备在端口9999接收数据
        DatagramSocket socket = new DatagramSocket(9999);
        //2. 构建一个 DatagramPacket 对象，准备接数据
        //   在前面讲解UDP协议，一个数据包最大 64K
        byte[] buf = new byte[1024];
        DatagramPacket packet = new DatagramPacket(buf, buf.length);
        //3. 调用接收方法, 将通过网络传输的 DatagramPacket 对象
        //   填充到 packet 对象
        //   当有数据包发送到本机的 9999 端口时， 就会接收到数据
        //   如果没有数据包发送到本机的 9999 端口时，就会阻塞等待
        System.out.println("接收端A，等待接收数据..");
        socket.receive(packet);

        //4. 可以把 packet 进行拆包， 取出数据并显示
        int length = packet.getLength();//实际接收到的数据字节长度
        byte[] data = packet.getData();//接收到的数据
        String s = new String(data, 0, length);
        System.out.println(s);

        //回复信息给B端
        data = "好的, 明天见".getBytes();
        packet = new DatagramPacket(data, data.length,
                InetAddress.getByName("192.168.3.18"), 9998);
        socket.send(packet);

        //5. 关闭资源
        socket.close();
        System.out.println("A端退出...");
    }
}
