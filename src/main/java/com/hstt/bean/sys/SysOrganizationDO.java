package com.hstt.bean.sys;

import java.util.Date;

/**
 * @author zhenghuanrong@yeah.net
 * @date 2017/6/26
 */
public class SysOrganizationDO {
    private Long id; //PK
    private String organizationName; //组织架构名称
    private SysOrganizationDO parentSysOrganizationDO; //上一级组织架构
    private Date createdTime; //创建时间
}
