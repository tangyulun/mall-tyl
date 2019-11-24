package com.springboot.mall.dao;

import com.springboot.mall.model.CmsTopic;

import java.math.BigDecimal;

public interface CmsTopicMapper {
    /**
     *
     * @mbggenerated 2019-11-23
     */
    int deleteByPrimaryKey(BigDecimal id);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int insert(CmsTopic record);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int insertSelective(CmsTopic record);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    CmsTopic selectByPrimaryKey(BigDecimal id);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int updateByPrimaryKeySelective(CmsTopic record);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int updateByPrimaryKeyWithBLOBs(CmsTopic record);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int updateByPrimaryKey(CmsTopic record);
}