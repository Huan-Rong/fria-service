package com.hstt.bean;

import java.util.Date;

/**
 * 人员基础信息类。
 *
 * 该类包含了某一自然的相关基础信息，如姓名、性别、身份证号、出生年月、住址等等，但是不包含其人脸模板（图片）。
 * @author zhenghuanrong@yeah.net
 * @since 2017/6/7
 */
public class BdPersonDO {
    private Long id; //PK
    private String personName; //姓名
    private Integer gender; //性别
    private String idCard; //身份证号
    private Date birthday; //出生年月
    private String personAddress; //住址
    private String personDescription; //描述信息
    private Integer type; //类别：未定义。
    private Integer status; //状态：未定义。
    private Date createdTime; //创建时间

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getPersonAddress() {
        return personAddress;
    }

    public void setPersonAddress(String personAddress) {
        this.personAddress = personAddress;
    }

    public String getPersonDescription() {
        return personDescription;
    }

    public void setPersonDescription(String personDescription) {
        this.personDescription = personDescription;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }
}
