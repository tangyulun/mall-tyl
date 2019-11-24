package com.springboot.mall.dao;

import com.springboot.mall.model.UmsAdminRoleRelation;

import java.math.BigDecimal;

public interface UmsAdminRoleRelationMapper {
    /**
     *
     * @mbggenerated 2019-11-23
     */
    int deleteByPrimaryKey(BigDecimal id);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int insert(UmsAdminRoleRelation record);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int insertSelective(UmsAdminRoleRelation record);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    UmsAdminRoleRelation selectByPrimaryKey(BigDecimal id);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int updateByPrimaryKeySelective(UmsAdminRoleRelation record);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int updateByPrimaryKey(UmsAdminRoleRelation record);
}