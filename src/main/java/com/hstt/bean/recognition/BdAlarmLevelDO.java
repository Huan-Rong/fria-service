package com.hstt.bean.recognition;

/**
 * 用户自定义告警级别。
 *
 * @author HuanRong(zhenghuanrong@yeah.net)
 */
public class BdAlarmLevelDO {
    private Long id; //PK
    private Integer alarmLevelCode; //告警级别代码
    private String alarmLevelName;  //告警级别名字，与告警级别代码一一对应。
}
