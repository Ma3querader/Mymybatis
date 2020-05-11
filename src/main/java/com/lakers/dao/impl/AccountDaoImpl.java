package com.lakers.dao.impl;

import com.lakers.dao.AccountDao;
import com.lakers.domain.Account;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

/**
 * @Author: panyusheng
 * @Date: 2020/5/11 14:27
 * @Version 1.0
 */
public class AccountDaoImpl implements AccountDao {

    private SqlSessionFactory factory;

    public AccountDaoImpl(SqlSessionFactory factory) {
        this.factory = factory;
    }

    public List<Account> findAll() {
        SqlSession session = factory.openSession();
        List<Account> accounts = session.selectList("com.lakers.dao.AccountDao.findAll");
        session.close();
        return accounts;
    }

    public Account findByName(String name) {
        return null;
    }

    public void saveAccount(Account account) {

    }

    public List<Account> findByCondition(Account account) {
        return null;
    }
}
