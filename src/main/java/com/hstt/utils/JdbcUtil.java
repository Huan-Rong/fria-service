package com.hstt.utils;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.util.Properties;

/**
 * @author HuanRong(zhenghuanrong@yeah.net)
 */
public class JdbcUtil {

    private static String USERNAME;
    private static String PASSWORD;
    private static String DRIVER_CLASS_NAME;

    /**
     * 读取配置，如数据库用户名、密码、连接字符串、数据库驱动
     */
    public static void readConf() {
        InputStream inputStream = JdbcUtil.class.getClassLoader().getResourceAsStream("jdbc.properties");
        Properties properties = new Properties();
        if (inputStream == null) {
            //TODO:日志处理
            return;
        }
        try {
            properties.load(inputStream);
            USERNAME= properties.getProperty("");
            PASSWORD = properties.getProperty("");
            DRIVER_CLASS_NAME = properties.getProperty("");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 返回一个数据库连接。
     *
     * @return
     */
    public static Connection getConnection() {

        try {
            Class.forName(DRIVER_CLASS_NAME);
        } catch (ClassNotFoundException e) {
            //TODO:日志处理
            e.printStackTrace();
        }
        Connection connection = null;
        return connection;
    }
}
