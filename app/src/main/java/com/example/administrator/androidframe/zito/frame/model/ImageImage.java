package com.example.administrator.androidframe.zito.frame.model;

import java.io.Serializable;

/**
 * 类描述: 搜索商品 商品图片实体类
 * 作者: 颜培福
 * 时间:2016/1/26 16:19
 * 版本:
 */
public class ImageImage implements Serializable{
        /** 图片ID*/
        private int    	imageId;
        /** 图片名称*/
        private String  imageName;
        /** 图片地址*/
        private String 	imagePath;
        /** 图片类型*/
        private String 	imageType;
        /**批次号*/
        private String 	batchNo;
        /**是否可用,0可用；1，不可用*/
        private int 	disabled;
        /**是否可用,0可用；1，不可用*/
        private String 	createTime;
        /**修改时间*/
        private String 	modTime;
        /** 平台：0本平台；1：跨境一号*/
        private String platform;
        /** 图片Ip*/
        private String weburl;

        public int getImageId() {
                return imageId;
        }

        public void setImageId(int imageId) {
                this.imageId = imageId;
        }

        public String getImageName() {
                return imageName;
        }

        public void setImageName(String imageName) {
                this.imageName = imageName;
        }

        public String getImagePath() {
                return imagePath;
        }

        public void setImagePath(String imagePath) {
                this.imagePath = imagePath;
        }

        public String getImageType() {
                return imageType;
        }

        public void setImageType(String imageType) {
                this.imageType = imageType;
        }

        public String getBatchNo() {
                return batchNo;
        }

        public void setBatchNo(String batchNo) {
                this.batchNo = batchNo;
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

        public String getPlatform() {
                return platform;
        }

        public void setPlatform(String platform) {
                this.platform = platform;
        }

        public String getWeburl() {
                return weburl;
        }

        public void setWeburl(String weburl) {
                this.weburl = weburl;
        }
}
