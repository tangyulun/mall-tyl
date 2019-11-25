package com.springboot.mall.dao;

import com.springboot.mall.model.MallUser;

import java.math.BigDecimal;

public interface MallUserMapper {
    /**
     *
     * @mbggenerated 2019-11-24
     */
    int deleteByPrimaryKey(BigDecimal id);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int insert(MallUser record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int insertSelective(MallUser record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    MallUser selectByPrimaryKey(BigDecimal id);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int updateByPrimaryKeySelective(MallUser record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int updateByPrimaryKey(MallUser record);
}