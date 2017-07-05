package com.hstt.bean.recognition;

import java.util.Date;

/**
 * 人员基础信息类。
 *
 * <p>该类包含了某一自然人的相关基础信息，如姓名、性别、身份证号、出生年月、住址等等，但是不包含其人脸模板（图片）。</p>
 * <p>为了适应更多的应用场景，该类只要求 id 和 createdTime 为必须字段。</p>
 *
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

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
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
