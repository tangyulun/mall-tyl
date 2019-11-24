package com.springboot.mall.dao;

import com.springboot.mall.model.UmsAdmin;

import java.math.BigDecimal;

public interface UmsAdminMapper {
    /**
     *
     * @mbggenerated 2019-11-23
     */
    int deleteByPrimaryKey(BigDecimal id);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int insert(UmsAdmin record);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int insertSelective(UmsAdmin record);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    UmsAdmin selectByPrimaryKey(BigDecimal id);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int updateByPrimaryKeySelective(UmsAdmin record);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int updateByPrimaryKey(UmsAdmin record);
}