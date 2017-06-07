package com.hstt.bean;

import java.sql.Blob;
import java.util.Date;

/**
 * 人脸模板类。
 *
 * 需要考虑使用的场景：实时建模，单张建模，批量建模。
 *
 * 包含以下：
 *      人脸源图，源图的压缩图，源图的环境图
 *
 * @author zhenghuanrong@yeah.net
 * @since 2017/6/7
 *
 */
public class BdFaceDO {
    private Long id; //PK
    private Blob originalImg; //源图：Java 服务接收的所有的图片数据都为源图。
    private Blob compressedImg; //压缩图：Java 程序在内部将源图压缩得到压缩图。
    private Blob environmentImg; //环境图
    private String originalImgPath; //源图路径
    private String compressedImgPath; //压缩图路径
    private String environmentImgPath; //环境图路径

    private BdPersonDO bdPersonDO; //所属人员
    private BdLibraryDO bdLibraryDO; //所属人脸库

    private Integer type; //类型：未定义。
    private Integer status; //状态：未定义。
    private Date createdTime; //创建时间

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Blob getOriginalImg() {
        return originalImg;
    }

    public void setOriginalImg(Blob originalImg) {
        this.originalImg = originalImg;
    }

    public Blob getCompressedImg() {
        return compressedImg;
    }

    public void setCompressedImg(Blob compressedImg) {
        this.compressedImg = compressedImg;
    }

    public Blob getEnvironmentImg() {
        return environmentImg;
    }

    public void setEnvironmentImg(Blob environmentImg) {
        this.environmentImg = environmentImg;
    }

    public String getOriginalImgPath() {
        return originalImgPath;
    }

    public void setOriginalImgPath(String originalImgPath) {
        this.originalImgPath = originalImgPath;
    }

    public String getCompressedImgPath() {
        return compressedImgPath;
    }

    public void setCompressedImgPath(String compressedImgPath) {
        this.compressedImgPath = compressedImgPath;
    }

    public String getEnvironmentImgPath() {
        return environmentImgPath;
    }

    public void setEnvironmentImgPath(String environmentImgPath) {
        this.environmentImgPath = environmentImgPath;
    }

    public BdPersonDO getBdPersonDO() {
        return bdPersonDO;
    }

    public void setBdPersonDO(BdPersonDO bdPersonDO) {
        this.bdPersonDO = bdPersonDO;
    }

    public BdLibraryDO getBdLibraryDO() {
        return bdLibraryDO;
    }

    public void setBdLibraryDO(BdLibraryDO bdLibraryDO) {
        this.bdLibraryDO = bdLibraryDO;
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
