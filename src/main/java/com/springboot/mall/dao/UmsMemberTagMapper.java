package com.springboot.mall.dao;

import com.springboot.mall.model.UmsMemberTag;

import java.math.BigDecimal;

public interface UmsMemberTagMapper {
    /**
     *
     * @mbggenerated 2019-11-23
     */
    int deleteByPrimaryKey(BigDecimal id);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int insert(UmsMemberTag record);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int insertSelective(UmsMemberTag record);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    UmsMemberTag selectByPrimaryKey(BigDecimal id);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int updateByPrimaryKeySelective(UmsMemberTag record);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int updateByPrimaryKey(UmsMemberTag record);
}