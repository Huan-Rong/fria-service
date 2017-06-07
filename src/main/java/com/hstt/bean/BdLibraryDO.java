package com.hstt.bean;

import java.util.Date;

/**
 * 人脸库。
 *
 * 一个人脸模板只属于一个人脸库。一个人脸库可以含有多张人脸模板。
 * 一个人可以有多张人脸模板，它们可以同时属于同一个库，也可以属于多个不同的库。
 *
 * @author zhenghuanrong@yeah.net
 * @since 2017/6/7
 */
public class BdLibraryDO {
    private Long id; //PK
    private String libraryName; //库名
    private Integer libraryType; //类别：未定义。
    private Integer libraryStatus; //状态：未定义。
    private Date createdTime; //创建时间

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLibraryName() {
        return libraryName;
    }

    public void setLibraryName(String libraryName) {
        this.libraryName = libraryName;
    }

    public Integer getLibraryType() {
        return libraryType;
    }

    public void setLibraryType(Integer libraryType) {
        this.libraryType = libraryType;
    }

    public Integer getLibraryStatus() {
        return libraryStatus;
    }

    public void setLibraryStatus(Integer libraryStatus) {
        this.libraryStatus = libraryStatus;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }
}
