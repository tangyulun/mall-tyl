package com.springboot.mall.dao;

import com.springboot.mall.model.PmsProductLadder;

import java.math.BigDecimal;

public interface PmsProductLadderMapper {
    /**
     *
     * @mbggenerated 2019-11-23
     */
    int deleteByPrimaryKey(BigDecimal id);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int insert(PmsProductLadder record);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int insertSelective(PmsProductLadder record);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    PmsProductLadder selectByPrimaryKey(BigDecimal id);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int updateByPrimaryKeySelective(PmsProductLadder record);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int updateByPrimaryKey(PmsProductLadder record);
}