package com.springboot.mall.model;

import java.math.BigDecimal;

public class PmsProductAttributeCategory {
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
    private BigDecimal attributeCount;

    /**
     * null
     */
    private BigDecimal paramCount;

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
     * @return ATTRIBUTE_COUNT null
     */
    public BigDecimal getAttributeCount() {
        return attributeCount;
    }

    /**
     * null
     * @param attributeCount null
     */
    public void setAttributeCount(BigDecimal attributeCount) {
        this.attributeCount = attributeCount;
    }

    /**
     * null
     * @return PARAM_COUNT null
     */
    public BigDecimal getParamCount() {
        return paramCount;
    }

    /**
     * null
     * @param paramCount null
     */
    public void setParamCount(BigDecimal paramCount) {
        this.paramCount = paramCount;
    }
}