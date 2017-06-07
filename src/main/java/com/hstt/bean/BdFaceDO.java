package com.hstt.bean;

import java.sql.Blob;

/**
 * 人脸模板类。
 *
 * 需要考虑使用的场景：实时建模，单张建模，批量建模。
 *
 * 包含以下：
 *      人脸源图，源图的压缩图，源图的环境图
 */
public class BdFaceDO {
    private Long id;
    private Blob originalImg;
    private Blob compressedImg;
    private Blob environmentImg;
    private String originalImgPath;
    private String compressedImgPath;
    private String environmentImgPath;
}
