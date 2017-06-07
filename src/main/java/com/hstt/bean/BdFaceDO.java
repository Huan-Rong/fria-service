package com.hstt.bean;

import java.sql.Blob;

/**
 * 人脸模板类。
 *
 * 需要考虑使用的场景：实时建模，单张建模，批量建模。
 *
 * 包含以下：
 *      人脸源图，源图的压缩图，源图的环境图
 *
 *
 */
public class BdFaceDO {
    private Long id; //PK
    private Blob originalImg; //源图：Java 服务接收的所有的图片数据都为源图。
    private Blob compressedImg; //压缩图：Java 程序在内部将源图压缩得到压缩图。
    private Blob environmentImg; //环境图
    private String originalImgPath; //源图路径
    private String compressedImgPath; //压缩图路径
    private String environmentImgPath; //环境图路径

    private BdPersonDO bdPersonDO; //所属人员
    private BdLibraryDO bdLibraryDO; //所属人脸库
}
