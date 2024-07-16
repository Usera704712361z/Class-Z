package com.hspedu_25.jdbc;

import com.mysql.jdbc.Driver;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class Jdbc01 {
    public static void main(String[] args) throws SQLException {
        Driver driver = new Driver();//创建驱动

        //1. jdbc:mysql://  规定好表示协议，通过jdbc的方式连接连接mysql
        //2. localhost 主机 可以是ip地址
        //3. 3306 表示 mysql 监听的端口
        //4. hsp_db02 连接到 mysql dbml 的哪个数据库
        //5. mysql 的连接本质是 socket 连接
        String url = "jdbc:mysql://localhost:3306/hsp_db02";

        Properties properties = new Properties();
        properties.setProperty("user", "root");
        properties.setProperty("password", "123456");

        Connection connect = driver.connect(url, properties);

        String sql = "insert into actor values(null, '刘德华', '男', '1970-11-11', '110')";
        Statement statement = connect.createStatement();
        int rows = statement.executeUpdate(sql);
        System.out.println(rows > 0 ? "成功": "失败");

        statement.close();
        connect.close();
    }
}
