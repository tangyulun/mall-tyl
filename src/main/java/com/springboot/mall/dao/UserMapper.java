package com.springboot.mall.dao;

import com.springboot.mall.model.User;

public interface UserMapper {
    /**
     *
     * @mbggenerated 2019-11-20
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2019-11-20
     */
    int insert(User record);

    /**
     *
     * @mbggenerated 2019-11-20
     */
    int insertSelective(User record);

    /**
     *
     * @mbggenerated 2019-11-20
     */
    User selectByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2019-11-20
     */
    int updateByPrimaryKeySelective(User record);

    /**
     *
     * @mbggenerated 2019-11-20
     */
    int updateByPrimaryKey(User record);
}