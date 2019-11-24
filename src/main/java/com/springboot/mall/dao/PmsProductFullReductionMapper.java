package com.springboot.mall.dao;

import com.springboot.mall.model.PmsProductFullReduction;

import java.math.BigDecimal;

public interface PmsProductFullReductionMapper {
    /**
     *
     * @mbggenerated 2019-11-23
     */
    int deleteByPrimaryKey(BigDecimal id);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int insert(PmsProductFullReduction record);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int insertSelective(PmsProductFullReduction record);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    PmsProductFullReduction selectByPrimaryKey(BigDecimal id);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int updateByPrimaryKeySelective(PmsProductFullReduction record);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int updateByPrimaryKey(PmsProductFullReduction record);
}