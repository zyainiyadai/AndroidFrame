package com.example.administrator.androidframe.zito.frame.model;

import java.util.List;

/**
 * 类描述:订单集合
 * 作者: 岳志远
 * 时间: 2016/2/16 13:45
 * 版本:
 */
public class OrderPageList {

    /**商店id*/
    private String shopId;
    /**商店名*/
    private String shopName;
    /**
     *生成时间
     **/
    private String bookTime;
    /**
     *清楚没有
     **/
    private String clearNo;
    /**
     *交付时间
     **/
    private String consignTime;
    /**
     *公司名称
     **/
    private String corpName      ;
    /**
     *结束时间
     **/
    private String  endTime      ;
    /**
     *完成时间
     **/
    private String    fulfillTime      ;
    /**
     *货款金额
     **/
    private String goodsFee      ;
    /**
     *昵称
     **/
    private String  nickname      ;
    /**
     *付款时间
     支付日期
     **/
    private String   payTime      ;
    /**
     *支付类型
     **/
    private String payType      ;
    /**
     *付款
     **/
    private String  payment      ;
    /**
     *客付邮费
     **/
    private String postFee      ;
    /**
     *接收方地址
     **/
    private String       receiverAddress      ;
    /**
     *接收方的城市
     **/
    private String   receiverCity      ;
    /**
     *接收方的县区
     **/
    private String receiverDistrict      ;
    /**
     *接收方的手机
     **/
    private String receiverMobile      ;
    /**
     *接收方名字
     **/
    private String   receiverName      ;
    /**
     *接收方状态
     **/
    private String   receiverState      ;
    /**
     *接收方邮政编码
     **/
    private String   receiverZip      ;
    /**
     *状态
     **/
    private String    status      ;
    /**
     *订单集合
     **/
    private List<SysTradeOrder> sysTradeOrder ;
    /**
     *税费
     **/
    private String    taxFee      ;
    /**
     *系统订单号
     **/
    private String    tradeNo            ;


    public OrderPageList(String status, String tradeNo) {
        this.status = status;
        this.tradeNo = tradeNo;
    }

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public OrderPageList(String status) {
        this.status = status;
    }

    public String getBookTime() {
        return bookTime;
    }

    public void setBookTime(String bookTime) {
        this.bookTime = bookTime;
    }

    public String getClearNo() {
        return clearNo;
    }

    public void setClearNo(String clearNo) {
        this.clearNo = clearNo;
    }

    public String getConsignTime() {
        return consignTime;
    }

    public void setConsignTime(String consignTime) {
        this.consignTime = consignTime;
    }

    public String getCorpName() {
        return corpName;
    }

    public void setCorpName(String corpName) {
        this.corpName = corpName;
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

    public String getGoodsFee() {
        return goodsFee;
    }

    public void setGoodsFee(String goodsFee) {
        this.goodsFee = goodsFee;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPayTime() {
        return payTime;
    }

    public void setPayTime(String payTime) {
        this.payTime = payTime;
    }

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType;
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }

    public String getPostFee() {
        return postFee;
    }

    public void setPostFee(String postFee) {
        this.postFee = postFee;
    }

    public String getReceiverAddress() {
        return receiverAddress;
    }

    public void setReceiverAddress(String receiverAddress) {
        this.receiverAddress = receiverAddress;
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

    public String getReceiverState() {
        return receiverState;
    }

    public void setReceiverState(String receiverState) {
        this.receiverState = receiverState;
    }

    public String getReceiverZip() {
        return receiverZip;
    }

    public void setReceiverZip(String receiverZip) {
        this.receiverZip = receiverZip;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<SysTradeOrder> getSysTradeOrder() {
        return sysTradeOrder;
    }

    public void setSysTradeOrder(List<SysTradeOrder> sysTradeOrder) {
        this.sysTradeOrder = sysTradeOrder;
    }

    public String getTaxFee() {
        return taxFee;
    }

    public void setTaxFee(String taxFee) {
        this.taxFee = taxFee;
    }

    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
    }


}
