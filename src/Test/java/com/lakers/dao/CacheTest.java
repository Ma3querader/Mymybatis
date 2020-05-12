package com.lakers.dao;

import com.lakers.domain.User;
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

import static org.junit.Assert.*;

/**
 * @Author: panyusheng
 * @Date: 2020/5/12 14:27
 * @Version 1.0
 */
public class CacheTest {

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
    public void testCache() {
        UserDao mapper = session.getMapper(UserDao.class);
        User u = mapper.findById(2);
        User user = new User();
        user.setUsername("二丁目");
        user.setId(2);
        mapper.updateUser(user);
        session.commit();
        User u2 = mapper.findById(2);
        System.out.println(u);
        System.out.println(u2);
    }

    @After
    public void release() throws IOException {
        in.close();
        session.close();
    }
}