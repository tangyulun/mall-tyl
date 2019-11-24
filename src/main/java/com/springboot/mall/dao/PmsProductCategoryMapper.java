package com.springboot.mall.dao;

import com.springboot.mall.model.PmsProductCategory;

import java.math.BigDecimal;

public interface PmsProductCategoryMapper {
    /**
     *
     * @mbggenerated 2019-11-23
     */
    int deleteByPrimaryKey(BigDecimal id);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int insert(PmsProductCategory record);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int insertSelective(PmsProductCategory record);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    PmsProductCategory selectByPrimaryKey(BigDecimal id);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int updateByPrimaryKeySelective(PmsProductCategory record);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int updateByPrimaryKeyWithBLOBs(PmsProductCategory record);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int updateByPrimaryKey(PmsProductCategory record);
}