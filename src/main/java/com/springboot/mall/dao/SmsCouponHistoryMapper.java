package com.springboot.mall.dao;

import com.springboot.mall.model.SmsCouponHistory;

import java.math.BigDecimal;

public interface SmsCouponHistoryMapper {
    /**
     *
     * @mbggenerated 2019-11-23
     */
    int deleteByPrimaryKey(BigDecimal id);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int insert(SmsCouponHistory record);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int insertSelective(SmsCouponHistory record);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    SmsCouponHistory selectByPrimaryKey(BigDecimal id);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int updateByPrimaryKeySelective(SmsCouponHistory record);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int updateByPrimaryKey(SmsCouponHistory record);
}