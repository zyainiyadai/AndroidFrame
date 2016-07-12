package com.example.administrator.androidframe.zito.frame.model;

import java.util.List;

/**
 * 类描述:   商品详情 优惠实体类
 * 作者: 颜培福
 * 时间:2016/3/1 13:21
 * 版本:
 */
public class ProDto {


    private List list;
    private String type;//营销类型：1：满减 2：满折 3：优惠卷4：免邮 5：x件y折管理
    private String conditionValue;//满减值
    private int id;// 满减或满折或x件y折规则Id
    private int condition;// 条件 满90元,减10元 条件就是90
    private int discount;// 优惠 满90元,减10元 优惠就是10

    private int xydiscountId;    //X件Y折规则id
    private int shopId;    //所属商家的店铺id
    private String xydiscountName;    //X件Y折规则名称
    private String xydiscountDesc;    //规则描述
    private int usedPlatform;    //使用平台id
    private String useBound;    //使用范围
    private String validGrade;    //会员等级集合id
    private int joinLimit;    //可参与次数
    private int limitNumber;    //满足条件件数
    private String createdTime;    //创建时间
    private String startTime;    //起始时间
    private String endTime;    //截止时间
    private int xydiscountStatus;    //促销状态id
    private String usePlatName;//使用平台中文名
    private String statusName;//促销状态中文名
    private String gradeName;//会员等级集合中文名
    private int itemId;//商品id


    public int getXydiscountId() {
        return xydiscountId;
    }

    public void setXydiscountId(int xydiscountId) {
        this.xydiscountId = xydiscountId;
    }

    public int getShopId() {
        return shopId;
    }

    public void setShopId(int shopId) {
        this.shopId = shopId;
    }

    public String getXydiscountName() {
        return xydiscountName;
    }

    public void setXydiscountName(String xydiscountName) {
        this.xydiscountName = xydiscountName;
    }

    public String getXydiscountDesc() {
        return xydiscountDesc;
    }

    public void setXydiscountDesc(String xydiscountDesc) {
        this.xydiscountDesc = xydiscountDesc;
    }

    public int getUsedPlatform() {
        return usedPlatform;
    }

    public void setUsedPlatform(int usedPlatform) {
        this.usedPlatform = usedPlatform;
    }

    public String getUseBound() {
        return useBound;
    }

    public void setUseBound(String useBound) {
        this.useBound = useBound;
    }

    public String getValidGrade() {
        return validGrade;
    }

    public void setValidGrade(String validGrade) {
        this.validGrade = validGrade;
    }

    public int getJoinLimit() {
        return joinLimit;
    }

    public void setJoinLimit(int joinLimit) {
        this.joinLimit = joinLimit;
    }

    public int getLimitNumber() {
        return limitNumber;
    }

    public void setLimitNumber(int limitNumber) {
        this.limitNumber = limitNumber;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public String getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public int getXydiscountStatus() {
        return xydiscountStatus;
    }

    public void setXydiscountStatus(int xydiscountStatus) {
        this.xydiscountStatus = xydiscountStatus;
    }

    public String getUsePlatName() {
        return usePlatName;
    }

    public void setUsePlatName(String usePlatName) {
        this.usePlatName = usePlatName;
    }

    public String getStatusName() {
        return statusName;
    }

    public void setStatusName(String statusName) {
        this.statusName = statusName;
    }

    public String getGradeName() {
        return gradeName;
    }

    public void setGradeName(String gradeName) {
        this.gradeName = gradeName;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List getList() {
        return list;
    }

    public void setList(List list) {
        this.list = list;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getConditionValue() {
        return conditionValue;
    }

    public void setConditionValue(String conditionValue) {
        this.conditionValue = conditionValue;
    }

    public int getCondition() {
        return condition;
    }

    public void setCondition(int condition) {
        this.condition = condition;
    }
}
