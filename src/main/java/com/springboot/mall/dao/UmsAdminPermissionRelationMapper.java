package com.springboot.mall.dao;

import com.springboot.mall.model.UmsAdminPermissionRelation;

import java.math.BigDecimal;

public interface UmsAdminPermissionRelationMapper {
    /**
     *
     * @mbggenerated 2019-11-23
     */
    int deleteByPrimaryKey(BigDecimal id);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int insert(UmsAdminPermissionRelation record);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int insertSelective(UmsAdminPermissionRelation record);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    UmsAdminPermissionRelation selectByPrimaryKey(BigDecimal id);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int updateByPrimaryKeySelective(UmsAdminPermissionRelation record);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int updateByPrimaryKey(UmsAdminPermissionRelation record);
}