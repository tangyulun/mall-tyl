package com.springboot.mall.dao;

import com.springboot.mall.model.UmsMemberLevel;

import java.math.BigDecimal;

public interface UmsMemberLevelMapper {
    /**
     *
     * @mbggenerated 2019-11-23
     */
    int deleteByPrimaryKey(BigDecimal id);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int insert(UmsMemberLevel record);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int insertSelective(UmsMemberLevel record);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    UmsMemberLevel selectByPrimaryKey(BigDecimal id);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int updateByPrimaryKeySelective(UmsMemberLevel record);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int updateByPrimaryKey(UmsMemberLevel record);
}