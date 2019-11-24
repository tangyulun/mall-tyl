package com.springboot.mall.dao;

import com.springboot.mall.model.OmsOrder;

import java.math.BigDecimal;

public interface OmsOrderMapper {
    /**
     *
     * @mbggenerated 2019-11-23
     */
    int deleteByPrimaryKey(BigDecimal id);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int insert(OmsOrder record);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int insertSelective(OmsOrder record);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    OmsOrder selectByPrimaryKey(BigDecimal id);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int updateByPrimaryKeySelective(OmsOrder record);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int updateByPrimaryKey(OmsOrder record);
}