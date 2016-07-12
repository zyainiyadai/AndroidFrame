package com.example.administrator.androidframe.zito.frame.model;

import java.math.BigDecimal;

/**
 * 收藏商品实体类
 * 作者：韩吉元
 * 时间：2016/2/22 10:36
 * 版本：V1.0
 */
public class ItemFavorite {
    private int itemFavoriteId;//主键
    private int userId;//买家用户id
    private String itemTitle;//商品标题
    private String imagePath;//图片位置
    private BigDecimal sellingPrice;//售价
    private int itemId;//商品id

    public int getItemFavoriteId() {
        return itemFavoriteId;
    }

    public void setItemFavoriteId(int itemFavoriteId) {
        this.itemFavoriteId = itemFavoriteId;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public BigDecimal getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(BigDecimal sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public String getItemTitle() {
        return itemTitle;
    }

    public void setItemTitle(String itemTitle) {
        this.itemTitle = itemTitle;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}
