package com.lakers.dao;

import com.lakers.domain.User;



/**
 * @Author: panyusheng
 * @Date: 2020/5/12 15:12
 * @Version 1.0
 */
public interface UserDao {

    User findById(Integer id);

}