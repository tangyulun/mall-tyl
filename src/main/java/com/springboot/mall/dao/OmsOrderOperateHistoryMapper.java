package com.springboot.mall.dao;

import com.springboot.mall.model.OmsOrderOperateHistory;

import java.math.BigDecimal;

public interface OmsOrderOperateHistoryMapper {
    /**
     *
     * @mbggenerated 2019-11-23
     */
    int deleteByPrimaryKey(BigDecimal id);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int insert(OmsOrderOperateHistory record);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int insertSelective(OmsOrderOperateHistory record);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    OmsOrderOperateHistory selectByPrimaryKey(BigDecimal id);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int updateByPrimaryKeySelective(OmsOrderOperateHistory record);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int updateByPrimaryKey(OmsOrderOperateHistory record);
}