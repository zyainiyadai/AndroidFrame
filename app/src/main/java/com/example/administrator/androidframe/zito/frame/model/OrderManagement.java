package com.example.administrator.androidframe.zito.frame.model;

import java.util.List;

/**
 * 类描述:订单管理 （根据用户ID查询订单信息）
 * 作者: 岳志远
 * 时间: 2016/2/16 13:44
 * 版本:
 */
public class OrderManagement {
    /**
     *第一
     */
    private boolean first;
    /**
     *最后
     */
    private boolean last;
    /**
     * 限制
     */
    private int limit;
    /**
     *订单集合
     */
    private List<OrderPageList> pageList;
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

    public boolean isFirst() {
        return first;
    }

    public void setFirst(boolean first) {
        this.first = first;
    }

    public boolean isLast() {
        return last;
    }

    public void setLast(boolean last) {
        this.last = last;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public List<OrderPageList> getPageList() {
        return pageList;
    }

    public void setPageList(List<OrderPageList> pageList) {
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
}
