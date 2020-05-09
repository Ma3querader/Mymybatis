package com.lakers.dao;

import com.lakers.domain.Account;

/**
 * @Author: panyusheng
 * @Date: 2020/5/9 10:35
 * @Version 1.0
 */
public interface AccountDao {

    Account findByName(String name);

}
