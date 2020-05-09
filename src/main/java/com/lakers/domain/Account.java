package com.lakers.domain;

import java.io.Serializable;

/**
 * @Author: panyusheng
 * @Date: 2020/5/9 10:33
 * @Version 1.0
 */

public class Account implements Serializable {

    private String username;

    private String password;

    private Integer sex;

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

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Account{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", sex=" + sex +
                '}';
    }
}
