package com.example.administrator.androidframe.zito.frame.model;

/**
 * 类描述：三级商品分类实体类
 * 作者：刘士良
 * 时间：2016/1/29 10:42
 * 版本：
 */
public class SysCategoryThirdclass implements java.io.Serializable{
    /**三级分类ID*/
    private int    thirdId;
    /**所属二级分类ID*/
    private int	   secondId;
    /**三级分类名称*/
    private String thirdName;
    /**是否可用,0可用；1，不可用*/
    private int    disabled;
    /**创建时间*/
    private String createTime;
    /**修改时间*/
    private String modTime;

    public int getThirdId() {
        return thirdId;
    }

    public void setThirdId(int thirdId) {
        this.thirdId = thirdId;
    }

    public int getSecondId() {
        return secondId;
    }

    public void setSecondId(int secondId) {
        this.secondId = secondId;
    }

    public String getThirdName() {
        return thirdName;
    }

    public void setThirdName(String thirdName) {
        this.thirdName = thirdName;
    }

    public int getDisabled() {
        return disabled;
    }

    public void setDisabled(int disabled) {
        this.disabled = disabled;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getModTime() {
        return modTime;
    }

    public void setModTime(String modTime) {
        this.modTime = modTime;
    }
}
