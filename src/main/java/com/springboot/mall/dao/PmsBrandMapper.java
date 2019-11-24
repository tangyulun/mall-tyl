package com.springboot.mall.dao;

import com.springboot.mall.model.PmsBrand;

import java.math.BigDecimal;

public interface PmsBrandMapper {
    /**
     *
     * @mbggenerated 2019-11-23
     */
    int deleteByPrimaryKey(BigDecimal id);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int insert(PmsBrand record);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int insertSelective(PmsBrand record);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    PmsBrand selectByPrimaryKey(BigDecimal id);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int updateByPrimaryKeySelective(PmsBrand record);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int updateByPrimaryKeyWithBLOBs(PmsBrand record);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int updateByPrimaryKey(PmsBrand record);
}