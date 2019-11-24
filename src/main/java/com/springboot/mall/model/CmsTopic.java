package com.springboot.mall.model;

import java.math.BigDecimal;
import java.util.Date;

public class CmsTopic {
    /**
     * null
     */
    private BigDecimal id;

    /**
     * null
     */
    private BigDecimal categoryId;

    /**
     * null
     */
    private String name;

    /**
     * null
     */
    private Date createTime;

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
    private BigDecimal attendCount;

    /**
     * null
     */
    private BigDecimal attentionCount;

    /**
     * null
     */
    private BigDecimal readCount;

    /**
     * null
     */
    private String awardName;

    /**
     * null
     */
    private String attendType;

    /**
     * null
     */
    private byte[] content;

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
     * @return CATEGORY_ID null
     */
    public BigDecimal getCategoryId() {
        return categoryId;
    }

    /**
     * null
     * @param categoryId null
     */
    public void setCategoryId(BigDecimal categoryId) {
        this.categoryId = categoryId;
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
     * @return ATTEND_COUNT null
     */
    public BigDecimal getAttendCount() {
        return attendCount;
    }

    /**
     * null
     * @param attendCount null
     */
    public void setAttendCount(BigDecimal attendCount) {
        this.attendCount = attendCount;
    }

    /**
     * null
     * @return ATTENTION_COUNT null
     */
    public BigDecimal getAttentionCount() {
        return attentionCount;
    }

    /**
     * null
     * @param attentionCount null
     */
    public void setAttentionCount(BigDecimal attentionCount) {
        this.attentionCount = attentionCount;
    }

    /**
     * null
     * @return READ_COUNT null
     */
    public BigDecimal getReadCount() {
        return readCount;
    }

    /**
     * null
     * @param readCount null
     */
    public void setReadCount(BigDecimal readCount) {
        this.readCount = readCount;
    }

    /**
     * null
     * @return AWARD_NAME null
     */
    public String getAwardName() {
        return awardName;
    }

    /**
     * null
     * @param awardName null
     */
    public void setAwardName(String awardName) {
        this.awardName = awardName == null ? null : awardName.trim();
    }

    /**
     * null
     * @return ATTEND_TYPE null
     */
    public String getAttendType() {
        return attendType;
    }

    /**
     * null
     * @param attendType null
     */
    public void setAttendType(String attendType) {
        this.attendType = attendType == null ? null : attendType.trim();
    }

    /**
     * null
     * @return CONTENT null
     */
    public byte[] getContent() {
        return content;
    }

    /**
     * null
     * @param content null
     */
    public void setContent(byte[] content) {
        this.content = content;
    }
}