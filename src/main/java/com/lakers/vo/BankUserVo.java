package com.lakers.vo;

import com.lakers.domain.Bank;

import java.io.Serializable;

/**
 * @Author: panyusheng
 * @Date: 2020/5/12 10:34
 * @Version 1.0
 */
public class BankUserVo extends Bank implements Serializable {

    private String username;

    private String address;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return super.toString() +
                "BankUserVo{" +
                "username='" + username + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
