package com.lakers.dao;

import com.lakers.domain.Bank;
import com.lakers.domain.User;
import com.lakers.vo.BankUserVo;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;


/**
 * @Author: panyusheng
 * @Date: 2020/5/12 10:38
 * @Version 1.0
 */
public class BankUserDaoTest {

    private InputStream in;
    private SqlSession session;

    @Before
    public void init() throws IOException {
        in = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(in);
        session = factory.openSession();
    }

    @Test
    public void findAll() {
        BankUserDao mapper = session.getMapper(BankUserDao.class);
        List<BankUserVo> all = mapper.findAll();
        for (BankUserVo vo : all) {
            System.out.println(vo);
        }
    }

    @Test
    public void findAllByMabatis() {
        BankUserDao mapper = session.getMapper(BankUserDao.class);
        List<Bank> all = mapper.findAllByMabatis();
        for (Bank vo : all) {
            System.out.println(vo);
            System.out.println(vo.getUser());
            System.out.println("----------------");
        }
    }

    @Test
    public void findByMabatis() {
        BankUserDao mapper = session.getMapper(BankUserDao.class);
        List<User> byMabatis = mapper.findByMabatis();
        for (User u : byMabatis) {
            System.out.println(u);
//            System.out.println(u.getBanks());
            System.out.println("--------------");
        }
    }

    /**
     * association懒加载
     *
     * @return
     */
    @Test
    public void associationLazyLoad() {
        BankUserDao mapper = session.getMapper(BankUserDao.class);
        List<Bank> banks = mapper.associationLazyLoad();
        for (Bank bank : banks) {
            System.out.println(bank.getUser());
        }
    }

    /**
     * collection懒加载
     *
     * @return
     */
    @Test
    public void collectionLazyLoad() {
        UserDao mapper = session.getMapper(UserDao.class);
        List<User> all = mapper.findAll();
        for (User u : all) {
//            System.out.println(u.getBanks());
        }
    }

    @After
    public void release() throws IOException {
        in.close();
        session.close();
    }

}