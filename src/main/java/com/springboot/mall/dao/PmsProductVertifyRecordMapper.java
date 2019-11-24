package com.springboot.mall.dao;

import com.springboot.mall.model.PmsProductVertifyRecord;

import java.math.BigDecimal;

public interface PmsProductVertifyRecordMapper {
    /**
     *
     * @mbggenerated 2019-11-23
     */
    int deleteByPrimaryKey(BigDecimal id);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int insert(PmsProductVertifyRecord record);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int insertSelective(PmsProductVertifyRecord record);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    PmsProductVertifyRecord selectByPrimaryKey(BigDecimal id);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int updateByPrimaryKeySelective(PmsProductVertifyRecord record);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int updateByPrimaryKey(PmsProductVertifyRecord record);
}