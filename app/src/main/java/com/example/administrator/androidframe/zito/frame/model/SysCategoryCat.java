package com.example.administrator.androidframe.zito.frame.model;

import java.util.List;

/**
 * 类描述: 商品一级分类的实体类
 * 作者: 颜培福
 * 时间:2016/1/28 13:54
 * 版本:
 */
public class SysCategoryCat implements java.io.Serializable{

    private static final long serialVersionUID = 1L;
    /**一级分类ID*/
    private int    catId;
    /**一级分类名称*///
    private String catName;
    /**是否可用,0可用；1，不可用*/
    private int    disabled;
    /**创建时间*///
    private String createTime;
    /**修改时间*/
    private String modTime;
    /**附加属性：子类列表*/
    private List<SysCategorySubclass> subclasses;
    /**
     * get、set方法
     */
    public int getCatId() {
        return catId;
    }
    public void setCatId(int catId) {
        this.catId = catId;
    }
    public String getCatName() {
        return catName;
    }
    public void setCatName(String catName) {
        this.catName = catName;
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
    public List<SysCategorySubclass> getSubclasses() {
        return subclasses;
    }
    public void setSubclasses(List<SysCategorySubclass> subclasses) {
        this.subclasses = subclasses;
    }

}