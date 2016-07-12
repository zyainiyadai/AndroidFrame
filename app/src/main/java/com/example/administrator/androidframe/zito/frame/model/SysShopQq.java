package com.example.administrator.androidframe.zito.frame.model;

import java.io.Serializable;

/**
 * 类描述：qq客服实体
 * 作者：刘士良
 * 时间：2016/2/14 15:06
 * 版本：
 */
public class SysShopQq implements Serializable {

    /**
     * serialVersionUID:
     */
    private static final long serialVersionUID = 1L;

    private int    	qqId;			//qqid
    private String 	qq;			    //qq号
    private String name;            //客服名称
    private int shopId;             //店铺id

    public int getShopId() {
        return shopId;
    }
    public void setShopId(int shopId) {
        this.shopId = shopId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getQqId() {
        return qqId;
    }
    public void setQqId(int qqId) {
        this.qqId = qqId;
    }
    public String getQq() {
        return qq;
    }
    public void setQq(String qq) {
        this.qq = qq;
    }

}