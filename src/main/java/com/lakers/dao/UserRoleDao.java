package com.lakers.dao;

import com.lakers.domain.User;

import java.util.List;

/**
 * @Author: panyusheng
 * @Date: 2020/5/12 14:20
 * @Version 1.0
 */
public interface UserRoleDao {

    List<User> findAll();

}
