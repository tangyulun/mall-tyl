package com.springboot.mall.dao;

import com.springboot.mall.model.PmsMemberPrice;

import java.math.BigDecimal;

public interface PmsMemberPriceMapper {
    /**
     *
     * @mbggenerated 2019-11-23
     */
    int deleteByPrimaryKey(BigDecimal id);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int insert(PmsMemberPrice record);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int insertSelective(PmsMemberPrice record);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    PmsMemberPrice selectByPrimaryKey(BigDecimal id);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int updateByPrimaryKeySelective(PmsMemberPrice record);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int updateByPrimaryKey(PmsMemberPrice record);
}