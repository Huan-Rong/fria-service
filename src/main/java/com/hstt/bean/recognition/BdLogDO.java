package com.hstt.bean.recognition;

import java.sql.Blob;

/**
 * @author zhenghuanrong@yeah.net
 * @date 2017/6/8
 */
public class BdLogDO {
    private Long id; //PK
    private Blob logImg; //比对日志源图
    private String logImgPath; //比对日志源图路径
}
