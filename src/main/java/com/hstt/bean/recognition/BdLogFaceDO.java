package com.hstt.bean.recognition;

import java.sql.Blob;

/**
 * @author zhenghuanrong@yeah.net
 * @date 2017/6/8
 */
public class BdLogFaceDO {
    private Long id; //PK
    private Blob logFaceImg; //比对小图
    private String logFaceImgPath; //比对小图路径
}
