package com.hspedu_21.homework_.Work03_;

import com.hspedu_21.upload_.StreamUtils;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class HomeWork03Client {
    public static void main(String[] args) throws Exception {

        //1. 接收用户输入， 指定下载文件名
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入下载文件名");
        String downloadFileName = scanner.next();

        //2. 连接服务端，准备发送
        Socket socket = new Socket(InetAddress.getLocalHost(), 9999);
        //3. 获取和 Socket 关联的输出流
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write(downloadFileName.getBytes());
        //设置写入结束的标志
        socket.shutdownOutput();

        //4. 读取服务器返回的文件(字节数据)
        BufferedInputStream bis =
                new BufferedInputStream(socket.getInputStream());
        byte[] bytes = StreamUtils.streamToByteArray(bis);

        //5. 得到一个输出流， 准备将 bytes 写入到磁盘文件
        //   比如下载的是 高山流水 => 下载的就是高山流水.mp3
        //   下载的是 abc => 下载的就是 无名.mp3, 文件名为 abc.mp3
        String filePath = "/Users/dreamtank/Desktop/hspedu/" + downloadFileName + ".mp3";
        BufferedOutputStream bos =
                new BufferedOutputStream(new FileOutputStream(filePath));
        bos.write(bytes);

        //关闭相关资源
        bos.close();
        bis.close();
        outputStream.close();
        socket.close();
        System.out.println("客户端下载完毕，正确退出...");

    }
}
