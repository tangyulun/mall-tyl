package com.springboot.mall.dao;

import com.springboot.mall.model.UmsIntegrationChangeHistory;

import java.math.BigDecimal;

public interface UmsIntegrationChangeHistoryMapper {
    /**
     *
     * @mbggenerated 2019-11-23
     */
    int deleteByPrimaryKey(BigDecimal id);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int insert(UmsIntegrationChangeHistory record);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int insertSelective(UmsIntegrationChangeHistory record);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    UmsIntegrationChangeHistory selectByPrimaryKey(BigDecimal id);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int updateByPrimaryKeySelective(UmsIntegrationChangeHistory record);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int updateByPrimaryKey(UmsIntegrationChangeHistory record);
}