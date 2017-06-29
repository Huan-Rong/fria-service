package com.hstt.bean.recognition;

import com.hstt.bean.sys.SysOrganizationDO;

import java.util.Date;

/**
 * 人脸库。
 *
 * 一个人脸模板只属于一个人脸库。一个人脸库可以含有多张人脸模板。
 * 一个人可以有多张人脸模板，它们可以同时属于同一个库，也可以属于多个不同的库。
 *
 * @author HuanRong(zhenghuanrong@yeah.net)
*/
public class BdLibraryDO {
    private Long id; //PK
    private String libraryName; //库名
    private Integer libraryType; //类别：未定义。
    private Integer libraryStatus; //状态：未定义。
    private SysOrganizationDO sysOrganizationDO; //人脸库所属组织架构，默认为创建该人脸库的用户所在的组织架构。该属性不可为空。
    private Date createdTime; //创建时间

}
