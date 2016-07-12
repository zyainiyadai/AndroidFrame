package com.example.administrator.androidframe.zito.frame.model;

import java.math.BigDecimal;
import java.util.List;

/**
 * 类描述:订单详情
 * 作者: 岳志远
 * 时间: 2016/2/18 13:13
 * 版本:
 */
public class OrderDetails {
    private String tradeNo;            //订单号
    private BigDecimal payment;            //实付金额,订单最终总额
    private BigDecimal goodsFee;            //货款
    private BigDecimal taxFee;                //税费
    private int payType;            //支付类型
    private String bookTime;            //下单时间
    private String payTime;            //支付时间
    private String consignTime;        //发货时间
    private String endTime;            //交易关闭时间
    private String fulfillTime;        //完成时间
    private String postFee;            //邮费
    private String receiverState;      //收货人所在省份
    private String receiverCity;       //收货人所在城市
    private String receiverDistrict;   //收货人所在地区
    private String receiverAddress;    //收货人详细地址
    private String receiverZip;        //收货人邮编
    private String receiverMobile;     //收货人手机号
    private String receiverName;       //收货人姓名
    private String clearNo;             //结算单号
    private String corpName;  //公司名称
    private int status;   //状态
    private List<SysTradeOrder> sysTradeOrder;//SysTradeOrder
    private String nickname; //昵称
    private String shopName;//商店名称
    private String shopId;//商店id
    /**
     * 订单优惠金额
     */
    private String couponTotal;

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
    }

    public BigDecimal getPayment() {
        return payment;
    }

    public void setPayment(BigDecimal payment) {
        this.payment = payment;
    }

    public BigDecimal getGoodsFee() {
        return goodsFee;
    }

    public void setGoodsFee(BigDecimal goodsFee) {
        this.goodsFee = goodsFee;
    }

    public BigDecimal getTaxFee() {
        return taxFee;
    }

    public void setTaxFee(BigDecimal taxFee) {
        this.taxFee = taxFee;
    }

    public int getPayType() {
        return payType;
    }

    public void setPayType(int payType) {
        this.payType = payType;
    }

    public String getBookTime() {
        return bookTime;
    }

    public void setBookTime(String bookTime) {
        this.bookTime = bookTime;
    }

    public String getPayTime() {
        return payTime;
    }

    public void setPayTime(String payTime) {
        this.payTime = payTime;
    }

    public String getConsignTime() {
        return consignTime;
    }

    public void setConsignTime(String consignTime) {
        this.consignTime = consignTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getFulfillTime() {
        return fulfillTime;
    }

    public void setFulfillTime(String fulfillTime) {
        this.fulfillTime = fulfillTime;
    }

    public String getPostFee() {
        return postFee;
    }

    public void setPostFee(String postFee) {
        this.postFee = postFee;
    }

    public String getReceiverState() {
        return receiverState;
    }

    public void setReceiverState(String receiverState) {
        this.receiverState = receiverState;
    }

    public String getReceiverCity() {
        return receiverCity;
    }

    public void setReceiverCity(String receiverCity) {
        this.receiverCity = receiverCity;
    }

    public String getReceiverDistrict() {
        return receiverDistrict;
    }

    public void setReceiverDistrict(String receiverDistrict) {
        this.receiverDistrict = receiverDistrict;
    }

    public String getReceiverAddress() {
        return receiverAddress;
    }

    public void setReceiverAddress(String receiverAddress) {
        this.receiverAddress = receiverAddress;
    }

    public String getReceiverZip() {
        return receiverZip;
    }

    public void setReceiverZip(String receiverZip) {
        this.receiverZip = receiverZip;
    }

    public String getReceiverMobile() {
        return receiverMobile;
    }

    public void setReceiverMobile(String receiverMobile) {
        this.receiverMobile = receiverMobile;
    }

    public String getReceiverName() {
        return receiverName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    public String getClearNo() {
        return clearNo;
    }

    public void setClearNo(String clearNo) {
        this.clearNo = clearNo;
    }

    public String getCorpName() {
        return corpName;
    }

    public void setCorpName(String corpName) {
        this.corpName = corpName;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public List<SysTradeOrder> getSysTradeOrder() {
        return sysTradeOrder;
    }

    public void setSysTradeOrder(List<SysTradeOrder> sysTradeOrder) {
        this.sysTradeOrder = sysTradeOrder;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getCouponTotal() {
        return couponTotal;
    }

    public void setCouponTotal(String couponTotal) {
        this.couponTotal = couponTotal;
    }
}
