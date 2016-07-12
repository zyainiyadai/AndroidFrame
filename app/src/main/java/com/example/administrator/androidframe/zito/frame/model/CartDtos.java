package com.example.administrator.androidframe.zito.frame.model;

import java.math.BigDecimal;

/**
 * 类描述:购物车列表
 * 作者: 岳志远
 * 时间: 2016/1/28 09:42
 * 版本:
 */
public class CartDtos {


    /**条形码*/
    private String		barCode;			//
    /**批次号*/
    private String 		batchNo;			//
    /**品牌ID*/
    private int    		brandId;			//
    /**附加属性：品牌名称*/
    private String		brandName;			//
    /**购物车ID*/
    private int    	cartId;		 		//
    /**商品一级分类ID*/
    private int	   		catId;				//
    /**附加属性：所属分类*/
    private String		catName;			//
    /**商品件数总件数--附加属性*/
    private        int          count;              //
    /**商品件数总件数--附加属性*/
    private String 		createTime;			//
    /**是否可用,0可用；1，不可用*/
    private int    		disabled;			//
    /**货款总额*/
    private        BigDecimal   goodsFee;           //
    /**默认图片ID*/
    private int 		imageDefaultId;		//
    /**图片地址*/
    private String      imageUrl;			//
    /**附加属性：默认图片的路径*/
    private String		imgPath;			//
    /**是否选中*/
    private int  	isChecked;			//
    /**商品描述*/
    private String      itemDesc;			//
    /**商品ID*/
    private int    		itemId;				//
    /**商品编号，接口调用时核对*/
    private String		itemNo;				//
    /**商品产地*/
    private String      itemOrigin;         //
    /**商品 标题（商品名称）*/
    private String		itemTitle;			//
    /**最小库存*/
    private int minqty;
    /**修改时间*/
    private String 		modTime;			//
    /**附加属性：原产地*/
    private String		originCountry;		//
    /**原产地ID*/
    private int			originCountryId;	//
    /**原价*/
    private BigDecimal originalPrice;		//
    /**场馆ID*/
    private int    		pavilionId;			//
    /**商品数量*/
    private String 	quantity;			//
    /**销量*/
    private int         salesVolume;		//
    /**售价*/
    private BigDecimal	sellingPrice;		//
    /**店铺内商品一级分类ID*/
    private int			shopCateId;			//
    /**店铺ID*/
    private int  		shopId;				//
    /**店铺名称*/
    private String 	shopName;			//
    /**店铺内商品二级分类ID*/
    private int			shopSecondclassId;	//
    /**店铺内商品二级分类ID*/
    private String		specification;		//
    /**商品状态：1上架；2下架；3待审核；4未通过*/
    private int			status;				//
    /**库存*/
    private int         store;				//
    /**库存*/
    private int    		subId;				//
    /**附加属性：子类名称*/
    private String		subName;			//
    /**副标题*/
    private String		subhead;			//
    /**单件商品小计--附加属性*/
    private 	   BigDecimal   subtotal;			//
    /**每个商品的原税金--附加属性*/
    private        BigDecimal   taxAmount;          //
    /**税率*/
    private BigDecimal  taxRate;			//
    /**税率ID*/
    private int	   		taxRateId;			//
    /**实付总税金--附加属性*/
    private        BigDecimal   taxTotal;			//
    /**原税金*/
    private        BigDecimal   taxation;			//
    /**补收关税标示---附加*/
    private        int          taxmsg;              //
    /**商品三级分类ID*/
    private int    		thirdId;			//
    /**价格合计总金额--附加属性*/
    private        BigDecimal   total;				//
    /**补收税金额*/
    private        BigDecimal    totalTaxToday;			//
    /**用户ID*/
    private int    userId;				//
    /**重量*/
    private BigDecimal  weight;
    /**请选择*/
    private String XZ  ;	//
    /**选中mjzk的type*/
    private String mjzk_type;
    /**选中mjzk的type*/
    private String mjzk_id;

    public String getMjzk_id() {
        return mjzk_id;
    }

    public void setMjzk_id(String mjzk_id) {
        this.mjzk_id = mjzk_id;
    }

    public String getMjzk_type() {
        return mjzk_type;
    }

    public void setMjzk_type(String mjzk_type) {
        this.mjzk_type = mjzk_type;
    }


    public String getXZ() {
        return XZ;
    }

    public void setXZ(String XZ) {
        this.XZ = XZ;
    }




    public CartDtos(BigDecimal goodsFee) {
        this.goodsFee = goodsFee;
    }

    public CartDtos(String quantity) {
        this.quantity = quantity;
    }

    public CartDtos(String shopName, String itemTitle, int isChecked, String imgPath, BigDecimal sellingPrice, String quantity) {

        this.shopName = shopName;
        this.itemTitle = itemTitle;
        this.isChecked = isChecked;
        this.imgPath = imgPath;
        this.sellingPrice = sellingPrice;
        this.quantity = quantity;
    }
    public CartDtos(int cartId,int itemId,String shopName, String itemTitle, String imgPath,
                    int imageDefaultId, BigDecimal sellingPrice, String quantity,int store,BigDecimal  taxRate) {
        this.itemId = itemId;
        this.cartId = cartId;
        this.shopName = shopName;
        this.itemTitle = itemTitle;
        this.imgPath = imgPath;
        this.isChecked = isChecked;
        this.imageDefaultId = imageDefaultId;
        this.sellingPrice = sellingPrice;
        this.quantity = quantity;
        this.store = store;
        this.taxRate =taxRate;

    }

    public CartDtos(int cartId,int itemId,String shopName, String itemTitle, String imgPath, int isChecked,
                    int imageDefaultId, BigDecimal sellingPrice, String quantity,int store, int	status,BigDecimal  taxRate) {
        this.itemId = itemId;
        this.cartId = cartId;
        this.shopName = shopName;
        this.itemTitle = itemTitle;
        this.imgPath = imgPath;
        this.isChecked = isChecked;
        this.imageDefaultId = imageDefaultId;
        this.sellingPrice = sellingPrice;
        this.quantity = quantity;
        this.store = store;
        this.status = status;
        this.taxRate = taxRate;
        this.XZ="请选择";
        this.mjzk_type="0";
        this.mjzk_id="0";


    }

    public String getBarCode() {
        return barCode;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }

    public String getBatchNo() {
        return batchNo;
    }

    public void setBatchNo(String batchNo) {
        this.batchNo = batchNo;
    }

    public int getBrandId() {
        return brandId;
    }

    public void setBrandId(int brandId) {
        this.brandId = brandId;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public int getCartId() {
        return cartId;
    }

    public void setCartId(int cartId) {
        this.cartId = cartId;
    }

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

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
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

    public BigDecimal getGoodsFee() {
        return goodsFee;
    }

    public void setGoodsFee(BigDecimal goodsFee) {
        this.goodsFee = goodsFee;
    }

    public int getImageDefaultId() {
        return imageDefaultId;
    }

    public void setImageDefaultId(int imageDefaultId) {
        this.imageDefaultId = imageDefaultId;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getImgPath() {
        return imgPath;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }

    public int getIsChecked() {
        return isChecked;
    }

    public void setIsChecked(int isChecked) {
        this.isChecked = isChecked;
    }

    public String getItemDesc() {
        return itemDesc;
    }

    public void setItemDesc(String itemDesc) {
        this.itemDesc = itemDesc;
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

    public String getItemOrigin() {
        return itemOrigin;
    }

    public void setItemOrigin(String itemOrigin) {
        this.itemOrigin = itemOrigin;
    }

    public String getItemTitle() {
        return itemTitle;
    }

    public void setItemTitle(String itemTitle) {
        this.itemTitle = itemTitle;
    }

    public int getMinqty() {
        return minqty;
    }

    public void setMinqty(int minqty) {
        this.minqty = minqty;
    }

    public String getModTime() {
        return modTime;
    }

    public void setModTime(String modTime) {
        this.modTime = modTime;
    }

    public String getOriginCountry() {
        return originCountry;
    }

    public void setOriginCountry(String originCountry) {
        this.originCountry = originCountry;
    }

    public int getOriginCountryId() {
        return originCountryId;
    }

    public void setOriginCountryId(int originCountryId) {
        this.originCountryId = originCountryId;
    }

    public BigDecimal getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(BigDecimal originalPrice) {
        this.originalPrice = originalPrice;
    }

    public int getPavilionId() {
        return pavilionId;
    }

    public void setPavilionId(int pavilionId) {
        this.pavilionId = pavilionId;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public int getSalesVolume() {
        return salesVolume;
    }

    public void setSalesVolume(int salesVolume) {
        this.salesVolume = salesVolume;
    }

    public BigDecimal getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(BigDecimal sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public int getShopCateId() {
        return shopCateId;
    }

    public void setShopCateId(int shopCateId) {
        this.shopCateId = shopCateId;
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

    public int getShopSecondclassId() {
        return shopSecondclassId;
    }

    public void setShopSecondclassId(int shopSecondclassId) {
        this.shopSecondclassId = shopSecondclassId;
    }

    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getStore() {
        return store;
    }

    public void setStore(int store) {
        this.store = store;
    }

    public int getSubId() {
        return subId;
    }

    public void setSubId(int subId) {
        this.subId = subId;
    }

    public String getSubName() {
        return subName;
    }

    public void setSubName(String subName) {
        this.subName = subName;
    }

    public String getSubhead() {
        return subhead;
    }

    public void setSubhead(String subhead) {
        this.subhead = subhead;
    }

    public BigDecimal getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(BigDecimal subtotal) {
        this.subtotal = subtotal;
    }

    public BigDecimal getTaxAmount() {
        return taxAmount;
    }

    public void setTaxAmount(BigDecimal taxAmount) {
        this.taxAmount = taxAmount;
    }

    public BigDecimal getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(BigDecimal taxRate) {
        this.taxRate = taxRate;
    }

    public int getTaxRateId() {
        return taxRateId;
    }

    public void setTaxRateId(int taxRateId) {
        this.taxRateId = taxRateId;
    }

    public BigDecimal getTaxTotal() {
        return taxTotal;
    }

    public void setTaxTotal(BigDecimal taxTotal) {
        this.taxTotal = taxTotal;
    }

    public BigDecimal getTaxation() {
        return taxation;
    }

    public void setTaxation(BigDecimal taxation) {
        this.taxation = taxation;
    }

    public int getTaxmsg() {
        return taxmsg;
    }

    public void setTaxmsg(int taxmsg) {
        this.taxmsg = taxmsg;
    }

    public int getThirdId() {
        return thirdId;
    }

    public void setThirdId(int thirdId) {
        this.thirdId = thirdId;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public BigDecimal getTotalTaxToday() {
        return totalTaxToday;
    }

    public void setTotalTaxToday(BigDecimal totalTaxToday) {
        this.totalTaxToday = totalTaxToday;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }
}
