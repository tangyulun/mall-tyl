package com.springboot.mall.model;

import java.math.BigDecimal;

public class SmsCouponProductCategor0000 {
    /**
     * null
     */
    private BigDecimal id;

    /**
     * null
     */
    private BigDecimal couponId;

    /**
     * null
     */
    private BigDecimal productCategoryId;

    /**
     * null
     */
    private String productCategoryName;

    /**
     * null
     */
    private String parentCategoryName;

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
     * @return COUPON_ID null
     */
    public BigDecimal getCouponId() {
        return couponId;
    }

    /**
     * null
     * @param couponId null
     */
    public void setCouponId(BigDecimal couponId) {
        this.couponId = couponId;
    }

    /**
     * null
     * @return PRODUCT_CATEGORY_ID null
     */
    public BigDecimal getProductCategoryId() {
        return productCategoryId;
    }

    /**
     * null
     * @param productCategoryId null
     */
    public void setProductCategoryId(BigDecimal productCategoryId) {
        this.productCategoryId = productCategoryId;
    }

    /**
     * null
     * @return PRODUCT_CATEGORY_NAME null
     */
    public String getProductCategoryName() {
        return productCategoryName;
    }

    /**
     * null
     * @param productCategoryName null
     */
    public void setProductCategoryName(String productCategoryName) {
        this.productCategoryName = productCategoryName == null ? null : productCategoryName.trim();
    }

    /**
     * null
     * @return PARENT_CATEGORY_NAME null
     */
    public String getParentCategoryName() {
        return parentCategoryName;
    }

    /**
     * null
     * @param parentCategoryName null
     */
    public void setParentCategoryName(String parentCategoryName) {
        this.parentCategoryName = parentCategoryName == null ? null : parentCategoryName.trim();
    }
}