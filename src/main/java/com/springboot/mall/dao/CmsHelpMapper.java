package com.springboot.mall.dao;

import com.springboot.mall.model.CmsHelp;

import java.math.BigDecimal;

public interface CmsHelpMapper {
    /**
     *
     * @mbggenerated 2019-11-23
     */
    int deleteByPrimaryKey(BigDecimal id);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int insert(CmsHelp record);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int insertSelective(CmsHelp record);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    CmsHelp selectByPrimaryKey(BigDecimal id);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int updateByPrimaryKeySelective(CmsHelp record);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int updateByPrimaryKeyWithBLOBs(CmsHelp record);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int updateByPrimaryKey(CmsHelp record);
}