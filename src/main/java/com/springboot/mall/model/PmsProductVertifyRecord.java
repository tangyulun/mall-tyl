package com.springboot.mall.model;

import java.math.BigDecimal;
import java.util.Date;

public class PmsProductVertifyRecord {
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
    private Date createTime;

    /**
     * null
     */
    private String vertifyMan;

    /**
     * null
     */
    private BigDecimal status;

    /**
     * null
     */
    private String detail;

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

    /**
     * null
     * @return VERTIFY_MAN null
     */
    public String getVertifyMan() {
        return vertifyMan;
    }

    /**
     * null
     * @param vertifyMan null
     */
    public void setVertifyMan(String vertifyMan) {
        this.vertifyMan = vertifyMan == null ? null : vertifyMan.trim();
    }

    /**
     * null
     * @return STATUS null
     */
    public BigDecimal getStatus() {
        return status;
    }

    /**
     * null
     * @param status null
     */
    public void setStatus(BigDecimal status) {
        this.status = status;
    }

    /**
     * null
     * @return DETAIL null
     */
    public String getDetail() {
        return detail;
    }

    /**
     * null
     * @param detail null
     */
    public void setDetail(String detail) {
        this.detail = detail == null ? null : detail.trim();
    }
}