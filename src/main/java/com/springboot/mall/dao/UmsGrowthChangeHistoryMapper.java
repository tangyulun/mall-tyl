package com.springboot.mall.dao;

import com.springboot.mall.model.UmsGrowthChangeHistory;

import java.math.BigDecimal;

public interface UmsGrowthChangeHistoryMapper {
    /**
     *
     * @mbggenerated 2019-11-23
     */
    int deleteByPrimaryKey(BigDecimal id);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int insert(UmsGrowthChangeHistory record);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int insertSelective(UmsGrowthChangeHistory record);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    UmsGrowthChangeHistory selectByPrimaryKey(BigDecimal id);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int updateByPrimaryKeySelective(UmsGrowthChangeHistory record);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int updateByPrimaryKey(UmsGrowthChangeHistory record);
}