package com.springboot.mall.model;

import java.math.BigDecimal;

public class PmsSkuStock {
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
    private String skuCode;

    /**
     * null
     */
    private BigDecimal price;

    /**
     * null
     */
    private BigDecimal stock;

    /**
     * null
     */
    private BigDecimal lowStock;

    /**
     * null
     */
    private String sp1;

    /**
     * null
     */
    private String sp2;

    /**
     * null
     */
    private String sp3;

    /**
     * null
     */
    private String pic;

    /**
     * null
     */
    private BigDecimal sale;

    /**
     * null
     */
    private BigDecimal promotionPrice;

    /**
     * null
     */
    private BigDecimal lockStock;

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
     * @return SKU_CODE null
     */
    public String getSkuCode() {
        return skuCode;
    }

    /**
     * null
     * @param skuCode null
     */
    public void setSkuCode(String skuCode) {
        this.skuCode = skuCode == null ? null : skuCode.trim();
    }

    /**
     * null
     * @return PRICE null
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * null
     * @param price null
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * null
     * @return STOCK null
     */
    public BigDecimal getStock() {
        return stock;
    }

    /**
     * null
     * @param stock null
     */
    public void setStock(BigDecimal stock) {
        this.stock = stock;
    }

    /**
     * null
     * @return LOW_STOCK null
     */
    public BigDecimal getLowStock() {
        return lowStock;
    }

    /**
     * null
     * @param lowStock null
     */
    public void setLowStock(BigDecimal lowStock) {
        this.lowStock = lowStock;
    }

    /**
     * null
     * @return SP1 null
     */
    public String getSp1() {
        return sp1;
    }

    /**
     * null
     * @param sp1 null
     */
    public void setSp1(String sp1) {
        this.sp1 = sp1 == null ? null : sp1.trim();
    }

    /**
     * null
     * @return SP2 null
     */
    public String getSp2() {
        return sp2;
    }

    /**
     * null
     * @param sp2 null
     */
    public void setSp2(String sp2) {
        this.sp2 = sp2 == null ? null : sp2.trim();
    }

    /**
     * null
     * @return SP3 null
     */
    public String getSp3() {
        return sp3;
    }

    /**
     * null
     * @param sp3 null
     */
    public void setSp3(String sp3) {
        this.sp3 = sp3 == null ? null : sp3.trim();
    }

    /**
     * null
     * @return PIC null
     */
    public String getPic() {
        return pic;
    }

    /**
     * null
     * @param pic null
     */
    public void setPic(String pic) {
        this.pic = pic == null ? null : pic.trim();
    }

    /**
     * null
     * @return SALE null
     */
    public BigDecimal getSale() {
        return sale;
    }

    /**
     * null
     * @param sale null
     */
    public void setSale(BigDecimal sale) {
        this.sale = sale;
    }

    /**
     * null
     * @return PROMOTION_PRICE null
     */
    public BigDecimal getPromotionPrice() {
        return promotionPrice;
    }

    /**
     * null
     * @param promotionPrice null
     */
    public void setPromotionPrice(BigDecimal promotionPrice) {
        this.promotionPrice = promotionPrice;
    }

    /**
     * null
     * @return LOCK_STOCK null
     */
    public BigDecimal getLockStock() {
        return lockStock;
    }

    /**
     * null
     * @param lockStock null
     */
    public void setLockStock(BigDecimal lockStock) {
        this.lockStock = lockStock;
    }
}