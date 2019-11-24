package com.springboot.mall.dao;

import com.springboot.mall.model.PmsProductAttributeValue;

import java.math.BigDecimal;

public interface PmsProductAttributeValueMapper {
    /**
     *
     * @mbggenerated 2019-11-23
     */
    int deleteByPrimaryKey(BigDecimal id);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int insert(PmsProductAttributeValue record);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int insertSelective(PmsProductAttributeValue record);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    PmsProductAttributeValue selectByPrimaryKey(BigDecimal id);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int updateByPrimaryKeySelective(PmsProductAttributeValue record);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int updateByPrimaryKey(PmsProductAttributeValue record);
}