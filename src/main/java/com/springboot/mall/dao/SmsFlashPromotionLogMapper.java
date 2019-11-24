package com.springboot.mall.dao;

import com.springboot.mall.model.SmsFlashPromotionLog;

import java.math.BigDecimal;

public interface SmsFlashPromotionLogMapper {
    /**
     *
     * @mbggenerated 2019-11-23
     */
    int deleteByPrimaryKey(BigDecimal id);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int insert(SmsFlashPromotionLog record);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int insertSelective(SmsFlashPromotionLog record);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    SmsFlashPromotionLog selectByPrimaryKey(BigDecimal id);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int updateByPrimaryKeySelective(SmsFlashPromotionLog record);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int updateByPrimaryKey(SmsFlashPromotionLog record);
}