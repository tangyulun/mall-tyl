package com.springboot.mall.dao;

import com.springboot.mall.model.UmsRole;

import java.math.BigDecimal;

public interface UmsRoleMapper {
    /**
     *
     * @mbggenerated 2019-11-23
     */
    int deleteByPrimaryKey(BigDecimal id);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int insert(UmsRole record);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int insertSelective(UmsRole record);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    UmsRole selectByPrimaryKey(BigDecimal id);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int updateByPrimaryKeySelective(UmsRole record);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int updateByPrimaryKey(UmsRole record);
}