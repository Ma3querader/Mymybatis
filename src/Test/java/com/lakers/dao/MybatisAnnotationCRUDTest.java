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

/**
 * @Author: panyusheng
 * @Date: 2020/5/13 0:56
 * @Version 1.0
 */
public class MybatisAnnotationCRUDTest {

    private InputStream in;
    private SqlSession sqlSession;
    private UserDao mapper;

    @Before
    public void init() throws IOException {
        in = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(in);
        sqlSession = factory.openSession();
        mapper = sqlSession.getMapper(UserDao.class);
    }


    /**
     * 测试查询所有
     */
    @Test
    public void testFindAll() {
        List<User> users = mapper.findAllByAnnotation();
        for(User user : users) {
            System.out.println(user);
        }
    }

    @After
    public void destory() throws IOException {
        sqlSession.commit();
        sqlSession.close();
        in.close();
    }

}
