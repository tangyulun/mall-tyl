package com.springboot.mall.dao;

import com.springboot.mall.model.CmsHelpCategory;

import java.math.BigDecimal;

public interface CmsHelpCategoryMapper {
    /**
     *
     * @mbggenerated 2019-11-23
     */
    int deleteByPrimaryKey(BigDecimal id);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int insert(CmsHelpCategory record);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int insertSelective(CmsHelpCategory record);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    CmsHelpCategory selectByPrimaryKey(BigDecimal id);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int updateByPrimaryKeySelective(CmsHelpCategory record);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int updateByPrimaryKey(CmsHelpCategory record);
}