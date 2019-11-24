package com.springboot.mall.model;

import java.math.BigDecimal;

public class SmsHomeRecommendSubject {
    /**
     * null
     */
    private BigDecimal id;

    /**
     * null
     */
    private BigDecimal subjectId;

    /**
     * null
     */
    private String subjectName;

    /**
     * null
     */
    private BigDecimal recommendStatus;

    /**
     * null
     */
    private BigDecimal sort;

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
     * @return SUBJECT_ID null
     */
    public BigDecimal getSubjectId() {
        return subjectId;
    }

    /**
     * null
     * @param subjectId null
     */
    public void setSubjectId(BigDecimal subjectId) {
        this.subjectId = subjectId;
    }

    /**
     * null
     * @return SUBJECT_NAME null
     */
    public String getSubjectName() {
        return subjectName;
    }

    /**
     * null
     * @param subjectName null
     */
    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName == null ? null : subjectName.trim();
    }

    /**
     * null
     * @return RECOMMEND_STATUS null
     */
    public BigDecimal getRecommendStatus() {
        return recommendStatus;
    }

    /**
     * null
     * @param recommendStatus null
     */
    public void setRecommendStatus(BigDecimal recommendStatus) {
        this.recommendStatus = recommendStatus;
    }

    /**
     * null
     * @return SORT null
     */
    public BigDecimal getSort() {
        return sort;
    }

    /**
     * null
     * @param sort null
     */
    public void setSort(BigDecimal sort) {
        this.sort = sort;
    }
}