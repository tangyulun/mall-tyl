package com.springboot.mall.model;

import java.math.BigDecimal;

public class SmsHomeNewProduct {
    /**
     * null
     */
    private BigDecimal id;

    /**
     * null
     */
    private BigDecimal productId;

    /**
     * null
     */
    private String productName;

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
     * @return PRODUCT_ID null
     */
    public BigDecimal getProductId() {
        return productId;
    }

    /**
     * null
     * @param productId null
     */
    public void setProductId(BigDecimal productId) {
        this.productId = productId;
    }

    /**
     * null
     * @return PRODUCT_NAME null
     */
    public String getProductName() {
        return productName;
    }

    /**
     * null
     * @param productName null
     */
    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
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