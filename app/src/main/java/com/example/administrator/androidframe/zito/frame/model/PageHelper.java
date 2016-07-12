package com.example.administrator.androidframe.zito.frame.model;

import java.util.List;

/**
 * 类描述：店铺商品Gson解析实体类
 * 作者：刘士良
 * 时间：2016/2/16 14:30
 * 版本：
 */
public class PageHelper {

    private List<SysItemItem> pageList;
    private int totalCount = 0; // 总记录数
    private int totalPage = 1; // 总页数
    private int pageNo = 1; // 当前页
    private boolean first;
    private boolean last;
    private int limit;

    public List<SysItemItem> getPageList() {
        return pageList;
    }
    public void setPageList(List<SysItemItem> pageList) {
        this.pageList = pageList;
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

    public int getPageNo() {
        return pageNo;
    }

    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }

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
}
