package com.springboot.mall.dao;

import com.springboot.mall.model.UmsMemberTask;

import java.math.BigDecimal;

public interface UmsMemberTaskMapper {
    /**
     *
     * @mbggenerated 2019-11-23
     */
    int deleteByPrimaryKey(BigDecimal id);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int insert(UmsMemberTask record);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int insertSelective(UmsMemberTask record);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    UmsMemberTask selectByPrimaryKey(BigDecimal id);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int updateByPrimaryKeySelective(UmsMemberTask record);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int updateByPrimaryKey(UmsMemberTask record);
}