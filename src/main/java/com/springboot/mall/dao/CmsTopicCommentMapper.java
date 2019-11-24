package com.springboot.mall.dao;

import com.springboot.mall.model.CmsTopicComment;

import java.math.BigDecimal;

public interface CmsTopicCommentMapper {
    /**
     *
     * @mbggenerated 2019-11-23
     */
    int deleteByPrimaryKey(BigDecimal id);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int insert(CmsTopicComment record);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int insertSelective(CmsTopicComment record);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    CmsTopicComment selectByPrimaryKey(BigDecimal id);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int updateByPrimaryKeySelective(CmsTopicComment record);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int updateByPrimaryKey(CmsTopicComment record);
}