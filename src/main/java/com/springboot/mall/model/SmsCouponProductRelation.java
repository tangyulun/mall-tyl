package com.springboot.mall.model;

import java.math.BigDecimal;

public class SmsCouponProductRelation {
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
    private BigDecimal productId;

    /**
     * null
     */
    private String productName;

    /**
     * null
     */
    private String productSn;

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
     * @return PRODUCT_SN null
     */
    public String getProductSn() {
        return productSn;
    }

    /**
     * null
     * @param productSn null
     */
    public void setProductSn(String productSn) {
        this.productSn = productSn == null ? null : productSn.trim();
    }
}