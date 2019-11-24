package com.springboot.mall.dao;

import com.springboot.mall.model.UmsMemberStatisticsInfo;

import java.math.BigDecimal;

public interface UmsMemberStatisticsInfoMapper {
    /**
     *
     * @mbggenerated 2019-11-23
     */
    int deleteByPrimaryKey(BigDecimal id);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int insert(UmsMemberStatisticsInfo record);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int insertSelective(UmsMemberStatisticsInfo record);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    UmsMemberStatisticsInfo selectByPrimaryKey(BigDecimal id);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int updateByPrimaryKeySelective(UmsMemberStatisticsInfo record);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int updateByPrimaryKey(UmsMemberStatisticsInfo record);
}