package com.springboot.mall.model;

import java.math.BigDecimal;
import java.util.Date;

public class PmsProductOperateLog {
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
    private BigDecimal priceOld;

    /**
     * null
     */
    private BigDecimal priceNew;

    /**
     * null
     */
    private BigDecimal salePriceOld;

    /**
     * null
     */
    private BigDecimal salePriceNew;

    /**
     * null
     */
    private BigDecimal giftPointOld;

    /**
     * null
     */
    private BigDecimal giftPointNew;

    /**
     * null
     */
    private BigDecimal usePointLimitOld;

    /**
     * null
     */
    private BigDecimal usePointLimitNew;

    /**
     * null
     */
    private String operateMan;

    /**
     * null
     */
    private Date createTime;

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
     * @return PRICE_OLD null
     */
    public BigDecimal getPriceOld() {
        return priceOld;
    }

    /**
     * null
     * @param priceOld null
     */
    public void setPriceOld(BigDecimal priceOld) {
        this.priceOld = priceOld;
    }

    /**
     * null
     * @return PRICE_NEW null
     */
    public BigDecimal getPriceNew() {
        return priceNew;
    }

    /**
     * null
     * @param priceNew null
     */
    public void setPriceNew(BigDecimal priceNew) {
        this.priceNew = priceNew;
    }

    /**
     * null
     * @return SALE_PRICE_OLD null
     */
    public BigDecimal getSalePriceOld() {
        return salePriceOld;
    }

    /**
     * null
     * @param salePriceOld null
     */
    public void setSalePriceOld(BigDecimal salePriceOld) {
        this.salePriceOld = salePriceOld;
    }

    /**
     * null
     * @return SALE_PRICE_NEW null
     */
    public BigDecimal getSalePriceNew() {
        return salePriceNew;
    }

    /**
     * null
     * @param salePriceNew null
     */
    public void setSalePriceNew(BigDecimal salePriceNew) {
        this.salePriceNew = salePriceNew;
    }

    /**
     * null
     * @return GIFT_POINT_OLD null
     */
    public BigDecimal getGiftPointOld() {
        return giftPointOld;
    }

    /**
     * null
     * @param giftPointOld null
     */
    public void setGiftPointOld(BigDecimal giftPointOld) {
        this.giftPointOld = giftPointOld;
    }

    /**
     * null
     * @return GIFT_POINT_NEW null
     */
    public BigDecimal getGiftPointNew() {
        return giftPointNew;
    }

    /**
     * null
     * @param giftPointNew null
     */
    public void setGiftPointNew(BigDecimal giftPointNew) {
        this.giftPointNew = giftPointNew;
    }

    /**
     * null
     * @return USE_POINT_LIMIT_OLD null
     */
    public BigDecimal getUsePointLimitOld() {
        return usePointLimitOld;
    }

    /**
     * null
     * @param usePointLimitOld null
     */
    public void setUsePointLimitOld(BigDecimal usePointLimitOld) {
        this.usePointLimitOld = usePointLimitOld;
    }

    /**
     * null
     * @return USE_POINT_LIMIT_NEW null
     */
    public BigDecimal getUsePointLimitNew() {
        return usePointLimitNew;
    }

    /**
     * null
     * @param usePointLimitNew null
     */
    public void setUsePointLimitNew(BigDecimal usePointLimitNew) {
        this.usePointLimitNew = usePointLimitNew;
    }

    /**
     * null
     * @return OPERATE_MAN null
     */
    public String getOperateMan() {
        return operateMan;
    }

    /**
     * null
     * @param operateMan null
     */
    public void setOperateMan(String operateMan) {
        this.operateMan = operateMan == null ? null : operateMan.trim();
    }

    /**
     * null
     * @return CREATE_TIME null
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * null
     * @param createTime null
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}