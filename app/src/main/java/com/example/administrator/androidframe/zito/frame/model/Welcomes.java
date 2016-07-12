package com.example.administrator.androidframe.zito.frame.model;

/**
 * 类描述:   欢迎页
 * 作者: 颜培福
 * 时间:2016/3/14 09:50
 * 版本:
 */
public class Welcomes {

    private int welcomeId; // 欢迎页Id

    private int imageId; // 图片id

    private int sequence; // 次序

    private int disabled; // 删除表示 0正常 1删除

    private String createTime; // 创建时间
    private String imagePath;// 图片路径

    private String url;//欢迎页链接


    public int getWelcomeId() {
        return welcomeId;
    }

    public void setWelcomeId(int welcomeId) {
        this.welcomeId = welcomeId;
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

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
