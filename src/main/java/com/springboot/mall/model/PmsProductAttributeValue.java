package com.springboot.mall.model;

import java.math.BigDecimal;

public class PmsProductAttributeValue {
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
    private BigDecimal productAttributeId;

    /**
     * null
     */
    private String value;

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
     * @return PRODUCT_ATTRIBUTE_ID null
     */
    public BigDecimal getProductAttributeId() {
        return productAttributeId;
    }

    /**
     * null
     * @param productAttributeId null
     */
    public void setProductAttributeId(BigDecimal productAttributeId) {
        this.productAttributeId = productAttributeId;
    }

    /**
     * null
     * @return VALUE null
     */
    public String getValue() {
        return value;
    }

    /**
     * null
     * @param value null
     */
    public void setValue(String value) {
        this.value = value == null ? null : value.trim();
    }
}