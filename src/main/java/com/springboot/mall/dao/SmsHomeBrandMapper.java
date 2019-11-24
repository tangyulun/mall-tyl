package com.springboot.mall.dao;

import com.springboot.mall.model.SmsHomeBrand;

import java.math.BigDecimal;

public interface SmsHomeBrandMapper {
    /**
     *
     * @mbggenerated 2019-11-23
     */
    int deleteByPrimaryKey(BigDecimal id);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int insert(SmsHomeBrand record);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int insertSelective(SmsHomeBrand record);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    SmsHomeBrand selectByPrimaryKey(BigDecimal id);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int updateByPrimaryKeySelective(SmsHomeBrand record);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int updateByPrimaryKey(SmsHomeBrand record);
}