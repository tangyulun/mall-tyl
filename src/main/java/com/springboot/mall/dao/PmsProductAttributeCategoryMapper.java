package com.springboot.mall.dao;

import com.springboot.mall.model.PmsProductAttributeCategory;

import java.math.BigDecimal;

public interface PmsProductAttributeCategoryMapper {
    /**
     *
     * @mbggenerated 2019-11-23
     */
    int deleteByPrimaryKey(BigDecimal id);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int insert(PmsProductAttributeCategory record);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int insertSelective(PmsProductAttributeCategory record);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    PmsProductAttributeCategory selectByPrimaryKey(BigDecimal id);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int updateByPrimaryKeySelective(PmsProductAttributeCategory record);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int updateByPrimaryKey(PmsProductAttributeCategory record);
}