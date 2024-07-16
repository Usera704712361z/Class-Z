package com.hspedu_21.homework_.Work03_;

import com.hspedu_21.upload_.StreamUtils;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class HomeWork03Server {
    public static void main(String[] args) throws Exception {

        //1. 监听 9999 端口
        ServerSocket serverSocket = new ServerSocket(9999);
        //2. 等待客户端连接
        System.out.println("服务端在 9999 端口监听，等待下载文件..");
        Socket socket = serverSocket.accept();
        //3. 读取， 客户端发送要下载的文件名
        //   使用wile循环读取文件名， 是考虑将来客户端发送的数据较大的情况
        InputStream inputStream = socket.getInputStream();
        byte[] b = new byte[1024];
        int len = 0;
        String downloadFileName = "";
        while((len = inputStream.read(b)) != -1) {
            downloadFileName = new String(b, 0, len);
        }
        System.out.println("客户端希望下载的文件名 = " + downloadFileName);

        //在服务器上有两个文件，无名.mp3， 高山流水.mp3
        //如果客户端下载的是， 高山流水 则返回该文件，否则一律返回 无名.mp3

        String resFileName = "";
        if("高山流水".equals(downloadFileName)) {
            resFileName = "src/高山流水.mp3";
        } else {
            resFileName = "src/无名.mp3";
        }

        //4. 创建一个输入流， 读取文件
        BufferedInputStream bis =
                new BufferedInputStream(new FileInputStream(resFileName));

        //5. 使用工具类 StreamUtils 读取文件到一个字节数组

        byte[] bytes = StreamUtils.streamToByteArray(bis);
        //6. 得到 Socket 关联的输出流
        BufferedOutputStream bos =
                new BufferedOutputStream(socket.getOutputStream());
        //7. 写入到数据通道， 返回给客户端
        bos.write(bytes);
        socket.shutdownOutput();//!!!!!!!

        //8. 关闭相关资源
        bis.close();
        inputStream.close();
        serverSocket.close();
        System.out.println("服务端退出...");
    }
}
