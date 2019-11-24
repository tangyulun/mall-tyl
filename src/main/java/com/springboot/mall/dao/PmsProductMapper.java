package com.springboot.mall.dao;

import com.springboot.mall.model.PmsProduct;
import com.springboot.mall.model.PmsProductWithBLOBs;

import java.math.BigDecimal;

public interface PmsProductMapper {
    /**
     *
     * @mbggenerated 2019-11-23
     */
    int deleteByPrimaryKey(BigDecimal id);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int insert(PmsProductWithBLOBs record);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int insertSelective(PmsProductWithBLOBs record);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    PmsProductWithBLOBs selectByPrimaryKey(BigDecimal id);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int updateByPrimaryKeySelective(PmsProductWithBLOBs record);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int updateByPrimaryKeyWithBLOBs(PmsProductWithBLOBs record);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int updateByPrimaryKey(PmsProduct record);
}