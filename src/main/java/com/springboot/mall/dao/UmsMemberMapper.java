package com.springboot.mall.dao;

import com.springboot.mall.model.UmsMember;

import java.math.BigDecimal;

public interface UmsMemberMapper {
    /**
     *
     * @mbggenerated 2019-11-23
     */
    int deleteByPrimaryKey(BigDecimal id);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int insert(UmsMember record);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int insertSelective(UmsMember record);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    UmsMember selectByPrimaryKey(BigDecimal id);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int updateByPrimaryKeySelective(UmsMember record);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int updateByPrimaryKey(UmsMember record);
}