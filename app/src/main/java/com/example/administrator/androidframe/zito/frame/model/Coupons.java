package com.example.administrator.androidframe.zito.frame.model;

/**
 * 类描述:获取用户优惠券
 * 作者: 岳志远
 * 时间: 2016/4/5 12:58
 * 版本:
 */
public class Coupons {

    /**
     * 活动结束时间
     */
    private String cansendEndTime;//": null,
    /**
     * 活动开始时间
     */
    private String cansendStartTime;//": null,
    /**
     * 优惠券使用结束时间
     */
    private String canuseEndTime;//": " 2016/04/30",
    /**
     * 优惠券使用开始时间
     */
    private String canuseStartTime;//": "2016/04/01 ",
    /**
     * vi. 竞争；奋斗；斗争；争论
     */
    private String contend;//": null,
    /**
     * 优惠券Desc
     */
    private String couponDesc;//": null,
    /**
     * 优惠券ID
     */
    private String couponId;//": 3,
    /**
     * 优惠券的关键
     */
    private String couponKey;//": null,
    /**
     * 优惠券名称
     */
    private String couponName;//": null,
    /**
     * 优惠券的前缀
     */
    private String couponPrefix;//": null,
    /**
     * 状态
     */
    private String couponStatus;//": null,
    /*创建时间**/
    private String createdTime;//": null,
    /**
     * 扣钱
     */
    private String deductMoney;//": 1,
    /***/
    private String gradeName;//": null,
    /**
     * id
     */
    private String id;//": 1,
    /**
     * 限制资金
     */
    private String limitMoney;//": 10,
    /**
     * 最大数量
     */
    private String maxGenQuantity;//": 100,
    /**
     * 促销标签
     */
    private String promotionTag;//": null,
    /**
     * 发送Couponcode数量
     */
    private String sendCouponcodeQuantity;//": 0,
    /**
     * shopId
     */
    private String shopId;//": 1,
    /**
     * shopName
     */
    private String shopName;//": "万国惠",
    /**
     * 使用绑定
     */
    private String useBound;//": null,
    /**
     * 使用平台
     */
    private String usedPlatform;//": null,
    /**
     * user limit Quantity
     */
    private String userlimitQuantity;//": 20,
    /**
     * 有效的成绩
     */
    private String validGrade;//": "1,2,3,4,5,6,7,8"
    private String status;//优惠券状态
    private String useTime;//优惠券使用时间
    private String tradeNo;//优惠券使用订单号

    public Coupons(String couponName, String couponId, String id, String shopId,String deductMoney) {
        this.couponName = "请选择";
        this.couponId = couponId;
        this.id = id;
        this.shopId=shopId;
        this.deductMoney="0";
    }

    public String getCansendEndTime() {
        return cansendEndTime;
    }

    public void setCansendEndTime(String cansendEndTime) {
        this.cansendEndTime = cansendEndTime;
    }

    public String getCansendStartTime() {
        return cansendStartTime;
    }

    public void setCansendStartTime(String cansendStartTime) {
        this.cansendStartTime = cansendStartTime;
    }

    public String getCanuseEndTime() {
        return canuseEndTime;
    }

    public void setCanuseEndTime(String canuseEndTime) {
        this.canuseEndTime = canuseEndTime;
    }

    public String getCanuseStartTime() {
        return canuseStartTime;
    }

    public void setCanuseStartTime(String canuseStartTime) {
        this.canuseStartTime = canuseStartTime;
    }

    public String getContend() {
        return contend;
    }

    public void setContend(String contend) {
        this.contend = contend;
    }

    public String getCouponDesc() {
        return couponDesc;
    }

    public void setCouponDesc(String couponDesc) {
        this.couponDesc = couponDesc;
    }

    public String getCouponId() {
        return couponId;
    }

    public void setCouponId(String couponId) {
        this.couponId = couponId;
    }

    public String getCouponKey() {
        return couponKey;
    }

    public void setCouponKey(String couponKey) {
        this.couponKey = couponKey;
    }

    public String getCouponName() {
        return couponName;
    }

    public void setCouponName(String couponName) {
        this.couponName = couponName;
    }

    public String getCouponPrefix() {
        return couponPrefix;
    }

    public void setCouponPrefix(String couponPrefix) {
        this.couponPrefix = couponPrefix;
    }

    public String getCouponStatus() {
        return couponStatus;
    }

    public void setCouponStatus(String couponStatus) {
        this.couponStatus = couponStatus;
    }

    public String getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }

    public String getDeductMoney() {
        return deductMoney;
    }

    public void setDeductMoney(String deductMoney) {
        this.deductMoney = deductMoney;
    }

    public String getGradeName() {
        return gradeName;
    }

    public void setGradeName(String gradeName) {
        this.gradeName = gradeName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLimitMoney() {
        return limitMoney;
    }

    public void setLimitMoney(String limitMoney) {
        this.limitMoney = limitMoney;
    }

    public String getMaxGenQuantity() {
        return maxGenQuantity;
    }

    public void setMaxGenQuantity(String maxGenQuantity) {
        this.maxGenQuantity = maxGenQuantity;
    }

    public String getPromotionTag() {
        return promotionTag;
    }

    public void setPromotionTag(String promotionTag) {
        this.promotionTag = promotionTag;
    }

    public String getSendCouponcodeQuantity() {
        return sendCouponcodeQuantity;
    }

    public void setSendCouponcodeQuantity(String sendCouponcodeQuantity) {
        this.sendCouponcodeQuantity = sendCouponcodeQuantity;
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

    public String getUseBound() {
        return useBound;
    }

    public void setUseBound(String useBound) {
        this.useBound = useBound;
    }

    public String getUsedPlatform() {
        return usedPlatform;
    }

    public void setUsedPlatform(String usedPlatform) {
        this.usedPlatform = usedPlatform;
    }

    public String getUserlimitQuantity() {
        return userlimitQuantity;
    }

    public void setUserlimitQuantity(String userlimitQuantity) {
        this.userlimitQuantity = userlimitQuantity;
    }

    public String getValidGrade() {
        return validGrade;
    }

    public void setValidGrade(String validGrade) {
        this.validGrade = validGrade;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getUseTime() {
        return useTime;
    }

    public void setUseTime(String useTime) {
        this.useTime = useTime;
    }

    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
    }

    public Coupons(String couponId, String shopName, String shopId, String canuseStartTime, String canuseEndTime, String deductMoney, String limitMoney, String id, String tradeNo, String couponDesc, String useTime) {
        this.couponId = couponId;
        this.shopName = shopName;
        this.shopId = shopId;
        this.canuseStartTime = canuseStartTime;
        this.canuseEndTime = canuseEndTime;
        this.deductMoney = deductMoney;
        this.limitMoney = limitMoney;
        this.id = id;
        this.tradeNo = tradeNo;
        this.couponDesc = couponDesc;
        this.useTime = useTime;
    }
}
