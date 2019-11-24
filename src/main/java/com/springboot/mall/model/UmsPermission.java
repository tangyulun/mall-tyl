package com.springboot.mall.model;

import java.math.BigDecimal;
import java.util.Date;

public class UmsPermission {
    /**
     * null
     */
    private BigDecimal id;

    /**
     * null
     */
    private BigDecimal pid;

    /**
     * null
     */
    private String name;

    /**
     * null
     */
    private String value;

    /**
     * null
     */
    private String icon;

    /**
     * null
     */
    private BigDecimal type;

    /**
     * null
     */
    private String uri;

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
     * @return PID null
     */
    public BigDecimal getPid() {
        return pid;
    }

    /**
     * null
     * @param pid null
     */
    public void setPid(BigDecimal pid) {
        this.pid = pid;
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
     * @return VALUE null
     */
    public String getValue() {
        return value;
    }

    /**
     * null
     * @param value null
     */
    public void setValue(String value) {
        this.value = value == null ? null : value.trim();
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
     * @return TYPE null
     */
    public BigDecimal getType() {
        return type;
    }

    /**
     * null
     * @param type null
     */
    public void setType(BigDecimal type) {
        this.type = type;
    }

    /**
     * null
     * @return URI null
     */
    public String getUri() {
        return uri;
    }

    /**
     * null
     * @param uri null
     */
    public void setUri(String uri) {
        this.uri = uri == null ? null : uri.trim();
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