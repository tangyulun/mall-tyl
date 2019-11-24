package com.springboot.mall.dao;

import com.springboot.mall.model.SmsCouponProductRelation;

import java.math.BigDecimal;

public interface SmsCouponProductRelationMapper {
    /**
     *
     * @mbggenerated 2019-11-23
     */
    int deleteByPrimaryKey(BigDecimal id);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int insert(SmsCouponProductRelation record);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int insertSelective(SmsCouponProductRelation record);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    SmsCouponProductRelation selectByPrimaryKey(BigDecimal id);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int updateByPrimaryKeySelective(SmsCouponProductRelation record);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int updateByPrimaryKey(SmsCouponProductRelation record);
}