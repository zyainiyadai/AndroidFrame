package com.example.administrator.androidframe.zito.frame.model;

import java.util.List;

/**
 * 类描述：店铺一级分类
 * 作者：刘士良
 * 时间：2016/2/14 14:58
 * 版本：
 */
public class SysShopShopCat implements java.io.Serializable{

    private static final long serialVersionUID = 1L;

    private int    catId;				//分类ID
    private String catName;				//分类名称
    private int    shopId;				//店铺ID
    private int	   sort;				//排序号
    private int    disabled;			//是否可用,0可用；1，不可用
    private String createTime;			//创建时间
    private String modTime;				//修改时间
    private List<SysShopShopSecondaryClass> secondaryClasses;//二级分类列表


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

    public int getShopId() {
        return shopId;
    }
    public void setShopId(int shopId) {
        this.shopId = shopId;
    }
    public int getSort() {
        return sort;
    }
    public void setSort(int sort) {
        this.sort = sort;
    }
    public List<SysShopShopSecondaryClass> getSecondaryClasses() {
        return secondaryClasses;
    }
    public void setSecondaryClasses(List<SysShopShopSecondaryClass> secondaryClasses) {
        this.secondaryClasses = secondaryClasses;
    }

}
