package com.example.administrator.androidframe.zito.frame.model;

import java.util.List;

/**
 * 类描述：详细评论
 * 作者：刘士良
 * 时间：2016/2/25 15:03
 * 版本：
 */
public class RateDto {
    /** 商品规格 */
    private String specification;
    /** 评价时间 */
    private String time;
    /** 评价人 */
    private String nickname;
    /** 评论人手机号 */
    private String mobile;
    /** 评分 */
    private String result;
    /** 评价内容 */
    private List<SysrateRatecontent> list;

    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public List<SysrateRatecontent> getList() {
        return list;
    }

    public void setList(List<SysrateRatecontent> list) {
        this.list = list;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}
