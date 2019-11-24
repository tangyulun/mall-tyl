package com.springboot.mall.dao;

import com.springboot.mall.model.SmsFlashPromotionSession;

import java.math.BigDecimal;

public interface SmsFlashPromotionSessionMapper {
    /**
     *
     * @mbggenerated 2019-11-23
     */
    int deleteByPrimaryKey(BigDecimal id);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int insert(SmsFlashPromotionSession record);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int insertSelective(SmsFlashPromotionSession record);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    SmsFlashPromotionSession selectByPrimaryKey(BigDecimal id);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int updateByPrimaryKeySelective(SmsFlashPromotionSession record);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int updateByPrimaryKey(SmsFlashPromotionSession record);
}