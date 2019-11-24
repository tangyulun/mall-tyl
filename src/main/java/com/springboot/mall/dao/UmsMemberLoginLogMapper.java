package com.springboot.mall.dao;

import com.springboot.mall.model.UmsMemberLoginLog;

import java.math.BigDecimal;

public interface UmsMemberLoginLogMapper {
    /**
     *
     * @mbggenerated 2019-11-23
     */
    int deleteByPrimaryKey(BigDecimal id);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int insert(UmsMemberLoginLog record);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int insertSelective(UmsMemberLoginLog record);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    UmsMemberLoginLog selectByPrimaryKey(BigDecimal id);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int updateByPrimaryKeySelective(UmsMemberLoginLog record);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int updateByPrimaryKey(UmsMemberLoginLog record);
}