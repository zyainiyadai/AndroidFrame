package com.example.administrator.androidframe.zito.frame.model;

import java.util.List;

/**
 * com.zito.wghvip.model
 * 商品规格
 *
 * @author 张海洋
 * @created at 2016/6/1 13:44
 */
public class SpecItemSpec {
    private int itemSpecId;//
    private int itemId;//
    private String itemSpecName;//
    private String createTime;//创建时间
    private String modTime;//修改时间
    private int disabled;//是否可用:0可用，1不可用

    /**
     * 附加属性
     */
    private String itemSpecVal;//规格值
    private List<SpecItemValue> specItemValue;

    public int getItemSpecId() {
        return itemSpecId;
    }

    public void setItemSpecId(int itemSpecId) {
        this.itemSpecId = itemSpecId;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getItemSpecName() {
        return itemSpecName;
    }

    public void setItemSpecName(String itemSpecName) {
        this.itemSpecName = itemSpecName;
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

    public String getItemSpecVal() {
        return itemSpecVal;
    }

    public void setItemSpecVal(String itemSpecVal) {
        this.itemSpecVal = itemSpecVal;
    }

    public List<SpecItemValue> getSpecItemValue() {
        return specItemValue;
    }

    public void setSpecItemValue(List<SpecItemValue> specItemValue) {
        this.specItemValue = specItemValue;
    }
}
