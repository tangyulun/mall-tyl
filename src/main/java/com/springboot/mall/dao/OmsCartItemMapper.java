package com.springboot.mall.dao;

import com.springboot.mall.model.OmsCartItem;

import java.math.BigDecimal;

public interface OmsCartItemMapper {
    /**
     *
     * @mbggenerated 2019-11-23
     */
    int deleteByPrimaryKey(BigDecimal id);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int insert(OmsCartItem record);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int insertSelective(OmsCartItem record);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    OmsCartItem selectByPrimaryKey(BigDecimal id);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int updateByPrimaryKeySelective(OmsCartItem record);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int updateByPrimaryKey(OmsCartItem record);
}