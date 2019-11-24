package com.springboot.mall.model;

import java.math.BigDecimal;
import java.util.Date;

public class SmsFlashPromotion {
    /**
     * null
     */
    private BigDecimal id;

    /**
     * null
     */
    private String title;

    /**
     * null
     */
    private Date startDate;

    /**
     * null
     */
    private Date endDate;

    /**
     * null
     */
    private BigDecimal status;

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
     * @return TITLE null
     */
    public String getTitle() {
        return title;
    }

    /**
     * null
     * @param title null
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * null
     * @return START_DATE null
     */
    public Date getStartDate() {
        return startDate;
    }

    /**
     * null
     * @param startDate null
     */
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    /**
     * null
     * @return END_DATE null
     */
    public Date getEndDate() {
        return endDate;
    }

    /**
     * null
     * @param endDate null
     */
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
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