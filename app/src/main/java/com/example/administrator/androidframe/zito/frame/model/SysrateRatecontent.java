package com.example.administrator.androidframe.zito.frame.model;

import java.util.List;

/**
 * 类描述：评论
 * 作者：刘士良
 * 时间：2016/2/25 15:03
 * 版本：
 */
public class SysrateRatecontent {
    /** 评价内容ID*/
    private int contentId;
    /** 评价ID*/
    private int rateId;
    /** 评价内容*/
    private String content;
    /** 回复内容*/
    private String replyContent;
    /** 回复时间*/
    private String replyTime;
    /** 类型 0 未回复1已回复*/
    private int replyType;
    /** 图片对应批次号*/
    private String batchNo;
    /** 评价内荣图片信息*/
    private List<ImageImage> imageList;

    public int getContentId() {
        return contentId;
    }

    public void setContentId(int contentId) {
        this.contentId = contentId;
    }

    public int getRateId() {
        return rateId;
    }

    public void setRateId(int rateId) {
        this.rateId = rateId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getReplyContent() {
        return replyContent;
    }

    public void setReplyContent(String replyContent) {
        this.replyContent = replyContent;
    }

    public String getReplyTime() {
        return replyTime;
    }

    public void setReplyTime(String replyTime) {
        this.replyTime = replyTime;
    }

    public int getReplyType() {
        return replyType;
    }

    public void setReplyType(int replyType) {
        this.replyType = replyType;
    }

    public String getBatchNo() {
        return batchNo;
    }

    public void setBatchNo(String batchNo) {
        this.batchNo = batchNo;
    }

    public List<ImageImage> getImageList() {
        return imageList;
    }

    public void setImageList(List<ImageImage> imageList) {
        this.imageList = imageList;
    }
}
