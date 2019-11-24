package com.springboot.mall.dao;

import com.springboot.mall.model.SmsHomeRecommendSubject;

import java.math.BigDecimal;

public interface SmsHomeRecommendSubjectMapper {
    /**
     *
     * @mbggenerated 2019-11-23
     */
    int deleteByPrimaryKey(BigDecimal id);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int insert(SmsHomeRecommendSubject record);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int insertSelective(SmsHomeRecommendSubject record);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    SmsHomeRecommendSubject selectByPrimaryKey(BigDecimal id);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int updateByPrimaryKeySelective(SmsHomeRecommendSubject record);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int updateByPrimaryKey(SmsHomeRecommendSubject record);
}