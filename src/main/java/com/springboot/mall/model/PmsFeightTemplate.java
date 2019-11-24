package com.springboot.mall.model;

import java.math.BigDecimal;

public class PmsFeightTemplate {
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
    private BigDecimal chargeType;

    /**
     * null
     */
    private BigDecimal firstWeight;

    /**
     * null
     */
    private BigDecimal firstFee;

    /**
     * null
     */
    private BigDecimal continueWeight;

    /**
     * null
     */
    private BigDecimal continmeFee;

    /**
     * null
     */
    private String dest;

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
     * @return CHARGE_TYPE null
     */
    public BigDecimal getChargeType() {
        return chargeType;
    }

    /**
     * null
     * @param chargeType null
     */
    public void setChargeType(BigDecimal chargeType) {
        this.chargeType = chargeType;
    }

    /**
     * null
     * @return FIRST_WEIGHT null
     */
    public BigDecimal getFirstWeight() {
        return firstWeight;
    }

    /**
     * null
     * @param firstWeight null
     */
    public void setFirstWeight(BigDecimal firstWeight) {
        this.firstWeight = firstWeight;
    }

    /**
     * null
     * @return FIRST_FEE null
     */
    public BigDecimal getFirstFee() {
        return firstFee;
    }

    /**
     * null
     * @param firstFee null
     */
    public void setFirstFee(BigDecimal firstFee) {
        this.firstFee = firstFee;
    }

    /**
     * null
     * @return CONTINUE_WEIGHT null
     */
    public BigDecimal getContinueWeight() {
        return continueWeight;
    }

    /**
     * null
     * @param continueWeight null
     */
    public void setContinueWeight(BigDecimal continueWeight) {
        this.continueWeight = continueWeight;
    }

    /**
     * null
     * @return CONTINME_FEE null
     */
    public BigDecimal getContinmeFee() {
        return continmeFee;
    }

    /**
     * null
     * @param continmeFee null
     */
    public void setContinmeFee(BigDecimal continmeFee) {
        this.continmeFee = continmeFee;
    }

    /**
     * null
     * @return DEST null
     */
    public String getDest() {
        return dest;
    }

    /**
     * null
     * @param dest null
     */
    public void setDest(String dest) {
        this.dest = dest == null ? null : dest.trim();
    }
}