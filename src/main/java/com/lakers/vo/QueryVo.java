package com.lakers.vo;

import java.io.Serializable;
import java.util.List;

/**
 * @Author: panyusheng
 * @Date: 2020/5/12 0:55
 * @Version 1.0
 */
public class QueryVo implements Serializable {

    private List<String> passwords;

    public List<String> getPasswords() {
        return passwords;
    }

    public void setPasswords(List<String> passwords) {
        this.passwords = passwords;
    }
}
