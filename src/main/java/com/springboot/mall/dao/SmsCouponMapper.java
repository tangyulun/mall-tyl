package com.springboot.mall.dao;

import com.springboot.mall.model.SmsCoupon;

import java.math.BigDecimal;

public interface SmsCouponMapper {
    /**
     *
     * @mbggenerated 2019-11-23
     */
    int deleteByPrimaryKey(BigDecimal id);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int insert(SmsCoupon record);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int insertSelective(SmsCoupon record);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    SmsCoupon selectByPrimaryKey(BigDecimal id);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int updateByPrimaryKeySelective(SmsCoupon record);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int updateByPrimaryKey(SmsCoupon record);
}