package com.example.administrator.androidframe.zito.frame.model;

/**
 * 类描述:
 * 作者: 岳志远
 * 时间: 2016/3/2 11:58
 * 版本:
 */
public class ShopCartDataBase {
    private String shopName;
    private String shopId;
    private String goodsImg;
    private String goodsName;
    private String itemId;
    private String quantity;
    private String ischecked;
    private String danjia;

    public ShopCartDataBase(String shopName, String shopId, String goodsImg, String goodsName, String itemId,
                            String quantity, String ischecked, String danjia) {
        this.shopName = shopName;
        this.shopId = shopId;
        this.goodsImg = goodsImg;
        this.goodsName = goodsName;
        this.itemId = itemId;
        this.quantity = quantity;
        this.ischecked = ischecked;
        this.danjia = danjia;
    }

    public String getDanjia() {
        return danjia;
    }

    public void setDanjia(String danjia) {
        this.danjia = danjia;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getGoodsImg() {
        return goodsImg;
    }

    public void setGoodsImg(String goodsImg) {
        this.goodsImg = goodsImg;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getIschecked() {
        return ischecked;
    }

    public void setIschecked(String ischecked) {
        this.ischecked = ischecked;
    }

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }
}
