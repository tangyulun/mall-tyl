package com.springboot.mall.dao;

import com.springboot.mall.model.PmsAlbumPic;

import java.math.BigDecimal;

public interface PmsAlbumPicMapper {
    /**
     *
     * @mbggenerated 2019-11-23
     */
    int deleteByPrimaryKey(BigDecimal id);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int insert(PmsAlbumPic record);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int insertSelective(PmsAlbumPic record);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    PmsAlbumPic selectByPrimaryKey(BigDecimal id);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int updateByPrimaryKeySelective(PmsAlbumPic record);

    /**
     *
     * @mbggenerated 2019-11-23
     */
    int updateByPrimaryKey(PmsAlbumPic record);
}