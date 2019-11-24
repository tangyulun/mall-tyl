package com.springboot.mall.model;

import java.math.BigDecimal;

public class UmsMemberTask {
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
    private BigDecimal growth;

    /**
     * null
     */
    private BigDecimal intergration;

    /**
     * null
     */
    private BigDecimal type;

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
     * @return GROWTH null
     */
    public BigDecimal getGrowth() {
        return growth;
    }

    /**
     * null
     * @param growth null
     */
    public void setGrowth(BigDecimal growth) {
        this.growth = growth;
    }

    /**
     * null
     * @return INTERGRATION null
     */
    public BigDecimal getIntergration() {
        return intergration;
    }

    /**
     * null
     * @param intergration null
     */
    public void setIntergration(BigDecimal intergration) {
        this.intergration = intergration;
    }

    /**
     * null
     * @return TYPE null
     */
    public BigDecimal getType() {
        return type;
    }

    /**
     * null
     * @param type null
     */
    public void setType(BigDecimal type) {
        this.type = type;
    }
}