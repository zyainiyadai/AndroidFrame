package com.example.administrator.androidframe.zito.frame.model;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 类描述：店铺详情实体类
 * 作者：刘士良
 * 时间：2016/2/26 14:46
 * 版本：
 */
public class ShopDto implements Serializable{
    /**
     * 商家信息属性
     */
    private String sellername; // 卖家登录账号--申请人

    /**
     * 店铺信息属性
     */
    private int shopId; // 店铺ID
    private String shopName; // 店铺名称
    private String shopDesc; // 店铺描述
    private int shopType; // 店铺类型
    private String operatingBrand; // 经营品牌
    private int shopLogoImgId; // 店铺LOGO图片ID
    private String operatingCat; // 经营类目
    private int operatingBrandId; // 经营品牌id--新增
    private int operatingCatId; // 经营类目id--新增
    private String shopKeeperName; // 店主姓名
    private String shopKeeperMoblie; // 店主电话
    private String shopKeeperEmail; // 店主邮箱
    private String shopKeeperIdCard; // 店主身份证号
    private String shoparea; // 店铺所在地区
    private String shopaddr; // 店铺所在详细地址
    private int disabled; // 是否可用,0可用；1，不可用
    private int identityImageId; // 店主身份证图片id、
    private String identityBatchNo; // 店主身份证图片批次号
    /**
     * 审核信息属性
     */
    private int status; // 店铺状态：0：正常店铺；1，申请中；2：申请通过（正常店铺）；3：申请失败；4：店铺关闭
    private String createTime; // 创建时间--申请时间
    private String modTime; // 修改时间
    private String passTime; // 通过时间
    private String refuseTime; // 拒绝时间
    private String reason; // 拒绝理由
    /**
     * 企业信息属性
     */
    private int shopInfoId; // 店铺信息ID
    private String companyname; // 公司名称
    private String area; // 公司所在地区
    private String addr; // 公司详细地址
    private String contactsName; // 联系人姓名
    private String contactsMobile; // 联系人手机号
    private String contactsTel; // 联系人电话
    private String establishTime; // 公司成立日期
    private String corporationName; // 法定代表人
    private String corporationIdcard; // 法定代表人身份证
    private String licenceNo; // 营业执照
    private String licenceArea; // 营业执照所在地区
    private String licenceAddr; // 营业执照详细地址
    private String licenceLimit; // 营业期限
    private String businessScope; // 经营范围
    private BigDecimal capital; // 注册资本
    private String officialWeb; // 公司网址

    /**
     * 组织机构代码证
     */
    private String companyCode; // 机构代码
    /**
     * 税务登记号证
     */
    private String taxRegistrationNo; // 税务登记号

    /**
     * 银行信息
     */
    private String bankCompanyName; // 银行开户用户名
    private String bankNo; // 银行账号
    private String cnapsCode; // 支行联行号
    private String bankArea; // 开户银行所在地区
    private String bankName; // 开户银行
    private int taxImageId; // 税务图片id
    private String taxBatchNo; // 税务图片批次号

    private String taxPath; // 税务图片路径
    private String identityPath; // 身份证图片路径
    private String logoPath; // 附加属性 logo路径

    private int shopFansNum; // 店铺被收藏数,粉丝数
    private int itemNum; // 店铺商品的数量
    private int dynamicNum;// 店铺动态数量

    public String getSellername() {
        return sellername;
    }

    public void setSellername(String sellername) {
        this.sellername = sellername;
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

    public int getShopType() {
        return shopType;
    }

    public void setShopType(int shopType) {
        this.shopType = shopType;
    }

    public String getOperatingBrand() {
        return operatingBrand;
    }

    public void setOperatingBrand(String operatingBrand) {
        this.operatingBrand = operatingBrand;
    }

    public int getShopLogoImgId() {
        return shopLogoImgId;
    }

    public void setShopLogoImgId(int shopLogoImgId) {
        this.shopLogoImgId = shopLogoImgId;
    }

    public String getOperatingCat() {
        return operatingCat;
    }

    public void setOperatingCat(String operatingCat) {
        this.operatingCat = operatingCat;
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

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
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

    public int getShopInfoId() {
        return shopInfoId;
    }

    public void setShopInfoId(int shopInfoId) {
        this.shopInfoId = shopInfoId;
    }

    public String getCompanyname() {
        return companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getContactsName() {
        return contactsName;
    }

    public void setContactsName(String contactsName) {
        this.contactsName = contactsName;
    }

    public String getContactsMobile() {
        return contactsMobile;
    }

    public void setContactsMobile(String contactsMobile) {
        this.contactsMobile = contactsMobile;
    }

    public String getContactsTel() {
        return contactsTel;
    }

    public void setContactsTel(String contactsTel) {
        this.contactsTel = contactsTel;
    }

    public String getEstablishTime() {
        return establishTime;
    }

    public void setEstablishTime(String establishTime) {
        this.establishTime = establishTime;
    }

    public String getCorporationName() {
        return corporationName;
    }

    public void setCorporationName(String corporationName) {
        this.corporationName = corporationName;
    }

    public String getCorporationIdcard() {
        return corporationIdcard;
    }

    public void setCorporationIdcard(String corporationIdcard) {
        this.corporationIdcard = corporationIdcard;
    }

    public String getLicenceNo() {
        return licenceNo;
    }

    public void setLicenceNo(String licenceNo) {
        this.licenceNo = licenceNo;
    }

    public String getLicenceArea() {
        return licenceArea;
    }

    public void setLicenceArea(String licenceArea) {
        this.licenceArea = licenceArea;
    }

    public String getLicenceAddr() {
        return licenceAddr;
    }

    public void setLicenceAddr(String licenceAddr) {
        this.licenceAddr = licenceAddr;
    }

    public String getLicenceLimit() {
        return licenceLimit;
    }

    public void setLicenceLimit(String licenceLimit) {
        this.licenceLimit = licenceLimit;
    }

    public String getBusinessScope() {
        return businessScope;
    }

    public void setBusinessScope(String businessScope) {
        this.businessScope = businessScope;
    }

    public BigDecimal getCapital() {
        return capital;
    }

    public void setCapital(BigDecimal capital) {
        this.capital = capital;
    }

    public String getOfficialWeb() {
        return officialWeb;
    }

    public void setOfficialWeb(String officialWeb) {
        this.officialWeb = officialWeb;
    }

    public String getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }

    public String getTaxRegistrationNo() {
        return taxRegistrationNo;
    }

    public void setTaxRegistrationNo(String taxRegistrationNo) {
        this.taxRegistrationNo = taxRegistrationNo;
    }

    public String getBankCompanyName() {
        return bankCompanyName;
    }

    public void setBankCompanyName(String bankCompanyName) {
        this.bankCompanyName = bankCompanyName;
    }

    public String getBankNo() {
        return bankNo;
    }

    public void setBankNo(String bankNo) {
        this.bankNo = bankNo;
    }

    public String getCnapsCode() {
        return cnapsCode;
    }

    public void setCnapsCode(String cnapsCode) {
        this.cnapsCode = cnapsCode;
    }

    public String getBankArea() {
        return bankArea;
    }

    public void setBankArea(String bankArea) {
        this.bankArea = bankArea;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public int getTaxImageId() {
        return taxImageId;
    }

    public void setTaxImageId(int taxImageId) {
        this.taxImageId = taxImageId;
    }

    public String getTaxBatchNo() {
        return taxBatchNo;
    }

    public void setTaxBatchNo(String taxBatchNo) {
        this.taxBatchNo = taxBatchNo;
    }

    public String getTaxPath() {
        return taxPath;
    }

    public void setTaxPath(String taxPath) {
        this.taxPath = taxPath;
    }

    public String getIdentityPath() {
        return identityPath;
    }

    public void setIdentityPath(String identityPath) {
        this.identityPath = identityPath;
    }

    public String getLogoPath() {
        return logoPath;
    }

    public void setLogoPath(String logoPath) {
        this.logoPath = logoPath;
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

    public int getDynamicNum() {
        return dynamicNum;
    }

    public void setDynamicNum(int dynamicNum) {
        this.dynamicNum = dynamicNum;
    }
}
