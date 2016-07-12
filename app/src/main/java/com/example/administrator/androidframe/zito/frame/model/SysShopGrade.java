package com.example.administrator.androidframe.zito.frame.model;

import java.io.Serializable;

/**
 * 类描述：店铺评分
 * 作者：刘士良
 * 时间：2016/4/14 17:18
 * 版本：
 */
public class SysShopGrade implements Serializable{
    /**
     * serialVersionUID:
     */
    private static final long serialVersionUID = 1L;

    /**评分id*/
    private int gradeId;
    /**店铺id*/
    private int shopId;
    /**商品相符*/
    private double result;
    /**服务态度*/
    private double shopResult;
    /**物流态度*/
    private double logisticsResult;

    /**附加属性*/

    /**评分*/
    private double grade;
    /**人数*/
    private int numberOfPeople;
    /**评分项*/
    private String mark;
    /**店铺名称*/
    private String shopName;
    /**综合评分*/
    private double synGrade;



    /**get、set*/
    public int getGradeId() {
        return gradeId;
    }
    public void setGradeId(int gradeId) {
        this.gradeId = gradeId;
    }
    public int getShopId() {
        return shopId;
    }
    public void setShopId(int shopId) {
        this.shopId = shopId;
    }

    public double getResult() {
        return result;
    }
    public void setResult(double result) {
        this.result = result;
    }
    public double getShopResult() {
        return shopResult;
    }
    public void setShopResult(double shopResult) {
        this.shopResult = shopResult;
    }
    public double getLogisticsResult() {
        return logisticsResult;
    }
    public void setLogisticsResult(double logisticsResult) {
        this.logisticsResult = logisticsResult;
    }
    public double getGrade() {
        return grade;
    }
    public void setGrade(double grade) {
        this.grade = grade;
    }
    public void setNumberOfPeople(int numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
    }
    public int getNumberOfPeople() {
        return numberOfPeople;
    }
    public void setMark(String mark) {
        this.mark = mark;
    }
    public String getMark() {
        return mark;
    }
    public void setShopName(String shopName) {
        this.shopName = shopName;
    }
    public String getShopName() {
        return shopName;
    }
    public void setSynGrade(double synGrade) {
        this.synGrade = synGrade;
    }
    public double getSynGrade() {
        return synGrade;
    }
}
