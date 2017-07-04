package com.hstt.utils;

import org.junit.Test;

import java.sql.Connection;

import static org.junit.Assert.*;

/**
 * @author HuanRong(zhenghuanrong@yeah.net)
 */
public class JdbcUtilTest {
    @Test
    public void getConnection() throws Exception {
        Connection connection = JdbcUtil.getConnection();
        System.out.print(connection);
    }

    @Test
    public void getConnection2() throws Exception {
        Connection connection = JdbcUtil.getConnection2();
        System.out.print(connection);
    }

}