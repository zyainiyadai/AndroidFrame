package com.example.administrator.androidframe.zito.frame.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

/**
 * 类描述: 搜索商品 ， 商品信息实体类
 * 作者: 颜培福
 * 时间:2016/1/26 16:16
 * 版本:
 */
public class SysItemItem implements Serializable{
    /**
     * 商品ID
     */
    private int itemId;
    /**
     * 商品编号，接口调用时核对
     */
    private String itemNo;
    /**
     * 商品一级分类ID
     */
    private int catId;
    /**
     * 商品二级分类ID
     */
    private int subId;
    /**
     * 商品三级分类ID
     */
    private int thirdId;
    /**
     * 场馆ID
     */
    private int pavilionId;
    /**
     * 店铺ID
     */
    private int shopId;
    /**
     * 品牌ID
     */
    private int brandId;
    /**
     * 店铺内商品一级分类ID
     */
    private int shopCateId;
    /**
     * 店铺内商品二级分类ID
     */
    private int shopSecondclassId;
    /**
     * 商品 标题(商品名称)
     */
    private String itemTitle;
    /**
     * 副标题
     */
    private String subhead;
    /**
     * 原价
     */
    private BigDecimal originalPrice;
    /**
     * 售价
     */
    private BigDecimal sellingPrice;
    /**
     * 税率ID
     */
    private int taxRateId;
    /**
     * 税率
     */
    private BigDecimal taxRate;
    /**
     * 默认图片ID
     */
    private int imageDefaultId;
    /**
     * 批次号
     */
    private String batchNo;
    /**
     * 商品状态: 1上架; 2下架; 3待审核; 4未通过
     */
    private int status;
    /**
     * 是否可用，0可用;1,不可用
     */
    private int disabled;
    /**
     * 创建时间
     */
    private String createTime;
    /**
     * 修改时间
     */
    private String modTime;
    /**
     * 商品产地
     */
    private String itemOrigin;
    /**
     * 商品描述
     */
    private String itemDesc;
    /**
     * 商品描述
     */
    private String itemDescMobile;
    /**
     * 销量
     */
    private int salesVolume;
    /**
     * 重量
     */
    private BigDecimal weight;
    /**
     * 规格
     */
    private String specification;
    /**
     * 条形码
     */
    private String barCode;
    /**
     * 附加属性: 默认图片的路径
     */
    private String imgPath;
    /**
     * 附加属性:所属分类
     */
    private String catName;
    /**
     * 附加属性: 子类名称
     */
    private String subName;
    /**
     * 附加属性:品牌名称
     */
    private String brandName;
    /**
     * 图片地址
     */
    private String imageUrl;
    /**
     * 库存
     */
    private int store;
    /**
     * 原产地ID
     */
    private int originCountryId;
    /**
     * 最小起订量
     */
    private int minqty;
    /**
     * 附加属性: 原产地
     */
    private String originCountry;
    /**
     * 商品图片集合
     */
    private List<ImageImage> images;
    /**
     * 店铺名称
     */
    private String shopName;

    /**
     *人气
     */
    private int 	 fansNum;

    /**三级分类名称*/
    private String thirdName;
    /**店铺被收藏数,粉丝数*/
    private int shopFansNum;
    /**店铺商品的数量*/
    private int itemNum;

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

    public String getThirdName() {
        return thirdName;
    }

    public void setThirdName(String thirdName) {
        this.thirdName = thirdName;
    }

    public int getFansNum() {
        return fansNum;
    }

    public void setFansNum(int fansNum) {
        this.fansNum = fansNum;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getItemNo() {
        return itemNo;
    }

    public void setItemNo(String itemNo) {
        this.itemNo = itemNo;
    }

    public int getCatId() {
        return catId;
    }

    public void setCatId(int catId) {
        this.catId = catId;
    }

    public int getSubId() {
        return subId;
    }

    public void setSubId(int subId) {
        this.subId = subId;
    }

    public int getThirdId() {
        return thirdId;
    }

    public void setThirdId(int thirdId) {
        this.thirdId = thirdId;
    }

    public int getPavilionId() {
        return pavilionId;
    }

    public void setPavilionId(int pavilionId) {
        this.pavilionId = pavilionId;
    }

    public int getShopId() {
        return shopId;
    }

    public void setShopId(int shopId) {
        this.shopId = shopId;
    }

    public int getBrandId() {
        return brandId;
    }

    public void setBrandId(int brandId) {
        this.brandId = brandId;
    }

    public int getShopCateId() {
        return shopCateId;
    }

    public void setShopCateId(int shopCateId) {
        this.shopCateId = shopCateId;
    }

    public int getShopSecondclassId() {
        return shopSecondclassId;
    }

    public void setShopSecondclassId(int shopSecondclassId) {
        this.shopSecondclassId = shopSecondclassId;
    }

    public String getItemTitle() {
        return itemTitle;
    }

    public void setItemTitle(String itemTitle) {
        this.itemTitle = itemTitle;
    }

    public String getSubhead() {
        return subhead;
    }

    public void setSubhead(String subhead) {
        this.subhead = subhead;
    }

    public BigDecimal getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(BigDecimal originalPrice) {
        this.originalPrice = originalPrice;
    }

    public BigDecimal getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(BigDecimal sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public int getTaxRateId() {
        return taxRateId;
    }

    public void setTaxRateId(int taxRateId) {
        this.taxRateId = taxRateId;
    }

    public BigDecimal getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(BigDecimal taxRate) {
        this.taxRate = taxRate;
    }

    public int getImageDefaultId() {
        return imageDefaultId;
    }

    public void setImageDefaultId(int imageDefaultId) {
        this.imageDefaultId = imageDefaultId;
    }

    public String getBatchNo() {
        return batchNo;
    }

    public void setBatchNo(String batchNo) {
        this.batchNo = batchNo;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
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

    public String getItemOrigin() {
        return itemOrigin;
    }

    public void setItemOrigin(String itemOrigin) {
        this.itemOrigin = itemOrigin;
    }

    public String getItemDesc() {
        return itemDesc;
    }

    public void setItemDesc(String itemDesc) {
        this.itemDesc = itemDesc;
    }

    public int getSalesVolume() {
        return salesVolume;
    }

    public void setSalesVolume(int salesVolume) {
        this.salesVolume = salesVolume;
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification;
    }

    public String getBarCode() {
        return barCode;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }

    public String getImgPath() {
        return imgPath;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }

    public String getSubName() {
        return subName;
    }

    public void setSubName(String subName) {
        this.subName = subName;
    }

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public int getStore() {
        return store;
    }

    public void setStore(int store) {
        this.store = store;
    }

    public int getOriginCountryId() {
        return originCountryId;
    }

    public void setOriginCountryId(int originCountryId) {
        this.originCountryId = originCountryId;
    }

    public int getMinqty() {
        return minqty;
    }

    public void setMinqty(int minqty) {
        this.minqty = minqty;
    }

    public String getOriginCountry() {
        return originCountry;
    }

    public void setOriginCountry(String originCountry) {
        this.originCountry = originCountry;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public List<ImageImage> getImages() {
        return images;
    }

    public void setImages(List<ImageImage> images) {
        this.images = images;
    }

    public String getItemDescMobile() {
        return itemDescMobile;
    }

    public void setItemDescMobile(String itemDescMobile) {
        this.itemDescMobile = itemDescMobile;
    }
}
