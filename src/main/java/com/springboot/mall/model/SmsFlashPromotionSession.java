package com.springboot.mall.model;

import java.math.BigDecimal;
import java.util.Date;

public class SmsFlashPromotionSession {
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
    private Date startTime;

    /**
     * null
     */
    private Date endTime;

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
     * @return START_TIME null
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * null
     * @param startTime null
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * null
     * @return END_TIME null
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * null
     * @param endTime null
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
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