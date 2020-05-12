package com.lakers.dao;

import com.lakers.domain.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;


/**
 * @Author: panyusheng
 * @Date: 2020/5/12 15:12
 * @Version 1.0
 */
public interface UserDao {

    User findById(Integer id);

    List<User> findAll();

    void updateUser(User u);

    /**
     * 基于注解的方式查询所有
     *
     * @return
     */
    @Select("select * from user")
    @Results(id="userMap1",
            value= {
                    @Result(id=true,column="id",property="userId"),
                    @Result(column="username",property="username"),
                    @Result(column="sex",property="userSex"),
                    @Result(column="address",property="userAddress"),
                    @Result(column="birthday",property="userBirthday")
            })
    List<User> findAllByAnnotation();

}
