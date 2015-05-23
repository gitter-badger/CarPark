/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vo;

import java.io.Serializable;

/**
 *用户类
 * @author Zeming
 */
public class User implements Serializable {

    private Integer id;
    private String userName;//用户名
    private String userPwd;//密码

    public User() {
    }

    public User(String userName, String userPwd) {
        this.userName = userName;
        this.userPwd = userPwd;
    }

    public User(Integer id, String userName, String userPwd) {
        this.id = id;
        this.userName = userName;
        this.userPwd = userPwd;
    }

    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return the userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName the userName to set
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * @return the userPwd
     */
    public String getUserPwd() {
        return userPwd;
    }

    /**
     * @param userPwd the userPwd to set
     */
    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", userName=" + userName + ", userPwd=" + userPwd + '}';
    }
}
