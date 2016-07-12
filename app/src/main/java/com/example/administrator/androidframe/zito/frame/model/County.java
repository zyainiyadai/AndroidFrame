package com.example.administrator.androidframe.zito.frame.model;

/**
 * 类描述:三级联动县
 * 作者: 岳志远
 * 时间: 2016/1/26 10:45
 * 版本:
 */
public class County {


    /**地址ID*/
    private String addrId;
    /**名称*/
    private String addrName;
    /**地址类型    1：省   2：地级市    3：县区*/
    private String addrType;
    /**上级ID*/
    private String belong;
    /**是否可用*/
    private String disabled;

    public String getAddrId() {
        return addrId;
    }

    public void setAddrId(String addrId) {
        this.addrId = addrId;
    }

    public String getAddrName() {
        return addrName;
    }

    public void setAddrName(String addrName) {
        this.addrName = addrName;
    }

    public String getAddrType() {
        return addrType;
    }

    public void setAddrType(String addrType) {
        this.addrType = addrType;
    }

    public String getBelong() {
        return belong;
    }

    public void setBelong(String belong) {
        this.belong = belong;
    }

    public String getDisabled() {
        return disabled;
    }

    public void setDisabled(String disabled) {
        this.disabled = disabled;
    }
}
