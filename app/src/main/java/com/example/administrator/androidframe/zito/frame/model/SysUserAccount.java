package com.example.administrator.androidframe.zito.frame.model;

/**
 * 类描述：user实体类
 * 作者：刘士良
 * 时间：2016/1/22 10:41
 * 版本：
 */
public class SysUserAccount {
    /**用户ID*/
    private int userId;
    /**用户姓名*/
    private String username;
    /**密码*/
    private String password;
    /**手机号*/
    private String mobile;
    /**邮箱*/
    private String email;
    /**昵称*/
    private String nickName;
    /**是否可用,0可用；1，不可用*/
    private int disabled;
    /**创建时间*/
    private String createTime;
    /**修改时间*/
    private String modTime;

    /**
     * get、set方法
     */
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

}


