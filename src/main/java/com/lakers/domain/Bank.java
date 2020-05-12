package com.lakers.domain;

import java.io.Serializable;

/**
 * @Author: panyusheng
 * @Date: 2020/5/12 10:20
 * @Version 1.0
 */
public class Bank implements Serializable {

    private Integer accountNo;

    private Integer uid;

    private Double money;

    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Integer getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(Integer accountNo) {
        this.accountNo = accountNo;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "accountNo=" + accountNo +
                ", uid=" + uid +
                ", money=" + money +
                '}';
    }
}
