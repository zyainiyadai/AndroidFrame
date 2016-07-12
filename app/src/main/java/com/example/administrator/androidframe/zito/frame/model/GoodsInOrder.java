package com.example.administrator.androidframe.zito.frame.model;

import java.io.Serializable;

/**
 * 类描述:根据订单号查询产品信息的产品实体类
 * 作者: 岳志远
 * 时间: 2016/2/25 10:22
 * 版本:
 */
public class GoodsInOrder implements Serializable {
    /**
     * 评论
     */
    private String comment;  /*": "0微评论1已评论"*/
    /**
     * imageDefaultId
     */
    private String imageDefaultId;/*": 2600,*/
    /**
     * 地址图片广告地址
     */
    private String imageUrl;/*": "http://221.2.40.246:8089/scfshop_file/2016/02/16/80401201602040000000433804000433/4c1f033793a44f3ebb318003d53a3bbd.jpg",*/
    /**
     * 件号
     */
    private String itemId;/*": 19853,*/
    /**
     * 时间
     */
    private String modTime;/*": null,*/
    /**
     * 数量
     */
    private String num;/*": "2",*/
    /**
     * 子订单号
     */
    private String orderId;/*": 3758,*/
    /**
     * 价格
     */
    private String price;/*": 58,*/
    /**
     * 状态
     */
    private String status;/*": 1,*/
    /**
     * 标题
     */
    private String title;/*": "韩国正品Clio 珂莱欧 哑光染唇液",*/
    /**
     * 总费用
     */
    private String totalFee; /*116,*/
    /**
     * 订单号
     */
    private String tradeNo;/* null*/
    /**
     * 店铺
     */
    private int shopId;
    /**
     * 优惠金额
     */
    private String couponMoney;
    /**
     * 促销内容
     */
    private String conditionValue;

    public GoodsInOrder(String price, String itemId, String orderId, String status, String title, String num, String totalFee, String imageUrl,
                        String comment) {
        this.itemId = itemId;
        this.orderId = orderId;
        this.status = status;
        this.title = title;
        this.num = num;
        this.totalFee = totalFee;
        this.imageUrl = imageUrl;
        this.price = price;
        this.comment = comment;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getImageDefaultId() {
        return imageDefaultId;
    }

    public void setImageDefaultId(String imageDefaultId) {
        this.imageDefaultId = imageDefaultId;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getModTime() {
        return modTime;
    }

    public void setModTime(String modTime) {
        this.modTime = modTime;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTotalFee() {
        return totalFee;
    }

    public void setTotalFee(String totalFee) {
        this.totalFee = totalFee;
    }

    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
    }

    public int getShopId() {
        return shopId;
    }

    public void setShopId(int shopId) {
        this.shopId = shopId;
    }

    public String getCouponMoney() {
        return couponMoney;
    }

    public void setCouponMoney(String couponMoney) {
        this.couponMoney = couponMoney;
    }

    public String getConditionValue() {
        return conditionValue;
    }

    public void setConditionValue(String conditionValue) {
        this.conditionValue = conditionValue;
    }
}
