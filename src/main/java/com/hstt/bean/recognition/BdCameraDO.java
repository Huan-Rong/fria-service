package com.hstt.bean.recognition;

import java.util.Date;

/**
 * 摄像枪。
 * @author HuanRong(zhenghuanrong@yeah.net)
 */
public class BdCameraDO {
    private Long id; //PK
    private String cameraIp; //摄像枪IP地址
    private String cameraName; //摄像枪名字
    private String cameraInstallationSite; //摄像枪安装位置
    private Integer type; //摄像枪功能类型: 1表示摄像枪用于人脸识别；2表示摄像枪用于车牌识别；3表示摄像枪同时用于人脸和车牌识别。
    private Integer status; //状态：1表示启用，2表示停用。
    private Date createdTime;
}
