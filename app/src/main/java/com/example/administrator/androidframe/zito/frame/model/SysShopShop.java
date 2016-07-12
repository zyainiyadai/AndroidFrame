package com.example.administrator.androidframe.zito.frame.model;

import java.math.BigDecimal;
import java.util.List;

/**
 * 类描述: 店铺信息
 * 作者: 颜培福
 * 时间:2016/2/22 12:45
 * 版本:
 */
public class SysShopShop {
    private int shopId;     //店铺ID
    private String shopName;     //店铺名称
    private String shopDesc;     //店铺描述
    private String shopQQ;     //店铺QQ号
    private String shopAliIM;     //店铺阿里旺旺账号
    private int shopLogoImgId;     //店铺LOGO图片ID
    private int shopType;     //店铺类型--2015-11-20 10:54:49  自营 旗舰 专卖
    private int operatingBrandId;   //经营品牌--新增
    private int operatingCatId;     //经营类目--新增
    private String shopKeeperName;     //店主姓名
    private String shopKeeperMoblie;    //店主电话
    private String shopKeeperEmail;    //店主邮箱---新增
    private String shopKeeperIdCard;    //店主身份证号
    private int status;     //店铺状态：0：正常店铺；1，申请中；2：申请通过（正常店铺）；3：申请失败；4：店铺关闭
    private String shoparea;            //店铺所在地区
    private String shopaddr;     //店铺所在详细地址
    private int disabled;     //是否可用,0可用；1，不可用
    private String createTime;     //创建时间--申请时间
    private String modTime;     //修改时间
    private String passTime;     //通过时间--2015-11-20 10:59:44
    private String refuseTime;     //拒绝时间--2015-11-20 10:59:47
    private String reason;         //拒绝理由--2015-11-20 10:59:49
    private String closeTime;
    private String batchNo;             //logo图片批次号
    private String scrollBatchNo;       //条幅图片批次号
    private int scrollImageId;              //条幅id
    private int identityImageId;     //店主身份证图片id、
    private String identityBatchNo;    //店主身份证图片批次号
    private int isSelf;             //是否是自营商铺，0：不是 1：是
    private String alarmStock;     //店铺库存预警值

    private BigDecimal freeMoneyLimit;  //免运费额度       添加人：田帅

    private int isAudit;                //该店铺商品需不需要审核：0：需要审核，1：不需要审核
    private String logoPath;          //附加属性  logo路径
    private String scrollPath;         //附加属性  条幅路径

    private List<CartDtos> cartDtos;      //附加属性 购物车店铺下商品列表

    private int shopFansNum;        //店铺被收藏数,粉丝数
    private int itemNum;               //店铺商品的数量

    public SysShopShop(List<CartDtos> cartDtos) {
        this.cartDtos = cartDtos;
    }

    public int getShopFansNum() {
        return shopFansNum;
    }

    public void setShopFansNum(int shopFansNum) {
        this.shopFansNum = shopFansNum;
    }

    public int getItemNum() {
        return itemNum;
    }

    public void setItemNum(int itemNum) {
        this.itemNum = itemNum;
    }

    public int getShopId() {
        return shopId;
    }

    public void setShopId(int shopId) {
        this.shopId = shopId;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getShopDesc() {
        return shopDesc;
    }

    public void setShopDesc(String shopDesc) {
        this.shopDesc = shopDesc;
    }

    public String getShopQQ() {
        return shopQQ;
    }

    public void setShopQQ(String shopQQ) {
        this.shopQQ = shopQQ;
    }

    public String getShopAliIM() {
        return shopAliIM;
    }

    public void setShopAliIM(String shopAliIM) {
        this.shopAliIM = shopAliIM;
    }

    public int getShopLogoImgId() {
        return shopLogoImgId;
    }

    public void setShopLogoImgId(int shopLogoImgId) {
        this.shopLogoImgId = shopLogoImgId;
    }

    public int getShopType() {
        return shopType;
    }

    public void setShopType(int shopType) {
        this.shopType = shopType;
    }

    public int getOperatingBrandId() {
        return operatingBrandId;
    }

    public void setOperatingBrandId(int operatingBrandId) {
        this.operatingBrandId = operatingBrandId;
    }

    public int getOperatingCatId() {
        return operatingCatId;
    }

    public void setOperatingCatId(int operatingCatId) {
        this.operatingCatId = operatingCatId;
    }

    public String getShopKeeperName() {
        return shopKeeperName;
    }

    public void setShopKeeperName(String shopKeeperName) {
        this.shopKeeperName = shopKeeperName;
    }

    public String getShopKeeperMoblie() {
        return shopKeeperMoblie;
    }

    public void setShopKeeperMoblie(String shopKeeperMoblie) {
        this.shopKeeperMoblie = shopKeeperMoblie;
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

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getShoparea() {
        return shoparea;
    }

    public void setShoparea(String shoparea) {
        this.shoparea = shoparea;
    }

    public String getShopaddr() {
        return shopaddr;
    }

    public void setShopaddr(String shopaddr) {
        this.shopaddr = shopaddr;
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

    public String getPassTime() {
        return passTime;
    }

    public void setPassTime(String passTime) {
        this.passTime = passTime;
    }

    public String getRefuseTime() {
        return refuseTime;
    }

    public void setRefuseTime(String refuseTime) {
        this.refuseTime = refuseTime;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getCloseTime() {
        return closeTime;
    }

    public void setCloseTime(String closeTime) {
        this.closeTime = closeTime;
    }

    public String getBatchNo() {
        return batchNo;
    }

    public void setBatchNo(String batchNo) {
        this.batchNo = batchNo;
    }

    public String getScrollBatchNo() {
        return scrollBatchNo;
    }

    public void setScrollBatchNo(String scrollBatchNo) {
        this.scrollBatchNo = scrollBatchNo;
    }

    public int getScrollImageId() {
        return scrollImageId;
    }

    public void setScrollImageId(int scrollImageId) {
        this.scrollImageId = scrollImageId;
    }

    public int getIdentityImageId() {
        return identityImageId;
    }

    public void setIdentityImageId(int identityImageId) {
        this.identityImageId = identityImageId;
    }

    public String getIdentityBatchNo() {
        return identityBatchNo;
    }

    public void setIdentityBatchNo(String identityBatchNo) {
        this.identityBatchNo = identityBatchNo;
    }

    public int getIsSelf() {
        return isSelf;
    }

    public void setIsSelf(int isSelf) {
        this.isSelf = isSelf;
    }

    public String getAlarmStock() {
        return alarmStock;
    }

    public void setAlarmStock(String alarmStock) {
        this.alarmStock = alarmStock;
    }

    public BigDecimal getFreeMoneyLimit() {
        return freeMoneyLimit;
    }

    public void setFreeMoneyLimit(BigDecimal freeMoneyLimit) {
        this.freeMoneyLimit = freeMoneyLimit;
    }

    public int getIsAudit() {
        return isAudit;
    }

    public void setIsAudit(int isAudit) {
        this.isAudit = isAudit;
    }

    public String getLogoPath() {
        return logoPath;
    }

    public void setLogoPath(String logoPath) {
        this.logoPath = logoPath;
    }

    public String getScrollPath() {
        return scrollPath;
    }

    public void setScrollPath(String scrollPath) {
        this.scrollPath = scrollPath;
    }

    public List<CartDtos> getCartDtos() {
        return cartDtos;
    }

    public void setCartDtos(List<CartDtos> cartDtos) {
        this.cartDtos = cartDtos;
    }
}
