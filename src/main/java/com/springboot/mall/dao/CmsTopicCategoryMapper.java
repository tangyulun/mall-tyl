package com.springboot.mall.dao;

import com.springboot.mall.model.CmsTopicCategory;

import java.math.BigDecimal;

public interface CmsTopicCategoryMapper {
    /**
     *
     * @mbggenerated 2019-11-23
     */
    int deleteByPrimaryKey(BigDecimal id);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int insert(CmsTopicCategory record);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int insertSelective(CmsTopicCategory record);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    CmsTopicCategory selectByPrimaryKey(BigDecimal id);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int updateByPrimaryKeySelective(CmsTopicCategory record);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int updateByPrimaryKey(CmsTopicCategory record);
}