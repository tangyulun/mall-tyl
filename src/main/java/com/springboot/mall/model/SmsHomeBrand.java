package com.springboot.mall.model;

import java.math.BigDecimal;

public class SmsHomeBrand {
    /**
     * null
     */
    private BigDecimal id;

    /**
     * null
     */
    private BigDecimal brandId;

    /**
     * null
     */
    private String brandName;

    /**
     * null
     */
    private BigDecimal recommendStatus;

    /**
     * null
     */
    private BigDecimal sort;

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
     * @return BRAND_ID null
     */
    public BigDecimal getBrandId() {
        return brandId;
    }

    /**
     * null
     * @param brandId null
     */
    public void setBrandId(BigDecimal brandId) {
        this.brandId = brandId;
    }

    /**
     * null
     * @return BRAND_NAME null
     */
    public String getBrandName() {
        return brandName;
    }

    /**
     * null
     * @param brandName null
     */
    public void setBrandName(String brandName) {
        this.brandName = brandName == null ? null : brandName.trim();
    }

    /**
     * null
     * @return RECOMMEND_STATUS null
     */
    public BigDecimal getRecommendStatus() {
        return recommendStatus;
    }

    /**
     * null
     * @param recommendStatus null
     */
    public void setRecommendStatus(BigDecimal recommendStatus) {
        this.recommendStatus = recommendStatus;
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
}