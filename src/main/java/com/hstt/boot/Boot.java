package com.hstt.boot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author zhenghuanrong@yeah.net
 * @since 2017/6/26
 */
public class Boot {

    private static Logger logger = LoggerFactory.getLogger(Boot.class);

    public static void main(String[] args) {
        // 系统启动
        logger.info("FRIA is booting now...");

        // 系统初始化与配置
        logger.info("FRIA system is init...");

    }
}
