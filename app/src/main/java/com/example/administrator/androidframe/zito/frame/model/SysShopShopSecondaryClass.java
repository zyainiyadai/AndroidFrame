package com.example.administrator.androidframe.zito.frame.model;

/**
 * 类描述：店铺二级分类
 * 作者：刘士良
 * 时间：2016/2/14 14:57
 * 版本：
 */
public class SysShopShopSecondaryClass implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private int secondaryId;			//二级分类ID
    private String className;			//分类名称
    private int    catId;				//分类ID
    private int    sortId;				//排序ID
    private int    disabled;			//是否可用,0可用；1，不可用
    private String createTime;			//创建时间
    private String modTime;				//修改时间


    public int getSecondaryId() {
        return secondaryId;
    }
    public void setSecondaryId(int secondaryId) {
        this.secondaryId = secondaryId;
    }
    public String getClassName() {
        return className;
    }
    public void setClassName(String className) {
        this.className = className;
    }
    public int getCatId() {
        return catId;
    }
    public void setCatId(int catId) {
        this.catId = catId;
    }
    public int getSortId() {
        return sortId;
    }
    public void setSortId(int sortId) {
        this.sortId = sortId;
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
