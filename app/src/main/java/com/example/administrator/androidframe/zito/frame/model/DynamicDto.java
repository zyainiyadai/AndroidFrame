package com.example.administrator.androidframe.zito.frame.model;

import java.math.BigDecimal;

/**
 * 类描述：店铺动态实体类
 * 作者：刘士良
 * 时间：2016/2/25 09:49
 * 版本：
 */
public class DynamicDto {
    /** 店铺id */
    private int shopId;
    /** 动态id */
    private int dynamicId;
    /** 类型---新品-newItem;热销-hotsell;推荐-recommend;新鲜事-？; */
    private String type;
    /** 文字内容 */
    private String content;
    /** 创建时间 */
    private String createTime;

    private int itemId; // 商品ID
    private String itemTitle; // 商品 标题（商品名称）
    private String subhead; // 副标题
    private BigDecimal sellingPrice; // 售价
    private int imageDefaultId; // 默认图片ID
    private String imgPath; // 附加属性：默认图片的路径

    public int getShopId() {
        return shopId;
    }

    public void setShopId(int shopId) {
        this.shopId = shopId;
    }

    public int getDynamicId() {
        return dynamicId;
    }

    public void setDynamicId(int dynamicId) {
        this.dynamicId = dynamicId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getItemTitle() {
        return itemTitle;
    }

    public void setItemTitle(String itemTitle) {
        this.itemTitle = itemTitle;
    }

    public String getSubhead() {
        return subhead;
    }

    public void setSubhead(String subhead) {
        this.subhead = subhead;
    }

    public BigDecimal getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(BigDecimal sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public int getImageDefaultId() {
        return imageDefaultId;
    }

    public void setImageDefaultId(int imageDefaultId) {
        this.imageDefaultId = imageDefaultId;
    }

    public String getImgPath() {
        return imgPath;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }
}
