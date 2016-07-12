package com.example.administrator.androidframe.zito.frame.model;

import java.math.BigDecimal;

/**
 * 类描述:SysTradeOrder
 * 作者: 岳志远
 * 时间: 2016/2/16 13:36
 * 版本:
 */
public class SysTradeOrder {

    /**
     *  //子表主键
     */
    private int            orderId;
    /**
     *   //对应订单号
     */
    private String         tradeNo;
    /**
     *     //对应商品ID
     */
    private int    		   itemId;
    /**
     *	 //商品名
     */
    private String         title;
    /**
     * //单价
     */
    private BigDecimal price;
    /**
     *	 //购买数量
     */
    private String         num;
    /**
     *  //应付金额
     */
    private BigDecimal     totalFee;
    /**
     *    //最后修改时间
     */
    private String  modTime;
    /**
     *	//默认图片ID
     */
    private int  imageDefaultId;
    /**
     *	//图片地址
     */
    private String imageUrl;
    /**
     * status状态整数类型（1：未付款  2：等待卖家发货  3：卖家已发货  4：交易成功 5：交易关闭）
     */
    private int	  status;
    /**
     * 是否评论0未评论;1已评论;2已追加评论.
     */
    private String 		comment;

    public SysTradeOrder( String tradeNo, int itemId, String title, BigDecimal price, String num, BigDecimal totalFee, String modTime, String imageUrl, int status, String comment) {
        this.tradeNo = tradeNo;
        this.itemId = itemId;
        this.title = title;
        this.price = price;
        this.num = num;
        this.totalFee = totalFee;
        this.modTime = modTime;
        this.imageUrl = imageUrl;
        this.status = status;
        this.comment = comment;
    }

    /**
     * get、set方法
     */

    public int getOrderId() {
        return orderId;
    }
    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }
    public String getTradeNo() {
        return tradeNo;
    }
    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
    }
    public int getItemId() {
        return itemId;
    }
    public void setItemId(int itemId) {
        this.itemId = itemId;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public BigDecimal getPrice() {
        return price;
    }
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getNum() {
        return num;
    }
    public void setNum(String num) {
        this.num = num;
    }
    public BigDecimal getTotalFee() {
        return totalFee;
    }
    public void setTotalFee(BigDecimal totalFee) {
        this.totalFee = totalFee;
    }
    public String getModTime() {
        return modTime;
    }
    public void setModTime(String modTime) {
        this.modTime = modTime;
    }
    public int getImageDefaultId() {
        return imageDefaultId;
    }
    public void setImageDefaultId(int imageDefaultId) {
        this.imageDefaultId = imageDefaultId;
    }
    /**
     * status状态整数类型（1：未付款  2：等待卖家发货  3：卖家已发货  4：交易成功 5：交易关闭）
     */
    public int getStatus() {
        return status;
    }
    /**
     * status状态整数类型（1：未付款  2：等待卖家发货  3：卖家已发货  4：交易成功 5：交易关闭）
     */
    public void setStatus(int status) {
        this.status = status;
    }
    public String getImageUrl() {
        return imageUrl;
    }
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
    public String getComment() {
        return comment;
    }
    public void setComment(String comment) {
        this.comment = comment;
    }

}
