package com.lakers.dao;

import com.lakers.domain.Bank;

/**
 * @Author: panyusheng
 * @Date: 2020/5/12 17:10
 * @Version 1.0
 */
public interface BankDao {

    Bank findById(Integer id);

}
