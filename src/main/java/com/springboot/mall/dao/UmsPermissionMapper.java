package com.springboot.mall.dao;

import com.springboot.mall.model.UmsPermission;

import java.math.BigDecimal;

public interface UmsPermissionMapper {
    /**
     *
     * @mbggenerated 2019-11-23
     */
    int deleteByPrimaryKey(BigDecimal id);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int insert(UmsPermission record);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int insertSelective(UmsPermission record);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    UmsPermission selectByPrimaryKey(BigDecimal id);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int updateByPrimaryKeySelective(UmsPermission record);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int updateByPrimaryKey(UmsPermission record);
}