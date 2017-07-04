package com.hstt.utils;

import oracle.jdbc.driver.OracleDriver;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
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
     *
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
            //加载数据库驱动类
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
        Connection connection = driver.connect(JDBC_URL, info);
        return connection;
    }

    /**
     * 返回一个数据库连接
     * @return 数据库连接
     * @throws SQLException
     */
    public static Connection getConnection2() throws SQLException {
        return DriverManager.getConnection(JDBC_URL, USER, PASSWORD);
    }
}
