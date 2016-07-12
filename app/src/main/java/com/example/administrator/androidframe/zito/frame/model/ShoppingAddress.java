package com.example.administrator.androidframe.zito.frame.model;

/**
 * 类描述:收货地址列表
 * 作者: 岳志远
 * 时间: 2016/1/25 16:40
 * 版本:
 */
public class ShoppingAddress {
    /**地址*/
    private String addr;
    /**地址id*/
    private String addrId;
    /**市id*/
    private String city;
    /**市*/
    private String cityName;
    /**县id*/
    private String county;
    /**县*/
    private String countyName;
    /**创建时间*/
    private String createTime;
    /**是否可用,0可用；1，不可用*/
    private String disabled;
    /**是否是默认地址,0 不是默认地址，1是默认地址*/
    private String isDef;
    /**收货人电话*/
    private String mobile;
    /**modTime*/
    private String modTime;
    /**收货人姓名*/
    private String name;
    /**邮编*/
    private String postcode;
    /**省*/
    private String proName;
    /**省id*/
    private String province;
    /**街道*/
    private String street;
    /**会员id*/
    private String userId;

    public ShoppingAddress(String name, String mobile, String proName, String cityName, String countyName, String addr, String isDef) {
        this.name = name;
        this.mobile = mobile;
        this.proName = proName;
        this.cityName = cityName;
        this.countyName = countyName;
        this.addr = addr;
        this.isDef = isDef;
    }

    public ShoppingAddress(String name, String mobile, String proName, String cityName, String countyName, String addr, String isDef, String addrId, String province, String city, String county, String postcode) {
        this.name = name;
        this.mobile = mobile;
        this.proName = proName;
        this.cityName = cityName;
        this.countyName = countyName;
        this.addr = addr;
        this.isDef = isDef;
        this.addrId = addrId;
        this.province = province;
        this.city = city;
        this.county = county;
        this.postcode = postcode;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getAddrId() {
        return addrId;
    }

    public void setAddrId(String addrId) {
        this.addrId = addrId;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getDisabled() {
        return disabled;
    }

    public void setDisabled(String disabled) {
        this.disabled = disabled;
    }

    public String getIsDef() {
        return isDef;
    }

    public void setIsDef(String isDef) {
        this.isDef = isDef;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getModTime() {
        return modTime;
    }

    public void setModTime(String modTime) {
        this.modTime = modTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getProName() {
        return proName;
    }

    public void setProName(String proName) {
        this.proName = proName;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
