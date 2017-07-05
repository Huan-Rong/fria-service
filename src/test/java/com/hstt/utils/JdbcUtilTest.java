package com.hstt.utils;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.hstt.bean.recognition.BdPersonDO;
import org.junit.Test;

import java.sql.Connection;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

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

    @Test
    public void getConnection3() throws SQLException {
        Connection connection = JdbcUtil.getConnection3();
        System.out.print(connection);
    }

    @Test
    public void updateTest() throws SQLException {
        BdPersonDO bdPersonDO = new BdPersonDO();
        bdPersonDO.setBirthday(new Date());
        bdPersonDO.setCreatedTime(new Date());
        bdPersonDO.setGender(1);
        bdPersonDO.setId(2L);
        bdPersonDO.setIdCard("112144152222222222");
        bdPersonDO.setPersonAddress("建设路");
        bdPersonDO.setPersonName("Eric");
        bdPersonDO.setPersonDescription("广州在逃人员101");
        bdPersonDO.setType(1);
        bdPersonDO.setStatus(1);

        // 构造 SQL 语句既容易麻烦又容易出错。
        String sql = "INSERT INTO BD_PERSON(ID, PERSON_NAME, ID_CARD, GENDER, BIRTHDAY, PERSON_ADDRESS, " +
                "PERSON_DESCRIPTION, TYPE, STATUS, CREATED_TIME) VALUES(" + bdPersonDO.getId() +
                ",'" + bdPersonDO.getPersonName() + "','" + bdPersonDO.getIdCard() + "'," +
                bdPersonDO.getGender() + ",TO_DATE('" + new SimpleDateFormat("YYYY-MM-dd").format(bdPersonDO.getBirthday()) + "','yyyy-mm-dd'),'" + bdPersonDO.getPersonAddress() +
                "','" + bdPersonDO.getPersonDescription() + "'," + bdPersonDO.getType() + "," + bdPersonDO.getStatus() +
                ",TO_DATE('" + new SimpleDateFormat("YYYY-MM-dd hh:mm:ss").format(bdPersonDO.getCreatedTime()) + "','yyyy-mm-dd hh24:mi:ss'))";
        System.out.print(sql);
        JdbcUtil.update(sql);
    }

    @Test
    public void updateTest2() throws SQLException {
        String sql = "DELETE FROM BD_PERSON WHERE ID = 1";
        JdbcUtil.update(sql);
    }

    @Test
    public void updateTest3() throws SQLException {
        String sql = "UPDATE BD_PERSON SET PERSON_NAME = 'IAN'";
        JdbcUtil.update(sql);
    }

}