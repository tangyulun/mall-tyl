package com.springboot.mall.dao;

import com.springboot.mall.model.PmsComment;

import java.math.BigDecimal;

public interface PmsCommentMapper {
    /**
     *
     * @mbggenerated 2019-11-23
     */
    int deleteByPrimaryKey(BigDecimal id);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int insert(PmsComment record);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int insertSelective(PmsComment record);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    PmsComment selectByPrimaryKey(BigDecimal id);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int updateByPrimaryKeySelective(PmsComment record);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int updateByPrimaryKeyWithBLOBs(PmsComment record);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int updateByPrimaryKey(PmsComment record);
}