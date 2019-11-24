package com.springboot.mall.dao;

import com.springboot.mall.model.PmsAlbum;

import java.math.BigDecimal;

public interface PmsAlbumMapper {
    /**
     *
     * @mbggenerated 2019-11-23
     */
    int deleteByPrimaryKey(BigDecimal id);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int insert(PmsAlbum record);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int insertSelective(PmsAlbum record);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    PmsAlbum selectByPrimaryKey(BigDecimal id);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int updateByPrimaryKeySelective(PmsAlbum record);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int updateByPrimaryKey(PmsAlbum record);
}