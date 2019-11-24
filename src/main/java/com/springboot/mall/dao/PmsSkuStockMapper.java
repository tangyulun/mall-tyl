package com.springboot.mall.dao;

import com.springboot.mall.model.PmsSkuStock;

import java.math.BigDecimal;

public interface PmsSkuStockMapper {
    /**
     *
     * @mbggenerated 2019-11-23
     */
    int deleteByPrimaryKey(BigDecimal id);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int insert(PmsSkuStock record);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int insertSelective(PmsSkuStock record);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    PmsSkuStock selectByPrimaryKey(BigDecimal id);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int updateByPrimaryKeySelective(PmsSkuStock record);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int updateByPrimaryKey(PmsSkuStock record);
}