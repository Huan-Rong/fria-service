package com.hstt.bean;

import java.util.Date;

/**
 * 人脸库。
 *
 * 一个人脸模板只属于一个人脸库。一个人脸库可以含有多张人脸模板。
 * 一个人可以有多张人脸模板，它们可以同时属于同一个库，也可以属于多个不同的库。
 *
 * @author zhenghuanrong@yeah.net
 * @date 2017/6/7
 */
public class BdLibraryDO {
    private Long id; //PK
    private String name; //库名
    private Integer type; //类别：未定义。
    private Integer status; //状态：未定义。
    private Date createdTime; //创建时间
}
