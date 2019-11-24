package com.springboot.mall.dao;

import com.springboot.mall.model.CmsSubjectCategory;

import java.math.BigDecimal;

public interface CmsSubjectCategoryMapper {
    /**
     *
     * @mbggenerated 2019-11-23
     */
    int deleteByPrimaryKey(BigDecimal id);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int insert(CmsSubjectCategory record);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int insertSelective(CmsSubjectCategory record);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    CmsSubjectCategory selectByPrimaryKey(BigDecimal id);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int updateByPrimaryKeySelective(CmsSubjectCategory record);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int updateByPrimaryKey(CmsSubjectCategory record);
}