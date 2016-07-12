package com.example.administrator.androidframe.zito.frame.model;

/**
 * 收藏店铺实体类
 * 作者：韩吉元
 * 时间：2016/2/22 10:36
 * 版本：V1.0
 */
public class ShopFavorite {
    private int shopFavoriteId;//主键
    private int userId;//买家用户id
    private String imagePath;//图片位置
    private String shopName;//商铺名称
    private String time;//收藏时间
    private String shopArea;//地区
    private String shopkeeperMobile;//店主电话
    private int fansNum;//人气
    private int shopId;

    public int getShopFavoriteId() {
        return shopFavoriteId;
    }

    public void setShopFavoriteId(int shopFavoriteId) {
        this.shopFavoriteId = shopFavoriteId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getShopArea() {
        return shopArea;
    }

    public void setShopArea(String shopArea) {
        this.shopArea = shopArea;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getShopkeeperMobile() {
        return shopkeeperMobile;
    }

    public void setShopkeeperMobile(String shopkeeperMobile) {
        this.shopkeeperMobile = shopkeeperMobile;
    }

    public int getFansNum() {
        return fansNum;
    }

    public void setFansNum(int fansNum) {
        this.fansNum = fansNum;
    }

    public int getShopId() {
        return shopId;
    }

    public void setShopId(int shopId) {
        this.shopId = shopId;
    }
}
