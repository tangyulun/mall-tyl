package com.springboot.mall.model;

import java.math.BigDecimal;

public class PmsAlbum {
    /**
     * null
     */
    private BigDecimal id;

    /**
     * null
     */
    private String name;

    /**
     * null
     */
    private String coverPic;

    /**
     * null
     */
    private BigDecimal picCount;

    /**
     * null
     */
    private BigDecimal sort;

    /**
     * null
     */
    private String description;

    /**
     * null
     * @return ID null
     */
    public BigDecimal getId() {
        return id;
    }

    /**
     * null
     * @param id null
     */
    public void setId(BigDecimal id) {
        this.id = id;
    }

    /**
     * null
     * @return NAME null
     */
    public String getName() {
        return name;
    }

    /**
     * null
     * @param name null
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * null
     * @return COVER_PIC null
     */
    public String getCoverPic() {
        return coverPic;
    }

    /**
     * null
     * @param coverPic null
     */
    public void setCoverPic(String coverPic) {
        this.coverPic = coverPic == null ? null : coverPic.trim();
    }

    /**
     * null
     * @return PIC_COUNT null
     */
    public BigDecimal getPicCount() {
        return picCount;
    }

    /**
     * null
     * @param picCount null
     */
    public void setPicCount(BigDecimal picCount) {
        this.picCount = picCount;
    }

    /**
     * null
     * @return SORT null
     */
    public BigDecimal getSort() {
        return sort;
    }

    /**
     * null
     * @param sort null
     */
    public void setSort(BigDecimal sort) {
        this.sort = sort;
    }

    /**
     * null
     * @return DESCRIPTION null
     */
    public String getDescription() {
        return description;
    }

    /**
     * null
     * @param description null
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}