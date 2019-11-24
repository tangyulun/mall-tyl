package com.springboot.mall.dao;

import com.springboot.mall.model.PmsFeightTemplate;

import java.math.BigDecimal;

public interface PmsFeightTemplateMapper {
    /**
     *
     * @mbggenerated 2019-11-23
     */
    int deleteByPrimaryKey(BigDecimal id);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int insert(PmsFeightTemplate record);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int insertSelective(PmsFeightTemplate record);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    PmsFeightTemplate selectByPrimaryKey(BigDecimal id);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int updateByPrimaryKeySelective(PmsFeightTemplate record);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int updateByPrimaryKey(PmsFeightTemplate record);
}