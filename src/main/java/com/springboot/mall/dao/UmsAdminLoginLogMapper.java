package com.springboot.mall.dao;

import com.springboot.mall.model.UmsAdminLoginLog;

import java.math.BigDecimal;

public interface UmsAdminLoginLogMapper {
    /**
     *
     * @mbggenerated 2019-11-23
     */
    int deleteByPrimaryKey(BigDecimal id);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int insert(UmsAdminLoginLog record);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int insertSelective(UmsAdminLoginLog record);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    UmsAdminLoginLog selectByPrimaryKey(BigDecimal id);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int updateByPrimaryKeySelective(UmsAdminLoginLog record);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int updateByPrimaryKey(UmsAdminLoginLog record);
}