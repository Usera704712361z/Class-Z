package com.hspedu.qqserver.service;

import com.hspedu.qqcommon.Message;
import com.hspedu.qqcommon.MessageType;
import com.hspedu.qqcommon.User;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;

//这是服务器，在监听9999，等待客户端连接，并保持通信
public class QQServer {
    private ServerSocket ss = null;
    //创建一个集合，存放多个用户，如果是这些用户登录，就认为是合法的
    //这里也可以使用，ConcurrentHashMap,可以处理并发的集合，没有线程安全问题
    //HashMap 没有处理线程安全问题， 因此在多线程情况下是不安全的
    //ConcurrentHashMap 处理线程安全，即线程同步处理，在多线程情况下是安全的
    private static HashMap<String, User> validUsers = new HashMap<>();

    static {//在静态代码块，初始化 validUsers
        validUsers.put("100", new User("100","123456"));
        validUsers.put("200", new User("200","123456"));
        validUsers.put("300", new User("300","123456"));
        validUsers.put("至尊宝", new User("至尊宝","123456"));
        validUsers.put("marry", new User("marry","123456"));
    }

    //验证用户是否有效的方法
    private boolean checkUser(String userId,String passwd) {
        User user = validUsers.get(userId);
        //过关的验证方式
        if(user == null) {//说明 userId 没有存在 validUsers 的 key 中
            return false;
        }
        if(!user.getPasswd().equals(passwd)) {//userId正确，但是密码错误
            return false;
        }
        return true;
    }

    public QQServer() {
        //注意：端口可以写在配置文件.
        try {
            System.out.println("服务端在9999端口监听...");
            //启动推送新闻的线程
            new Thread(new SendNewsToALLService()).start();
            ss = new ServerSocket(9999);
            while(true) {//当和某个客户端连接后，会继续监听，因此while
                //如果没有客户端连接，就会阻塞在这里
                Socket socket = ss.accept();
                //得到 socket 关联的对象输入流
                ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
                //得到 socket 关联的对象输出流
                ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
                User u = (User)ois.readObject();//读取客户端发送的 User 对象
                //创建一个 Message 对象， 准备回复客户端
                Message message = new Message();
                //验证
                if(checkUser(u.getUserId(), u.getPasswd())) {//登录成功
                    message.setMesType(MessageType.MESSAGE_LOGIN_SUCCEED);
                    //将 message 对象回复
                    oos.writeObject(message);
                    //创建一个线程， 和客户端保持通信，该线程需要持有 socket 对象
                    ServerConnectClientThread serverConnectClientThread =
                            new ServerConnectClientThread(socket, u.getUserId());
                    //启动该线程
                    serverConnectClientThread.start();
                    //把该线程对象，放入到一个集合中，进行管理.
                    ManageClientThreads.addClientThread(u.getUserId(), serverConnectClientThread);
                } else {//登录失败
                    System.out.println("用户 id = " +u.getUserId() + " pwd" + u.getPasswd() + " 验证失败");
                    message.setMesType(MessageType.MESSAGE_LOGIN_FAIL);
                    oos.writeObject(message);
                    //关闭 socket
                    socket.close();
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {

            //如果服务端退出了 while 循环，说明服务端不再监听，因此关闭 ServerSocket
            try {
                ss.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
