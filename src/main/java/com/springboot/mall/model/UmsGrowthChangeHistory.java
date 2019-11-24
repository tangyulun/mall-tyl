package com.springboot.mall.model;

import java.math.BigDecimal;
import java.util.Date;

public class UmsGrowthChangeHistory {
    /**
     * null
     */
    private BigDecimal id;

    /**
     * null
     */
    private BigDecimal memberId;

    /**
     * null
     */
    private Date createTime;

    /**
     * null
     */
    private BigDecimal changeType;

    /**
     * null
     */
    private BigDecimal changeCount;

    /**
     * null
     */
    private String operateMan;

    /**
     * null
     */
    private String operateNote;

    /**
     * null
     */
    private BigDecimal sourceType;

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
     * @return MEMBER_ID null
     */
    public BigDecimal getMemberId() {
        return memberId;
    }

    /**
     * null
     * @param memberId null
     */
    public void setMemberId(BigDecimal memberId) {
        this.memberId = memberId;
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
     * @return CHANGE_TYPE null
     */
    public BigDecimal getChangeType() {
        return changeType;
    }

    /**
     * null
     * @param changeType null
     */
    public void setChangeType(BigDecimal changeType) {
        this.changeType = changeType;
    }

    /**
     * null
     * @return CHANGE_COUNT null
     */
    public BigDecimal getChangeCount() {
        return changeCount;
    }

    /**
     * null
     * @param changeCount null
     */
    public void setChangeCount(BigDecimal changeCount) {
        this.changeCount = changeCount;
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
     * @return OPERATE_NOTE null
     */
    public String getOperateNote() {
        return operateNote;
    }

    /**
     * null
     * @param operateNote null
     */
    public void setOperateNote(String operateNote) {
        this.operateNote = operateNote == null ? null : operateNote.trim();
    }

    /**
     * null
     * @return SOURCE_TYPE null
     */
    public BigDecimal getSourceType() {
        return sourceType;
    }

    /**
     * null
     * @param sourceType null
     */
    public void setSourceType(BigDecimal sourceType) {
        this.sourceType = sourceType;
    }
}