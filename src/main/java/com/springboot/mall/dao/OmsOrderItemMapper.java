package com.springboot.mall.dao;

import com.springboot.mall.model.OmsOrderItem;

import java.math.BigDecimal;

public interface OmsOrderItemMapper {
    /**
     *
     * @mbggenerated 2019-11-23
     */
    int deleteByPrimaryKey(BigDecimal id);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int insert(OmsOrderItem record);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int insertSelective(OmsOrderItem record);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    OmsOrderItem selectByPrimaryKey(BigDecimal id);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int updateByPrimaryKeySelective(OmsOrderItem record);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int updateByPrimaryKey(OmsOrderItem record);
}