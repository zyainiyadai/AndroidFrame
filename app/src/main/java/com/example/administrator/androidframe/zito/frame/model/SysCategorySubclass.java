package com.example.administrator.androidframe.zito.frame.model;

import java.io.Serializable;
import java.util.List;

/**
 * 类描述: 商品二级分类的实体类
 * 作者: 颜培福
 * 时间:2016/1/28 13:58
 * 版本:
 */
public class SysCategorySubclass implements Serializable {
    /**二级分类ID*/
    private int    subId;
    /**所属一级分类ID*/
    private int	   catId;
    /**二级分类名称*///
    private String subName;
    /**是否可用,0可用；1，不可用*/
    private int    disabled;
    /**创建时间*/
    private String createTime;
    /**修改时间*/
    private String modTime;
    /**附加属性：分类名称*/
    private String catName;
    /**附加属性：该分类下商品列表*/
    private List<SysItemItem> items;
    /**三级分类列表集合*/
    private List<SysCategoryThirdclass> thirdclasses;

    public int getSubId() {
        return subId;
    }

    public void setSubId(int subId) {
        this.subId = subId;
    }

    public int getCatId() {
        return catId;
    }

    public void setCatId(int catId) {
        this.catId = catId;
    }

    public String getSubName() {
        return subName;
    }

    public void setSubName(String subName) {
        this.subName = subName;
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

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }

    public List<SysItemItem> getItems() {
        return items;
    }

    public void setItems(List<SysItemItem> items) {
        this.items = items;
    }

    public List<SysCategoryThirdclass> getThirdclasses() {
        return thirdclasses;
    }

    public void setThirdclasses(List<SysCategoryThirdclass> thirdclasses) {
        this.thirdclasses = thirdclasses;
    }
}