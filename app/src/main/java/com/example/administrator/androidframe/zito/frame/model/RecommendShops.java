package com.example.administrator.androidframe.zito.frame.model;

/**
 * 类描述:  推荐店铺实体类
 * 作者: 颜培福
 * 时间:2016/3/11 16:08
 * 版本:
 */
public class RecommendShops {

    /** 推荐id 主键 */
    private int recommendId;
    /** 店铺id */
    private int shopId;
    /** 推荐次序 */
    private int sequence;
    /** 删除标识 0正常 1删除 */
    private int disabled;
    /** 创建时间 */
    private String createTime;
    /** 最后修改时间 */
    private String modTime;
    /** 店铺名称 */
    private String shopName;
    /** 店铺logo路径 */
    private String shopLogoPath;

    public int getRecommendId() {
        return recommendId;
    }

    public void setRecommendId(int recommendId) {
        this.recommendId = recommendId;
    }

    public int getShopId() {
        return shopId;
    }

    public void setShopId(int shopId) {
        this.shopId = shopId;
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

    public String getModTime() {
        return modTime;
    }

    public void setModTime(String modTime) {
        this.modTime = modTime;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getShopLogoPath() {
        return shopLogoPath;
    }

    public void setShopLogoPath(String shopLogoPath) {
        this.shopLogoPath = shopLogoPath;
    }
}
