package com.example.administrator.androidframe.zito.frame.model;

/**
 * 类描述:
 * 作者: 颜培福
 * 时间:2016/3/10 16:31
 * 版本:
 */
public class Banner {
    /** 主键 */
    private int bannerId;
    /** 跳转类型 商品 店铺 不跳转 */
    private String jumpType;
    /** 跳转链接 商品id 或店铺id 或者URL */
    private String jumpUrl;
    /** 图片id */
    private int imageId;
    /** 次序 */
    private int sequence;
    /** 图片URL路径 */
    private String imagePath;

    public int getBannerId() {
        return bannerId;
    }

    public void setBannerId(int bannerId) {
        this.bannerId = bannerId;
    }

    public String getJumpType() {
        return jumpType;
    }

    public void setJumpType(String jumpType) {
        this.jumpType = jumpType;
    }

    public String getJumpUrl() {
        return jumpUrl;
    }

    public void setJumpUrl(String jumpUrl) {
        this.jumpUrl = jumpUrl;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public int getSequence() {
        return sequence;
    }

    public void setSequence(int sequence) {
        this.sequence = sequence;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }
}
