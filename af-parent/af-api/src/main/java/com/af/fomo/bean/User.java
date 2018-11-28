package com.af.fomo.bean;

import java.io.Serializable;

/**
 * 用户实体类
 *
 * @author LiSong
 * @date 2018/11/28 11:07
 */
public class User implements Serializable {

    private Integer userId;
    private String username;
    private String password;
    private String salt;
    private String nickname;


    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
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

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
}
