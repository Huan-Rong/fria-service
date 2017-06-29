package com.hstt.bean.recognition;

import java.sql.Blob;
import java.util.Date;

/**
 * 人脸模板类。
 *
 * 需要考虑使用的场景：实时建模，单张建模，批量建模，以脸搜脸。
 *
 * 包含以下：
 *      人脸源图，源图的压缩图，源图的环境图
 *
 * 源图：Java 服务接收的所有的图片数据都为源图。
 * 压缩图：Java 程序在内部将源图压缩得到压缩图。
 * 环境图
 *
 * @author HuanRong(zhenghuanrong@yeah.net)
 */
public class BdFaceDO {
    private Long id; //PK
    private String originalImgPath; //源图路径
    private String compressedImgPath; //压缩图路径
    private String environmentImgPath; //环境图路径：用于实时建模。

    private BdPersonDO bdPersonDO; //所属人员
    private BdLibraryDO bdLibraryDO; //所属人脸库

    private Integer type; //类型：未定义。
    private Integer status; //状态：未定义。
    private Date createdTime; //创建时间
    private BdCameraDO bdCameraDO; //实时建模所用摄像枪，可能为 null.

}
