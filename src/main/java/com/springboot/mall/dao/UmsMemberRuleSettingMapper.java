package com.springboot.mall.dao;

import com.springboot.mall.model.UmsMemberRuleSetting;

import java.math.BigDecimal;

public interface UmsMemberRuleSettingMapper {
    /**
     *
     * @mbggenerated 2019-11-23
     */
    int deleteByPrimaryKey(BigDecimal id);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int insert(UmsMemberRuleSetting record);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int insertSelective(UmsMemberRuleSetting record);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    UmsMemberRuleSetting selectByPrimaryKey(BigDecimal id);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int updateByPrimaryKeySelective(UmsMemberRuleSetting record);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int updateByPrimaryKey(UmsMemberRuleSetting record);
}