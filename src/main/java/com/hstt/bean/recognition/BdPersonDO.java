package com.hstt.bean.recognition;

import java.util.Date;

/**
 * 人员基础信息类。
 *
 * 该类包含了某一自然人的相关基础信息，如姓名、性别、身份证号、出生年月、住址等等，但是不包含其人脸模板（图片）。
 * 为了适应更多的应用场景，该类只要求 id 和 createdTime 为必须字段。
 * @author HuanRong(zhenghuanrong@yeah.net)
 */
public class BdPersonDO {
    private Long id; //PK
    private String personName; //姓名
    private String idCard; //身份证号
    private Integer gender; //性别
    private Date birthday; //出生年月
    private String personAddress; //住址
    private String personDescription; //描述信息
    private Integer type; //类别：未定义。
    private Integer status; //状态：未定义。
    private Date createdTime; //创建时间
}
