package com.example.capp.dto;

/***
 * tl_user用户表
 */
public class User {

    /**
     * 用户表主键id
     */
    private Long id;

    /***
     * 用户名
     */
    private String username;

    /***
     * 密码
     */
    private String password;

    /**
     * 用户显示的名称
     */
    private String screenName;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 头像图片地址
     */
    private String avater;

    /***
     * 主页地址
     */
    private String homeUrl;

    /***
     * 最后活动时间
     */
    private Long lastActivated;

    /***
     * 上次登录最后活动时间
     */
    private Long lastLogged;

    /**
     * 用户组
     */
    private String groupNmae;



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getScreenName() {
        return screenName;
    }

    public void setScreenName(String screenName) {
        this.screenName = screenName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAvater() {
        return avater;
    }

    public void setAvater(String avater) {
        this.avater = avater;
    }

    public String getHomeUrl() {
        return homeUrl;
    }

    public void setHomeUrl(String homeUrl) {
        this.homeUrl = homeUrl;
    }

    public Long getLastActivated() {
        return lastActivated;
    }

    public void setLastActivated(Long lastActivated) {
        this.lastActivated = lastActivated;
    }

    public Long getLastLogged() {
        return lastLogged;
    }

    public void setLastLogged(Long lastLogged) {
        this.lastLogged = lastLogged;
    }

    public String getGroupNmae() {
        return groupNmae;
    }

    public void setGroupNmae(String groupNmae) {
        this.groupNmae = groupNmae;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", screenName='" + screenName + '\'' +
                ", email='" + email + '\'' +
                ", avater='" + avater + '\'' +
                ", homeUrl='" + homeUrl + '\'' +
                ", lastActivated=" + lastActivated +
                ", lastLogged=" + lastLogged +
                ", groupNmae='" + groupNmae + '\'' +
                '}';
    }
}