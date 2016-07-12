package com.example.administrator.androidframe.zito.frame.model;

import java.util.List;

/**
 * 类描述:商店
 * 作者: 岳志远
 * 时间: 2016/1/28 10:19
 * 版本:
 */
public class Shops {
    private List<CartDtos> cartDtos;
    /**
     * 创建时间--申请时间
     */
    private String createTime;                                                            //
    /**
     * 是否可用,0可用；1，不可用
     */
    private int disabled;                                                            //
    /**
     * 修改时间
     */
    private String modTime;                                                            //
    /**
     * 经营品牌--新增
     */
    private String operatingBrandId;   //
    /**
     * 经营类目--新增
     */
    private String operatingCatId;                                        //
    /**
     * 通过时间--2015-11-20 10:59:44
     */
    private String passTime;                                                            //
    /**
     * 拒绝理由--2015-11-20 10:59:49
     */
    private String reason;                                                                //
    /**
     * 拒绝时间--2015-11-20 10:59:47
     */
    private String refuseTime;                                                            //
    /**
     * 店铺描述
     */
    private String shopDesc;                                                            //
    /**
     * 店铺ID
     */
    private int shopId;                                                                                //
    /**
     * 店主邮箱---新增
     */
    private String shopKeeperEmail;    //
    /**
     * 店主身份证号
     */
    private String shopKeeperIdCard;                    //
    /**
     * 店主电话
     */
    private String shopKeeperMoblie;                    //
    /**
     * 店主姓名
     */
    private String shopKeeperName;                                        //
    /**
     * 店铺名称
     */
    private String shopName;                                                            //
    /**
     * 店铺类型--2015-11-20 10:54:49  自营 旗舰 专卖
     */
    private int shopType;                                                            //
    /**
     * 店铺所在详细地址
     */
    private String shopaddr;                                                            //
    /**
     * 店铺所在地区
     */
    private String shoparea;                            //
    /**
     * 店铺状态：0：正常店铺；1，申请中；2：申请通过（正常店铺）；3：申请失败；4：店铺关闭
     */
    private int status;                                                                                //

    public Shops(String shopName) {
        this.shopName = shopName;
    }

    public List<CartDtos> getCartDtos() {
        return cartDtos;
    }

    public void setCartDtos(List<CartDtos> cartDtos) {
        this.cartDtos = cartDtos;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public int getDisabled() {
        return disabled;
    }

    public void setDisabled(int disabled) {
        this.disabled = disabled;
    }

    public String getModTime() {
        return modTime;
    }

    public void setModTime(String modTime) {
        this.modTime = modTime;
    }

    public String getOperatingBrandId() {
        return operatingBrandId;
    }

    public void setOperatingBrandId(String operatingBrandId) {
        this.operatingBrandId = operatingBrandId;
    }

    public String getOperatingCatId() {
        return operatingCatId;
    }

    public void setOperatingCatId(String operatingCatId) {
        this.operatingCatId = operatingCatId;
    }

    public String getPassTime() {
        return passTime;
    }

    public void setPassTime(String passTime) {
        this.passTime = passTime;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getRefuseTime() {
        return refuseTime;
    }

    public void setRefuseTime(String refuseTime) {
        this.refuseTime = refuseTime;
    }

    public String getShopDesc() {
        return shopDesc;
    }

    public void setShopDesc(String shopDesc) {
        this.shopDesc = shopDesc;
    }

    public int getShopId() {
        return shopId;
    }

    public void setShopId(int shopId) {
        this.shopId = shopId;
    }

    public String getShopKeeperEmail() {
        return shopKeeperEmail;
    }

    public void setShopKeeperEmail(String shopKeeperEmail) {
        this.shopKeeperEmail = shopKeeperEmail;
    }

    public String getShopKeeperIdCard() {
        return shopKeeperIdCard;
    }

    public void setShopKeeperIdCard(String shopKeeperIdCard) {
        this.shopKeeperIdCard = shopKeeperIdCard;
    }

    public String getShopKeeperMoblie() {
        return shopKeeperMoblie;
    }

    public void setShopKeeperMoblie(String shopKeeperMoblie) {
        this.shopKeeperMoblie = shopKeeperMoblie;
    }

    public String getShopKeeperName() {
        return shopKeeperName;
    }

    public void setShopKeeperName(String shopKeeperName) {
        this.shopKeeperName = shopKeeperName;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public int getShopType() {
        return shopType;
    }

    public void setShopType(int shopType) {
        this.shopType = shopType;
    }

    public String getShopaddr() {
        return shopaddr;
    }

    public void setShopaddr(String shopaddr) {
        this.shopaddr = shopaddr;
    }

    public String getShoparea() {
        return shoparea;
    }

    public void setShoparea(String shoparea) {
        this.shoparea = shoparea;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Shops(String shopName, List<CartDtos> cartDtos, int shopId) {
        this.shopId = shopId;
        this.shopName = shopName;
        this.cartDtos = cartDtos;
    }
}
