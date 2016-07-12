package com.example.administrator.androidframe.zito.frame.model;

/**
 * 类描述:  栏目导航
 * 作者: 颜培福
 * 时间:2016/3/11 09:13
 * 版本:
 */
public class ColumnNavigation {

    /** 导航id 主键 */
    private int navigationId;
    /** 导航名称 */
    private String navigationName;
    /** 导航描述 */
    private String navigationDes;
    /** 导航次序 */
    private int sequence;
    /** 图片id */
    private int imageId;
    /** 图片批次号 */
    private String batchNo;
    /** 删除标识 0未删除 1已删除 */
    private int disabled;
    /** 创建时间 */
    private String createTime;
    /** 最后修改时间 */
    private String modTime;
    /** 图片路径 */
    private String imagePath;


    public int getNavigationId() {
        return navigationId;
    }

    public void setNavigationId(int navigationId) {
        this.navigationId = navigationId;
    }

    public String getNavigationName() {
        return navigationName;
    }

    public void setNavigationName(String navigationName) {
        this.navigationName = navigationName;
    }

    public String getNavigationDes() {
        return navigationDes;
    }

    public void setNavigationDes(String navigationDes) {
        this.navigationDes = navigationDes;
    }

    public int getSequence() {
        return sequence;
    }

    public void setSequence(int sequence) {
        this.sequence = sequence;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public String getBatchNo() {
        return batchNo;
    }

    public void setBatchNo(String batchNo) {
        this.batchNo = batchNo;
    }

    public int getDisabled() {
        return disabled;
    }

    public void setDisabled(int disabled) {
        this.disabled = disabled;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getModTime() {
        return modTime;
    }

    public void setModTime(String modTime) {
        this.modTime = modTime;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }
}
