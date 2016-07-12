package com.example.administrator.androidframe.zito.frame.model;

/**
 * 类描述:
 * 作者: 岳志远
 * 时间: 2016/2/14 08:55
 * 版本:
 */
public class SysRegion {

    /**地址ID*/
    private String addr_id;
    /**上级ID*/
    private String belong;
    /**名称*/
    private String addr_name;
    /**地址类型    1：省   2：地级市    3：县区*/
    private String addr_type;
    /**是否可用*/
    private String disabled;

    public SysRegion(String addr_name, String addr_id, String addr_type, String belong, String disabled) {
        this.addr_name = addr_name;
        this.addr_id = addr_id;
        this.addr_type = addr_type;
        this.belong = belong;
        this.disabled = disabled;
    }

    public SysRegion() {
    }

    public String getAddr_id() {
        return addr_id;
    }

    public void setAddr_id(String addr_id) {
        this.addr_id = addr_id;
    }

    public String getBelong() {
        return belong;
    }

    public void setBelong(String belong) {
        this.belong = belong;
    }

    public String getAddr_name() {
        return addr_name;
    }

    public void setAddr_name(String addr_name) {
        this.addr_name = addr_name;
    }

    public String getAddr_type() {
        return addr_type;
    }

    public void setAddr_type(String addr_type) {
        this.addr_type = addr_type;
    }

    public String getDisabled() {
        return disabled;
    }

    public void setDisabled(String disabled) {
        this.disabled = disabled;
    }
}
