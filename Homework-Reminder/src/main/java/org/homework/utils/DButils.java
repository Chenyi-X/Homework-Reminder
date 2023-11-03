package org.homework.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;
import java.io.InputStream;

/**
 * DBConnectionManager类，用于建立数据库连接。
 */
public class DButils {
    private static Connection connection;

    /**
     * 获取数据库连接
     */
    public static Connection getConnection() throws Exception {
        if (connection == null || connection.isClosed()) {
            // 加载配置文件中的数据库连接信息
            Properties properties = new Properties();
            InputStream input = DButils.class.getClassLoader().getResourceAsStream("db.properties");
            properties.load(input);
            input.close();

            // 从配置文件中读取数据库连接信息
            String url = properties.getProperty("db.url");
            String username = properties.getProperty("db.username");
            String password = properties.getProperty("db.password");

            // 建立数据库连接
            connection = DriverManager.getConnection(url, username, password);
        }
        return connection;
    }

    /**
     * 关闭数据库连接
     */
    public static void closeConnection() throws Exception {
        if (connection != null && !connection.isClosed()) {
            connection.close();
        }
    }
}
