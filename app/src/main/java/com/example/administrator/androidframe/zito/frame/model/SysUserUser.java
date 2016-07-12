package com.example.administrator.androidframe.zito.frame.model;

/**
 * 类描述:  用户详细信息
 * 作者: 颜培福
 * 时间:2016/2/2 09:26
 * 版本:
 */
public class SysUserUser {
    private int    userId;	 //用户ID
    private int    gradeId;	 //会员等级
    private String name;	 //真实姓名
    private String idCardNo;	 //身份证号
    private String email;	 //邮箱
    private String birthday;	 //生日
    private int    sex;	 //性别，0，女；1，男。
    private int    disabled;	 //是否可用,0可用；1，不可用
    private String createTime;	 //创建时间
    private String modTime;	 //修改时间

    /** 用户头像id */
    private int userPhotoId;

    /** 头像url路径 */
    private String photoPath;

    public int getUserPhotoId() {
        return userPhotoId;
    }

    public void setUserPhotoId(int userPhotoId) {
        this.userPhotoId = userPhotoId;
    }

    public String getPhotoPath() {
        return photoPath;
    }

    public void setPhotoPath(String photoPath) {
        this.photoPath = photoPath;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getModTime() {
        return modTime;
    }

    public void setModTime(String modTime) {
        this.modTime = modTime;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getIdCardNo() {
        return idCardNo;
    }

    public void setIdCardNo(String idCardNo) {
        this.idCardNo = idCardNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGradeId() {
        return gradeId;
    }

    public void setGradeId(int gradeId) {
        this.gradeId = gradeId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
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
}
