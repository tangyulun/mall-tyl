package com.springboot.mall.dao;

import com.springboot.mall.model.SmsHomeAdvertise;

import java.math.BigDecimal;

public interface SmsHomeAdvertiseMapper {
    /**
     *
     * @mbggenerated 2019-11-23
     */
    int deleteByPrimaryKey(BigDecimal id);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int insert(SmsHomeAdvertise record);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int insertSelective(SmsHomeAdvertise record);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    SmsHomeAdvertise selectByPrimaryKey(BigDecimal id);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int updateByPrimaryKeySelective(SmsHomeAdvertise record);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int updateByPrimaryKey(SmsHomeAdvertise record);
}