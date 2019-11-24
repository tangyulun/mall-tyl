package com.springboot.mall.model;

import java.math.BigDecimal;

public class PmsMemberPrice {
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
    private BigDecimal memberLevelId;

    /**
     * null
     */
    private BigDecimal memberPrice;

    /**
     * null
     */
    private String memberLevelName;

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
     * @return MEMBER_LEVEL_ID null
     */
    public BigDecimal getMemberLevelId() {
        return memberLevelId;
    }

    /**
     * null
     * @param memberLevelId null
     */
    public void setMemberLevelId(BigDecimal memberLevelId) {
        this.memberLevelId = memberLevelId;
    }

    /**
     * null
     * @return MEMBER_PRICE null
     */
    public BigDecimal getMemberPrice() {
        return memberPrice;
    }

    /**
     * null
     * @param memberPrice null
     */
    public void setMemberPrice(BigDecimal memberPrice) {
        this.memberPrice = memberPrice;
    }

    /**
     * null
     * @return MEMBER_LEVEL_NAME null
     */
    public String getMemberLevelName() {
        return memberLevelName;
    }

    /**
     * null
     * @param memberLevelName null
     */
    public void setMemberLevelName(String memberLevelName) {
        this.memberLevelName = memberLevelName == null ? null : memberLevelName.trim();
    }
}