package com.springboot.mall.dao;

import com.springboot.mall.model.SmsFlashPromotion;

import java.math.BigDecimal;

public interface SmsFlashPromotionMapper {
    /**
     *
     * @mbggenerated 2019-11-23
     */
    int deleteByPrimaryKey(BigDecimal id);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int insert(SmsFlashPromotion record);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int insertSelective(SmsFlashPromotion record);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    SmsFlashPromotion selectByPrimaryKey(BigDecimal id);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int updateByPrimaryKeySelective(SmsFlashPromotion record);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int updateByPrimaryKey(SmsFlashPromotion record);
}