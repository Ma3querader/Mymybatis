package com.lakers.dao.impl;

import com.lakers.domain.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Properties;

import static org.junit.Assert.*;

/**
 * @Author: panyusheng
 * @Date: 2020/5/11 14:31
 * @Description: dao实现类的方式
 * @Version 1.0
 */
public class AccountDaoImplTest {

    private AccountDaoImpl mapper;

    @Before
    public void init() throws IOException {
        InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(in);
        mapper = new AccountDaoImpl(factory);
    }

    @Test
    public void findAll() {
        List<Account> all = mapper.findAll();
        System.out.println(all);
    }

}