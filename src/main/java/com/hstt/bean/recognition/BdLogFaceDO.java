package com.hstt.bean.recognition;

import java.util.Date;

/**
 * @author zhenghuanrong@yeah.net
 * @date 2017/6/8
 */
public class BdLogFaceDO {
    private Long id; //PK
    private String logFaceImgPath; //比对人脸小图路径
    private Date createdTime; //创建时间

    private BdLogDO bdLogDO;
}
