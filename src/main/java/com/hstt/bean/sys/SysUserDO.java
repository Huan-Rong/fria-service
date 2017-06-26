package com.hstt.bean.sys;

import java.util.Date;

/**
 * @author zhenghuanrong@yeah.net
 * @date 2017/6/26
 */
public class SysUserDO {
    private Long id; //PK
    private String username; //用户名：唯一性。
    private String loginName; //登录名
    private String password; //密码：需要进行加密。
    private Integer state; //状态：未定义。TODO
    private String email; //电子邮箱：唯一性。
    private Integer isEmailUsed; //是否启用电子邮箱报警功能
    private SysOrganizationDO sysOrganizationDO; //用户所属组织架构
    private Date createdTime; //创建时间
}
