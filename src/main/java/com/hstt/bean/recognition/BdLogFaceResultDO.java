package com.hstt.bean.recognition;

import java.util.Date;

/**
 * 比对结果。
 *
 *     涉及的功能：多库比对，多库比对记录查询，人脸相关性
 *
 * @author zhenghuanrong@yeah.net
 * @since 2017/6/8
 */
public class BdLogFaceResultDO {
    private Long id; //PK
    private Double bdScore; //比对分数
    private String description; // 比对结果的描述信息。
    private Long cameraId; //摄像枪PK，进行比对的摄像枪。
    private String cameraName; //摄像枪名字
    private String cameraIp; //摄像枪IP
    private Integer type; //比对类型：1表示实时比对，2表示1:N比对，3表示1:1比对。
    private Integer status; //告警状态：1表示告警（但未处理），2表示不告警，3表示告警已处理。
    private Date createdTime; //创建时间，即比对时间。

    private BdLogFaceDO bdLogFaceDO;
    private BdFaceDO bdFaceDO; //比对结果模板：通过该属性可以得到人员基础信息和图片数据；这里需要注意，删除模板的同时会删除所有的比对结果记录。




}
