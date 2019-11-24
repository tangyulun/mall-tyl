package com.springboot.mall.model;

import java.math.BigDecimal;

public class CmsTopicCategory {
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
    private String icon;

    /**
     * null
     */
    private BigDecimal subjectCount;

    /**
     * null
     */
    private BigDecimal showStatus;

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
     * @return ICON null
     */
    public String getIcon() {
        return icon;
    }

    /**
     * null
     * @param icon null
     */
    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
    }

    /**
     * null
     * @return SUBJECT_COUNT null
     */
    public BigDecimal getSubjectCount() {
        return subjectCount;
    }

    /**
     * null
     * @param subjectCount null
     */
    public void setSubjectCount(BigDecimal subjectCount) {
        this.subjectCount = subjectCount;
    }

    /**
     * null
     * @return SHOW_STATUS null
     */
    public BigDecimal getShowStatus() {
        return showStatus;
    }

    /**
     * null
     * @param showStatus null
     */
    public void setShowStatus(BigDecimal showStatus) {
        this.showStatus = showStatus;
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