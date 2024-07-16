package com.hspedu_25.utils;

import org.junit.jupiter.api.Test;

import java.sql.*;

public class JDBCUtils_Use {

    @Test
    public void testSelect() {
        Connection connection = null;
        PreparedStatement preparedStatement =null;
        String sql = "select * from actor";
        ResultSet set = null;
        try {
            connection = JDBCUtils.getConnection();
            preparedStatement = connection.prepareStatement(sql);

            set = preparedStatement.executeQuery();
            while(set.next()) {
                int id = set.getInt("id");
                String name = set.getString("name");
                String sex = set.getString("sex");
                Date borndate = set.getDate("borndate");
                String phone = set.getString("phone");
                System.out.println(id + "\t" + name + "\t" + sex + "\t" + borndate + "\t" + phone);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            JDBCUtils.close(set, preparedStatement, connection);
        }
    }

    @Test
    public void testDML() {

        Connection connection = null;
        PreparedStatement preparedStatement =null;
        String sql = "update actor set name = ? where id = ?";
        try {
            connection = JDBCUtils.getConnection();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, "max");
            preparedStatement.setInt(2, 1);

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            JDBCUtils.close(null, preparedStatement, connection);
        }
    }
}
