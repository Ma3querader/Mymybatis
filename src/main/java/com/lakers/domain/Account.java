package com.lakers.domain;

import java.io.Serializable;

/**
 * @Author: panyusheng
 * @Date: 2020/5/9 10:33
 * @Version 1.0
 */

public class Account implements Serializable {

    private String name;

    private String pw;

    private Integer sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
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
                "name='" + name + '\'' +
                ", pw='" + pw + '\'' +
                ", sex=" + sex +
                '}';
    }
}
