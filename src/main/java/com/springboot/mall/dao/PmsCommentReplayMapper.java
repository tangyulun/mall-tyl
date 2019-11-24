package com.springboot.mall.dao;

import com.springboot.mall.model.PmsCommentReplay;

import java.math.BigDecimal;

public interface PmsCommentReplayMapper {
    /**
     *
     * @mbggenerated 2019-11-23
     */
    int deleteByPrimaryKey(BigDecimal id);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int insert(PmsCommentReplay record);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int insertSelective(PmsCommentReplay record);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    PmsCommentReplay selectByPrimaryKey(BigDecimal id);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int updateByPrimaryKeySelective(PmsCommentReplay record);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int updateByPrimaryKey(PmsCommentReplay record);
}