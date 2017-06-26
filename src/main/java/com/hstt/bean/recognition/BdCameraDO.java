package com.hstt.bean.recognition;

import java.util.Date;

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
    private Integer type; //摄像枪功能类型，未定义。TODO 暂时
    private Integer status; //状态：1表示启用，2表示停用。
    private Date createdTime;
}
