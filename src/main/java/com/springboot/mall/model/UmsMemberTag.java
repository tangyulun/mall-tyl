package com.springboot.mall.model;

import java.math.BigDecimal;

public class UmsMemberTag {
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
    private BigDecimal finishOrderCount;

    /**
     * null
     */
    private BigDecimal finishOrderAmount;

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
     * @return FINISH_ORDER_COUNT null
     */
    public BigDecimal getFinishOrderCount() {
        return finishOrderCount;
    }

    /**
     * null
     * @param finishOrderCount null
     */
    public void setFinishOrderCount(BigDecimal finishOrderCount) {
        this.finishOrderCount = finishOrderCount;
    }

    /**
     * null
     * @return FINISH_ORDER_AMOUNT null
     */
    public BigDecimal getFinishOrderAmount() {
        return finishOrderAmount;
    }

    /**
     * null
     * @param finishOrderAmount null
     */
    public void setFinishOrderAmount(BigDecimal finishOrderAmount) {
        this.finishOrderAmount = finishOrderAmount;
    }
}