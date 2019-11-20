package com.springboot.mall.dao;

import com.springboot.mall.model.MallUser;

import java.math.BigDecimal;

public interface MallUserMapper {
    /**
     *
     * @mbggenerated 2019-11-20
     */
    int deleteByPrimaryKey(BigDecimal id);

    /**
     *
     * @mbggenerated 2019-11-20
     */
    int insert(MallUser record);

    /**
     *
     * @mbggenerated 2019-11-20
     */
    int insertSelective(MallUser record);

    /**
     *
     * @mbggenerated 2019-11-20
     */
    MallUser selectByPrimaryKey(BigDecimal id);

    /**
     *
     * @mbggenerated 2019-11-20
     */
    int updateByPrimaryKeySelective(MallUser record);

    /**
     *
     * @mbggenerated 2019-11-20
     */
    int updateByPrimaryKey(MallUser record);
}