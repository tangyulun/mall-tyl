package com.springboot.mall.dao;

import com.springboot.mall.model.OmsCompanyAddress;

import java.math.BigDecimal;

public interface OmsCompanyAddressMapper {
    /**
     *
     * @mbggenerated 2019-11-23
     */
    int deleteByPrimaryKey(BigDecimal id);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int insert(OmsCompanyAddress record);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int insertSelective(OmsCompanyAddress record);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    OmsCompanyAddress selectByPrimaryKey(BigDecimal id);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int updateByPrimaryKeySelective(OmsCompanyAddress record);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int updateByPrimaryKey(OmsCompanyAddress record);
}