package com.springboot.mall.dao;

import com.springboot.mall.model.PmsProductAttribute;

import java.math.BigDecimal;

public interface PmsProductAttributeMapper {
    /**
     *
     * @mbggenerated 2019-11-23
     */
    int deleteByPrimaryKey(BigDecimal id);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int insert(PmsProductAttribute record);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int insertSelective(PmsProductAttribute record);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    PmsProductAttribute selectByPrimaryKey(BigDecimal id);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int updateByPrimaryKeySelective(PmsProductAttribute record);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int updateByPrimaryKey(PmsProductAttribute record);
}