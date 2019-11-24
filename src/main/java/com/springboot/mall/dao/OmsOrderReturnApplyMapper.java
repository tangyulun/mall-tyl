package com.springboot.mall.dao;

import com.springboot.mall.model.OmsOrderReturnApply;

import java.math.BigDecimal;

public interface OmsOrderReturnApplyMapper {
    /**
     *
     * @mbggenerated 2019-11-23
     */
    int deleteByPrimaryKey(BigDecimal id);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int insert(OmsOrderReturnApply record);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int insertSelective(OmsOrderReturnApply record);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    OmsOrderReturnApply selectByPrimaryKey(BigDecimal id);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int updateByPrimaryKeySelective(OmsOrderReturnApply record);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int updateByPrimaryKey(OmsOrderReturnApply record);
}