package com.example.administrator.androidframe.zito.frame.model;

import java.io.Serializable;

/**
 * 类描述：店铺幻灯片管理
 * 作者：刘士良
 * 时间：2016/2/14 15:01
 * 版本：
 */
public class SysShopPpt implements Serializable {
    /**
     * serialVersionUID:
     */

    private static final long serialVersionUID = 1L;


    /**主键*/
    private int pptId;
    /**店铺id*/
    private int shopId;

    /**第一张id 批次号  点击图片链接*/
    private int imageIdA;
    private String batchNoA;
    private String imgUrlA;

    /**第二张id 批次号  点击图片链接*/
    private int imageIdB;
    private String batchNoB;
    private String imgUrlB;

    /**第三张id 批次号  点击图片链接*/
    private int imageIdC;
    private String batchNoC;
    private String imgUrlC;

    /**第四张id 批次号  点击图片链接*/
    private int imageIdD;
    private String batchNoD;
    private String imgUrlD;

    /**第五张id 批次号  点击图片链接*/
    private int imageIdE;
    private String batchNoE;
    private String imgUrlE;

    /**附加属性*/
    private String imagePathA;
    private String imagePathB;
    private String imagePathC;
    private String imagePathD;
    private String imagePathE;

    public int getPptId() {
        return pptId;
    }
    public void setPptId(int pptId) {
        this.pptId = pptId;
    }
    public int getShopId() {
        return shopId;
    }
    public void setShopId(int shopId) {
        this.shopId = shopId;
    }
    public int getImageIdA() {
        return imageIdA;
    }
    public void setImageIdA(int imageIdA) {
        this.imageIdA = imageIdA;
    }
    public String getBatchNoA() {
        return batchNoA;
    }
    public void setBatchNoA(String batchNoA) {
        this.batchNoA = batchNoA;
    }
    public String getImgUrlA() {
        return imgUrlA;
    }
    public void setImgUrlA(String imgUrlA) {
        this.imgUrlA = imgUrlA;
    }
    public int getImageIdB() {
        return imageIdB;
    }
    public void setImageIdB(int imageIdB) {
        this.imageIdB = imageIdB;
    }
    public String getBatchNoB() {
        return batchNoB;
    }
    public void setBatchNoB(String batchNoB) {
        this.batchNoB = batchNoB;
    }
    public String getImgUrlB() {
        return imgUrlB;
    }
    public void setImgUrlB(String imgUrlB) {
        this.imgUrlB = imgUrlB;
    }
    public int getImageIdC() {
        return imageIdC;
    }
    public void setImageIdC(int imageIdC) {
        this.imageIdC = imageIdC;
    }
    public String getBatchNoC() {
        return batchNoC;
    }
    public void setBatchNoC(String batchNoC) {
        this.batchNoC = batchNoC;
    }
    public String getImgUrlC() {
        return imgUrlC;
    }
    public void setImgUrlC(String imgUrlC) {
        this.imgUrlC = imgUrlC;
    }
    public int getImageIdD() {
        return imageIdD;
    }
    public void setImageIdD(int imageIdD) {
        this.imageIdD = imageIdD;
    }
    public String getBatchNoD() {
        return batchNoD;
    }
    public void setBatchNoD(String batchNoD) {
        this.batchNoD = batchNoD;
    }
    public String getImgUrlD() {
        return imgUrlD;
    }
    public void setImgUrlD(String imgUrlD) {
        this.imgUrlD = imgUrlD;
    }
    public int getImageIdE() {
        return imageIdE;
    }
    public void setImageIdE(int imageIdE) {
        this.imageIdE = imageIdE;
    }
    public String getBatchNoE() {
        return batchNoE;
    }
    public void setBatchNoE(String batchNoE) {
        this.batchNoE = batchNoE;
    }
    public String getImgUrlE() {
        return imgUrlE;
    }
    public void setImgUrlE(String imgUrlE) {
        this.imgUrlE = imgUrlE;
    }

    public String getImagePathA() {
        return imagePathA;
    }

    public void setImagePathA(String imagePathA) {
        this.imagePathA = imagePathA;
    }

    public String getImagePathB() {
        return imagePathB;
    }

    public void setImagePathB(String imagePathB) {
        this.imagePathB = imagePathB;
    }

    public String getImagePathC() {
        return imagePathC;
    }

    public void setImagePathC(String imagePathC) {
        this.imagePathC = imagePathC;
    }

    public String getImagePathD() {
        return imagePathD;
    }

    public void setImagePathD(String imagePathD) {
        this.imagePathD = imagePathD;
    }

    public String getImagePathE() {
        return imagePathE;
    }

    public void setImagePathE(String imagePathE) {
        this.imagePathE = imagePathE;
    }
}