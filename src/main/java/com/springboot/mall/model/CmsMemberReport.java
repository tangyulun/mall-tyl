package com.springboot.mall.model;

import java.math.BigDecimal;
import java.util.Date;

public class CmsMemberReport {
    /**
     * null
     */
    private BigDecimal id;

    /**
     * null
     */
    private BigDecimal reportType;

    /**
     * null
     */
    private String reportMemberName;

    /**
     * null
     */
    private Date createTime;

    /**
     * null
     */
    private String reportObject;

    /**
     * null
     */
    private BigDecimal reportStatus;

    /**
     * null
     */
    private BigDecimal handleStatus;

    /**
     * null
     */
    private String note;

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
     * @return REPORT_TYPE null
     */
    public BigDecimal getReportType() {
        return reportType;
    }

    /**
     * null
     * @param reportType null
     */
    public void setReportType(BigDecimal reportType) {
        this.reportType = reportType;
    }

    /**
     * null
     * @return REPORT_MEMBER_NAME null
     */
    public String getReportMemberName() {
        return reportMemberName;
    }

    /**
     * null
     * @param reportMemberName null
     */
    public void setReportMemberName(String reportMemberName) {
        this.reportMemberName = reportMemberName == null ? null : reportMemberName.trim();
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
     * @return REPORT_OBJECT null
     */
    public String getReportObject() {
        return reportObject;
    }

    /**
     * null
     * @param reportObject null
     */
    public void setReportObject(String reportObject) {
        this.reportObject = reportObject == null ? null : reportObject.trim();
    }

    /**
     * null
     * @return REPORT_STATUS null
     */
    public BigDecimal getReportStatus() {
        return reportStatus;
    }

    /**
     * null
     * @param reportStatus null
     */
    public void setReportStatus(BigDecimal reportStatus) {
        this.reportStatus = reportStatus;
    }

    /**
     * null
     * @return HANDLE_STATUS null
     */
    public BigDecimal getHandleStatus() {
        return handleStatus;
    }

    /**
     * null
     * @param handleStatus null
     */
    public void setHandleStatus(BigDecimal handleStatus) {
        this.handleStatus = handleStatus;
    }

    /**
     * null
     * @return NOTE null
     */
    public String getNote() {
        return note;
    }

    /**
     * null
     * @param note null
     */
    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }
}