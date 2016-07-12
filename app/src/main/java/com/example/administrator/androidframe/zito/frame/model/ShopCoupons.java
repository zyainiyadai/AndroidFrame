package com.example.administrator.androidframe.zito.frame.model;

/**
 * 类描述:店铺优惠券
 * 作者: 岳志远
 * 时间: 2016/4/7 10:24
 * 版本:
 */
public class ShopCoupons {
    private String    cansendEndTime;//      领取结束时减
    private String        cansendStartTime;//": "2016/04/01 ",   领取开始时间
    private String       canuseEndTime;//": " 2016/04/30",   使用结束时间
    private String         canuseStartTime;//": "2016/04/01 ",   使用开始时间
    private String         contend;//": null,争论
    private String        couponDesc;//": null,
    private String        couponId;//": 3,
    private String        couponKey;//": null,
    private String        couponName;//": null,
    private String        couponPrefix;//": null,
    private String         couponStatus;//": null,
    private String         createdTime;//": null,
    private String         deductMoney;//": 1,       满10减1
    private String         gradeName;//": null,
    private String        id;//": 0,
    private String         limitMoney;//": 10,       满10减1
    private String        maxGenQuantity;//": 100,     总数量
    private String       promotionTag;//": null,
    private String        sendCouponcodeQuantity;//": 0,
    private String        shopId;//": 1,
    private String        shopName;//": "万国惠",
    private String         useBound;//": null,
    private String         usedPlatform;//": null,
    private String         userlimitQuantity;//": 20,领取次数
    private String        validGrade;//": "1,2,3,4,5,6,7,8"

    public ShopCoupons(String cansendEndTime, String cansendStartTime, String canuseEndTime, String canuseStartTime, String deductMoney, String limitMoney, String maxGenQuantity
            , String shopName, String shopId, String userlimitQuantity,String couponId) {
        this.cansendEndTime = cansendEndTime;
        this.cansendStartTime = cansendStartTime;
        this.canuseEndTime = canuseEndTime;
        this.canuseStartTime = canuseStartTime;
        this.deductMoney = deductMoney;
        this.limitMoney = limitMoney;
        this.maxGenQuantity = maxGenQuantity;
        this.shopName = shopName;
        this.shopId = shopId;
        this.userlimitQuantity = userlimitQuantity;
        this.couponId = couponId;
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
}
