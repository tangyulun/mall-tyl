package com.springboot.mall.dao;

import com.springboot.mall.model.SmsHomeRecommendProduct;

import java.math.BigDecimal;

public interface SmsHomeRecommendProductMapper {
    /**
     *
     * @mbggenerated 2019-11-23
     */
    int deleteByPrimaryKey(BigDecimal id);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int insert(SmsHomeRecommendProduct record);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int insertSelective(SmsHomeRecommendProduct record);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    SmsHomeRecommendProduct selectByPrimaryKey(BigDecimal id);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int updateByPrimaryKeySelective(SmsHomeRecommendProduct record);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int updateByPrimaryKey(SmsHomeRecommendProduct record);
}