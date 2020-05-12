package com.lakers.dao;

import com.lakers.domain.Bank;
import com.lakers.vo.BankUserVo;

import java.util.List;

/**
 * @Author: panyusheng
 * @Date: 2020/5/12 10:36
 * @Version 1.0
 */
public interface BankUserDao {

    List<BankUserVo> findAll();

    /**
     * 通过mybatis的方式关联
     *
     * @return
     */
    List<Bank> findAllByMabatis();

}
