package com.hstt.bean.recognition;

import java.util.Date;

/**
 * @author zhenghuanrong@yeah.net
 * @date 2017/6/8
 */
public class BdLogDO {
    private Long id; //PK
    private String logEnvironmentImgPath; //比对日志环境图路径
    private Integer type; //比对类型
    private Date createdTime; //创建时间
}
