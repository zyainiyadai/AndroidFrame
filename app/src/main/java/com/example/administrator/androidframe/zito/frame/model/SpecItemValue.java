package com.example.administrator.androidframe.zito.frame.model;

/**
 * com.zito.wghvip.model
 *
 * @author 张海洋
 * @created at 2016/6/1 13:44
 */
public class SpecItemValue {
    private int itemValId;//
    private int itemId;//
    private int itemSpecId;//
    private String itemSpecVal;//
    private String createTime;//创建时间
    private String modTime;//修改时间
    private int disabled;//是否可用:0可用，1不可用

    public int getItemValId() {
        return itemValId;
    }

    public void setItemValId(int itemValId) {
        this.itemValId = itemValId;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public int getItemSpecId() {
        return itemSpecId;
    }

    public void setItemSpecId(int itemSpecId) {
        this.itemSpecId = itemSpecId;
    }

    public String getItemSpecVal() {
        return itemSpecVal;
    }

    public void setItemSpecVal(String itemSpecVal) {
        this.itemSpecVal = itemSpecVal;
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

    public int getDisabled() {
        return disabled;
    }

    public void setDisabled(int disabled) {
        this.disabled = disabled;
    }
}
