package com.hstt.utils;

import oracle.jdbc.driver.OracleDriver;

import javax.management.InstanceNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

/**
 * @author HuanRong(zhenghuanrong@yeah.net)
 */
public class JdbcUtil {

    private static String DRIVER_CLASS_NAME;
    private static String JDBC_URL;
    private static String USER;
    private static String PASSWORD;

    /*
     * 静态代码块，用于读取获取数据库连接所需要的数据库驱动程序的类名、数据库连接字符串、数据库用户名、用户密码。
     */
    static {
        InputStream inputStream = JdbcUtil.class.getClassLoader().getResourceAsStream("jdbc.properties");
        Properties properties = new Properties();
        if (inputStream == null) {
            //TODO:日志处理并提前结束静态代码块的执行
        }
        try {
            properties.load(inputStream);
            DRIVER_CLASS_NAME = properties.getProperty("driverClassName");
            JDBC_URL = properties.getProperty("jdbcUrl");
            USER = properties.getProperty("user");
            PASSWORD = properties.getProperty("password");
            //加载数据库驱动类，并且注册该驱动。
            //DriverManager.registerDriver(Class.forName(DRIVER_CLASS_NAME).newInstance());
            Class.forName(DRIVER_CLASS_NAME);
        } catch (IOException e) {
            //TODO:日志处理
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            //TODO:日志处理
            e.printStackTrace();
        } finally {
            try {
                // 关闭流
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 返回一个数据库连接
     * @return 数据库连接
     * @throws SQLException
     */
    public static Connection getConnection() throws SQLException {
        //缺点：该方法与具体的数据库驱动程序耦合性太高
        Driver driver = new OracleDriver();
        Properties info = new Properties();
        info.put("user", USER);
        info.put("password", PASSWORD);
        //Driver 属于 JDBC Driver API，通常不应该直接调用 Driver 的方法。
        return driver.connect(JDBC_URL, info);
    }

    /**
     * 返回一个数据库连接
     * @return 数据库连接
     * @throws ClassNotFoundException
     * @throws IllegalAccessException
     * @throws InstantiationException
     * @throws SQLException
     */
    public static Connection getConnection2() throws ClassNotFoundException, IllegalAccessException, InstantiationException, SQLException {
        Driver driver = (Driver) Class.forName(DRIVER_CLASS_NAME).newInstance();
        Properties info = new Properties();
        info.put("user", USER);
        info.put("password", PASSWORD);
        //Driver 属于 JDBC Driver API，通常不应该直接调用 Driver 的方法。
        return driver.connect(JDBC_URL, info);
    }

    /**
     * 返回一个数据库连接
     * @return 数据库连接
     * @throws SQLException
     */
    public static Connection getConnection3() throws SQLException {
        return DriverManager.getConnection(JDBC_URL, USER, PASSWORD);
    }

    /**
     * 释放数据库连接资源
     * @param statement
     * @param connection
     */
    public static void release(Statement statement, Connection connection) {
        //问：为什么要释放 Statement？为什么不能直接释放 Connection？如果两次释放都失败应当如何处理？
        if (statement != null) {
            try {
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 通用的更新方法
     * @param sql
     *          只能是 INSERT/UPDATE/DELETE 语句，SELECT 语句使用该方法。
     * @return
     * @throws SQLException
     */
    public static void update(String sql) throws SQLException {
        Connection connection = null;
        Statement statement = null;
        try {
            connection = getConnection3();
            statement = connection.createStatement();
            statement.executeUpdate(sql);
        } finally {
            release(statement, connection);
        }
    }
}
