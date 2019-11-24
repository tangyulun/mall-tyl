package com.springboot.mall.dao;

import com.springboot.mall.model.UmsMemberMemberTagRelation;

import java.math.BigDecimal;

public interface UmsMemberMemberTagRelationMapper {
    /**
     *
     * @mbggenerated 2019-11-23
     */
    int deleteByPrimaryKey(BigDecimal id);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int insert(UmsMemberMemberTagRelation record);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int insertSelective(UmsMemberMemberTagRelation record);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    UmsMemberMemberTagRelation selectByPrimaryKey(BigDecimal id);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int updateByPrimaryKeySelective(UmsMemberMemberTagRelation record);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int updateByPrimaryKey(UmsMemberMemberTagRelation record);
}