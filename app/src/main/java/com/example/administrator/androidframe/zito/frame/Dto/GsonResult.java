package com.example.administrator.androidframe.zito.frame.Dto;


import com.example.administrator.androidframe.zito.frame.model.Banner;
import com.example.administrator.androidframe.zito.frame.model.CartDto;
import com.example.administrator.androidframe.zito.frame.model.City;
import com.example.administrator.androidframe.zito.frame.model.ColumnNavigation;
import com.example.administrator.androidframe.zito.frame.model.Coupons;
import com.example.administrator.androidframe.zito.frame.model.OrderDetails;
import com.example.administrator.androidframe.zito.frame.model.OrderManagement;
import com.example.administrator.androidframe.zito.frame.model.PageDto;
import com.example.administrator.androidframe.zito.frame.model.PageHelper;
import com.example.administrator.androidframe.zito.frame.model.ProDto;
import com.example.administrator.androidframe.zito.frame.model.Province;
import com.example.administrator.androidframe.zito.frame.model.ShopCoupons;
import com.example.administrator.androidframe.zito.frame.model.ShoppingAddress;
import com.example.administrator.androidframe.zito.frame.model.Shops;
import com.example.administrator.androidframe.zito.frame.model.SpecItemSpec;
import com.example.administrator.androidframe.zito.frame.model.SysCategoryCat;
import com.example.administrator.androidframe.zito.frame.model.SysCategorySubclass;
import com.example.administrator.androidframe.zito.frame.model.SysItemItem;
import com.example.administrator.androidframe.zito.frame.model.SysUserAccount;
import com.example.administrator.androidframe.zito.frame.model.SysUserUser;
import com.example.administrator.androidframe.zito.frame.model.Welcomes;

import java.io.Serializable;
import java.util.List;

/**
 * 类描述：Gson解析数据实体类
 * 作者：刘士良
 * 时间：2016/1/22 11:50
 * 版本：
 */
public class GsonResult implements Serializable {

    /**
     * JSON返回的用户收货地址信息
     */
    private List<ShoppingAddress> address;
    /**
     * JSON返回的三级联动省的信息
     */
    private List<Province> prolist;
    /**
     * JSON返回的三级联动市的信息
     */
    private List<City> citylist;
    /**
     * JSON返回的三级联动县的信息
     */
    private List<City> countylist;
    /**
     * JSON返回的用户详细信息
     */
    private SysUserUser user;
    /**
     * JSON返回的用户信息
     */
    private SysUserAccount account;
    /**
     * JSON返回的信息字段
     */
    private String message;
    /**
     * JSON返回的状态码
     */
    private String status = null;
    /**
     * json返回的商品信息pagedto
     */
    private PageDto pageDto;
    /**
     * 首页轮播的图片地址
     */
    private List<String> urls;
    /**
     * Shops
     */
    private List<Shops> shops;
    /**
     * 栏目导航一级分类
     */
    private List<SysCategoryCat> cats;
    /**
     * 商品二级分类
     */
    private List<SysCategorySubclass> subclasses;
    /**
     * 最新上市商品信息集合
     */
    private List<SysItemItem> items;
    private List<SpecItemSpec> specItemSpecs;

    public List<SpecItemSpec> getSpecItemSpecs() {
        return specItemSpecs;
    }

    public void setSpecItemSpecs(List<SpecItemSpec> specItemSpecs) {
        this.specItemSpecs = specItemSpecs;
    }

    /**

     * CartDtoes
     */
    private CartDto cartDto;
    /**
     * 商品详情
     */
    private SysItemItem item;
    /**
     * 订单管理 （根据用户ID查询订单信息）
     */
    private OrderManagement data;
    /**
     * 未付款订单数量
     */
    private int count;
    /**
     * 店铺商品信息
     */
    private PageHelper pageHelper;
    /**
     * 订单详情
     */
    private OrderDetails trade;
    /**
     * 商品库存
     */
    private int itemStore;
    /**
     * 商品优惠
     */
    private List<ProDto> proDtos;
    /**
     * 交易号
     */
    private String clearNo;
    /**
     * 图片id
     */
    private int imageId;
    /**
     * Banner
     */
    private List<Banner> banners;
    /**
     * 栏目导航
     */
    private List<ColumnNavigation> navigations;
    /**
     * 栏目导航全部按钮
     */
    private ColumnNavigation allButton;

    /**
     * 欢迎页
     */
    private List<Welcomes> welcomes;
    /**
     * 加密订单信息
     */
    private String sign;
    /**
     * 用户加密的密码
     */
    private String password;
    /**
     * 获取用户优惠券
     */
    private List<Coupons> coupons;
    /**
     * 查询店铺优惠券
     */
    private List<ShopCoupons> shopCoupons;

    /**
     * get,set方法
     *
     * @return
     */

    public ColumnNavigation getAllButton() {
        return allButton;
    }

    public void setAllButton(ColumnNavigation allButton) {
        this.allButton = allButton;
    }

    public List<ShopCoupons> getShopCoupons() {
        return shopCoupons;
    }

    public void setShopCoupons(List<ShopCoupons> shopCoupons) {
        this.shopCoupons = shopCoupons;
    }

    public List<ColumnNavigation> getNavigations() {
        return navigations;
    }

    public void setNavigations(List<ColumnNavigation> navigations) {
        this.navigations = navigations;
    }

    public List<Coupons> getCoupons() {
        return coupons;
    }

    public void setCoupons(List<Coupons> coupons) {
        this.coupons = coupons;
    }

    public List<Welcomes> getWelcomes() {
        return welcomes;
    }

    public void setWelcomes(List<Welcomes> welcomes) {
        this.welcomes = welcomes;
    }
    public List<Banner> getBanners() {
        return banners;
    }

    public void setBanners(List<Banner> banners) {
        this.banners = banners;
    }


    public String getClearNo() {
        return clearNo;
    }

    public void setClearNo(String clearNo) {
        this.clearNo = clearNo;
    }


    public List<ProDto> getProDtos() {
        return proDtos;
    }

    public void setProDtos(List<ProDto> proDtos) {
        this.proDtos = proDtos;
    }


    public int getItemStore() {
        return itemStore;
    }

    public void setItemStore(int itemStore) {
        this.itemStore = itemStore;
    }

    public OrderDetails getTrade() {
        return trade;
    }

    public void setTrade(OrderDetails trade) {
        this.trade = trade;
    }

    public OrderManagement getData() {
        return data;
    }

    public void setData(OrderManagement data) {
        this.data = data;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public CartDto getCartDto() {
        return cartDto;
    }

    public void setCartDto(CartDto cartDto) {
        this.cartDto = cartDto;
    }

    public List<SysItemItem> getItems() {
        return items;
    }

    public void setItems(List<SysItemItem> items) {
        this.items = items;
    }

    public List<SysCategoryCat> getCats() {
        return cats;
    }

    public void setCats(List<SysCategoryCat> cats) {
        this.cats = cats;
    }

    public List<String> getUrls() {
        return urls;
    }

    public void setUrls(List<String> urls) {
        this.urls = urls;
    }

    public PageDto getPageDto() {
        return pageDto;
    }

    public void setPageDto(PageDto pageDto) {
        this.pageDto = pageDto;
    }

    public SysUserAccount getAccount() {
        return account;
    }

    public void setAccount(SysUserAccount account) {
        this.account = account;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<ShoppingAddress> getAddress() {
        return address;
    }

    public void setAddress(List<ShoppingAddress> address) {
        this.address = address;
    }

    public List<Province> getProlist() {
        return prolist;
    }

    public void setProlist(List<Province> prolist) {
        this.prolist = prolist;
    }

    public List<City> getCitylist() {
        return citylist;
    }

    public void setCitylist(List<City> citylist) {
        this.citylist = citylist;
    }

    public List<City> getCountylist() {
        return countylist;
    }

    public void setCountylist(List<City> countylist) {
        this.countylist = countylist;
    }

    public List<Shops> getShops() {
        return shops;
    }

    public void setShops(List<Shops> shops) {
        this.shops = shops;
    }

    public List<SysCategorySubclass> getSubclasses() {
        return subclasses;
    }

    public void setSubclasses(List<SysCategorySubclass> subclasses) {
        this.subclasses = subclasses;
    }

    public SysUserUser getUser() {
        return user;
    }

    public void setUser(SysUserUser user) {
        this.user = user;
    }

    public SysItemItem getItem() {
        return item;
    }

    public void setItem(SysItemItem item) {
        this.item = item;
    }

    public PageHelper getPageHelper() {
        return pageHelper;
    }

    public void setPageHelper(PageHelper pageHelper) {
        this.pageHelper = pageHelper;
    }


    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}