package com.springboot.mall.model;

import java.math.BigDecimal;
import java.util.Date;

public class UmsRole {
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
    private String description;

    /**
     * null
     */
    private BigDecimal adminCount;

    /**
     * null
     */
    private Date createTime;

    /**
     * null
     */
    private BigDecimal status;

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
     * @return DESCRIPTION null
     */
    public String getDescription() {
        return description;
    }

    /**
     * null
     * @param description null
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * null
     * @return ADMIN_COUNT null
     */
    public BigDecimal getAdminCount() {
        return adminCount;
    }

    /**
     * null
     * @param adminCount null
     */
    public void setAdminCount(BigDecimal adminCount) {
        this.adminCount = adminCount;
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