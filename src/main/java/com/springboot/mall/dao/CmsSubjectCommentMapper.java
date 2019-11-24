package com.springboot.mall.dao;

import com.springboot.mall.model.CmsSubjectComment;

import java.math.BigDecimal;

public interface CmsSubjectCommentMapper {
    /**
     *
     * @mbggenerated 2019-11-23
     */
    int deleteByPrimaryKey(BigDecimal id);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int insert(CmsSubjectComment record);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int insertSelective(CmsSubjectComment record);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    CmsSubjectComment selectByPrimaryKey(BigDecimal id);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int updateByPrimaryKeySelective(CmsSubjectComment record);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int updateByPrimaryKey(CmsSubjectComment record);
}