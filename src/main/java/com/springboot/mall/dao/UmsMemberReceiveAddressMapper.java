package com.springboot.mall.dao;

import com.springboot.mall.model.UmsMemberReceiveAddress;

import java.math.BigDecimal;

public interface UmsMemberReceiveAddressMapper {
    /**
     *
     * @mbggenerated 2019-11-23
     */
    int deleteByPrimaryKey(BigDecimal id);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int insert(UmsMemberReceiveAddress record);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int insertSelective(UmsMemberReceiveAddress record);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    UmsMemberReceiveAddress selectByPrimaryKey(BigDecimal id);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int updateByPrimaryKeySelective(UmsMemberReceiveAddress record);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int updateByPrimaryKey(UmsMemberReceiveAddress record);
}