package com.hspedu_21.api_;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class API_ {
    public static void main(String[] args) throws UnknownHostException {

        //1. 获取本机的 InetAddress 对象
        InetAddress localHost = InetAddress.getLocalHost();
        System.out.println(localHost);//dreaMTankdeMacBook-Pro.local/192.168.1.26

        //2. 根据指定主机名， 获取 InetAddress对象
        InetAddress host1 = InetAddress.getByName("dreaMTankdeMacBook-Pro.local");
        System.out.println(host1);//dreaMTankdeMacBook-Pro.local/192.168.1.26

        //3. 根据域名返回一个 InetAddress 对象， 比如 www.baidu.com 对应
        InetAddress host2 = InetAddress.getByName("www.baidu.com");
        System.out.println(host2);// www.baidu.com/119.63.197.139

        //4. 通过 InetAddress 对象，获取对应的地址
        String hostAddress = host2.getHostAddress();
        System.out.println("host2 对应的IP地址" + hostAddress);//host2 对应的IP地址119.63.197.139

        //5. 通过 InetAddress 对象，获取对应的主机名/或者是域名
        String hostName = host2.getHostName();
        System.out.println("host2 对应的主机名/域名" + hostName);//host2 对应的主机名/域名www.baidu.com
    }
}
