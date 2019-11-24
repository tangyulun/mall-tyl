package com.springboot.mall.dao;

import com.springboot.mall.model.OmsOrderSetting;

import java.math.BigDecimal;

public interface OmsOrderSettingMapper {
    /**
     *
     * @mbggenerated 2019-11-23
     */
    int deleteByPrimaryKey(BigDecimal id);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int insert(OmsOrderSetting record);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int insertSelective(OmsOrderSetting record);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    OmsOrderSetting selectByPrimaryKey(BigDecimal id);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int updateByPrimaryKeySelective(OmsOrderSetting record);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int updateByPrimaryKey(OmsOrderSetting record);
}