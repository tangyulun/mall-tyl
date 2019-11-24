package com.springboot.mall.dao;

import com.springboot.mall.model.CmsSubject;

import java.math.BigDecimal;

public interface CmsSubjectMapper {
    /**
     *
     * @mbggenerated 2019-11-23
     */
    int deleteByPrimaryKey(BigDecimal id);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int insert(CmsSubject record);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int insertSelective(CmsSubject record);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    CmsSubject selectByPrimaryKey(BigDecimal id);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int updateByPrimaryKeySelective(CmsSubject record);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int updateByPrimaryKeyWithBLOBs(CmsSubject record);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int updateByPrimaryKey(CmsSubject record);
}