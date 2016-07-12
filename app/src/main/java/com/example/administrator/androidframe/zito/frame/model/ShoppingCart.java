package com.example.administrator.androidframe.zito.frame.model;

/**
 * 类描述:购物车列表
 * 作者: 岳志远
 * 时间: 2016/1/25 12:45
 * 版本:
 */
public class ShoppingCart {
    /**商品主键*/
    private Integer id;
    /**商品ID*/
    private Integer commId;
    /**用户ID*/
    private String userId;
    /**数量*/
    private Integer count;
    /**图片*/
    private Integer image;
    /**商品名称*/
    private String commName;
    /**价格*/
    private String outMoney;
    /**是否被选中*/
    private String isChecked;

    public ShoppingCart(Integer count, Integer image, String commName, String outMoney, String isChecked) {
        this.count = count;
        this.image = image;
        this.commName = commName;
        this.outMoney = outMoney;
        this.isChecked = isChecked;
    }

    public ShoppingCart(Integer id, Integer commId, String userId, Integer count, Integer image, String commName, String outMoney, String isChecked) {
        this.id = id;
        this.commId = commId;
        this.userId = userId;
        this.count = count;
        this.image = image;
        this.commName = commName;
        this.outMoney = outMoney;
        this.isChecked = isChecked;
    }

    public ShoppingCart() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCommId() {
        return commId;
    }

    public void setCommId(Integer commId) {
        this.commId = commId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getImage() {
        return image;
    }

    public void setImage(Integer image) {
        this.image = image;
    }

    public String getCommName() {
        return commName;
    }

    public void setCommName(String commName) {
        this.commName = commName;
    }

    public String getOutMoney() {
        return outMoney;
    }

    public void setOutMoney(String outMoney) {
        this.outMoney = outMoney;
    }

    public String getIsChecked() {
        return isChecked;
    }

    public void setIsChecked(String isChecked) {
        this.isChecked = isChecked;
    }
}
