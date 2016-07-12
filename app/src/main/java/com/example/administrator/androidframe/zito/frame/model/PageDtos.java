package com.example.administrator.androidframe.zito.frame.model;

import java.util.List;
import java.util.Set;

/**
 * 类描述:
 * 作者: 颜培福
 * 时间:2016/2/22 13:05
 * 版本:
 */
public class PageDtos {

    private List<SysShopShop> pageList;
    /**
     * 当前页
     */
    private  int  pageNo;
    /**
     * 总记录数
     */
    private  int totalCount;
    /**
     * 总页数
     */
    private  int totalPage;
    /** 品牌集合 */
    private Set<String> brands;


    public List<SysShopShop> getPageList() {
        return pageList;
    }

    public void setPageList(List<SysShopShop> pageList) {
        this.pageList = pageList;
    }

    public int getPageNo() {
        return pageNo;
    }

    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public Set<String> getBrands() {
        return brands;
    }

    public void setBrands(Set<String> brands) {
        this.brands = brands;
    }
}
