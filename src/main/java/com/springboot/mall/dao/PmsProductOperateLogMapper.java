package com.springboot.mall.dao;

import com.springboot.mall.model.PmsProductOperateLog;

import java.math.BigDecimal;

public interface PmsProductOperateLogMapper {
    /**
     *
     * @mbggenerated 2019-11-23
     */
    int deleteByPrimaryKey(BigDecimal id);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int insert(PmsProductOperateLog record);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int insertSelective(PmsProductOperateLog record);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    PmsProductOperateLog selectByPrimaryKey(BigDecimal id);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int updateByPrimaryKeySelective(PmsProductOperateLog record);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int updateByPrimaryKey(PmsProductOperateLog record);
}