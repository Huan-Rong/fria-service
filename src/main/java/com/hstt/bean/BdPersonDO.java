package com.hstt.bean;

import java.util.Date;

/**
 * 人员基础信息类。
 *
 * 该类包含了某一自然的相关基础信息，如姓名、性别、身份证号、出生年月、住址等等，但是不包含其人脸模板（图片）。
 * @author zhenghuanrong@yeah.net
 * @date 2017/6/7
 */
public class BdPersonDO {
    private Long id; //PK
    private String name; //姓名
    private Integer gender; //性别
    private String idCard; //身份证号
    private Date birthday; //出生年月
    private String address; //住址
    private String description; //描述信息
    private Integer type; //类别：未定义。
    private Integer status; //状态：未定义。
    private Date createdTime; //创建时间
}
