package com.hstt.bean.recognition;

/**
 * 摄像枪。
 * @author zhenghuanrong@yeah.net
 * @since 2017/6/8
 */
public class BdCameraDO {
    private Long id; //PK
    private String cameraIp; //摄像枪IP地址
    private String cameraName; //摄像枪名字
    private String cameraInstallationSite; //摄像枪安装位置
    private Integer type; //摄像枪功能类型，未定义。TODO
    private Integer status; //状态：1表示启用，2表示停用。

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCameraIp() {
        return cameraIp;
    }

    public void setCameraIp(String cameraIp) {
        this.cameraIp = cameraIp;
    }

    public String getCameraName() {
        return cameraName;
    }

    public void setCameraName(String cameraName) {
        this.cameraName = cameraName;
    }

    public String getCameraInstallationSite() {
        return cameraInstallationSite;
    }

    public void setCameraInstallationSite(String cameraInstallationSite) {
        this.cameraInstallationSite = cameraInstallationSite;
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
}
