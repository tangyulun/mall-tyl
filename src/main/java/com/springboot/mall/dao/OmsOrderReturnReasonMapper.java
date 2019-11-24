package com.springboot.mall.dao;

import com.springboot.mall.model.OmsOrderReturnReason;

import java.math.BigDecimal;

public interface OmsOrderReturnReasonMapper {
    /**
     *
     * @mbggenerated 2019-11-23
     */
    int deleteByPrimaryKey(BigDecimal id);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int insert(OmsOrderReturnReason record);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int insertSelective(OmsOrderReturnReason record);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    OmsOrderReturnReason selectByPrimaryKey(BigDecimal id);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int updateByPrimaryKeySelective(OmsOrderReturnReason record);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int updateByPrimaryKey(OmsOrderReturnReason record);
}