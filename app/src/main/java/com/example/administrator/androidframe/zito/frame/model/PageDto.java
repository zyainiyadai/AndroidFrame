package com.example.administrator.androidframe.zito.frame.model;

import java.util.ArrayList;
import java.util.List;

/**
 * 类描述:  搜索商品json解析实体类
 * 作者: 颜培福
 * 时间:2016/1/26 16:31
 * 版本:
 */
public class PageDto {
        /**
         * 搜索到的商品集合
         */
        private List<SysItemItem> pageList;
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
        private ArrayList<String> brands;

        public ArrayList<String> getBrands() {
                return brands;
        }

        public void setBrands(ArrayList<String> brands) {
                this.brands = brands;
        }

        public List<SysItemItem> getPageList() {
                return pageList;
        }

        public void setPageList(List<SysItemItem> pageList) {
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
