package com.springboot.mall.dao;

import com.springboot.mall.model.SmsHomeNewProduct;

import java.math.BigDecimal;

public interface SmsHomeNewProductMapper {
    /**
     *
     * @mbggenerated 2019-11-23
     */
    int deleteByPrimaryKey(BigDecimal id);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int insert(SmsHomeNewProduct record);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int insertSelective(SmsHomeNewProduct record);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    SmsHomeNewProduct selectByPrimaryKey(BigDecimal id);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int updateByPrimaryKeySelective(SmsHomeNewProduct record);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int updateByPrimaryKey(SmsHomeNewProduct record);
}