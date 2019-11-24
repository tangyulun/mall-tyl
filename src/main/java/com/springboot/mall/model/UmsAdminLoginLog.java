package com.springboot.mall.model;

import java.math.BigDecimal;
import java.util.Date;

public class UmsAdminLoginLog {
    /**
     * null
     */
    private BigDecimal id;

    /**
     * null
     */
    private BigDecimal adminId;

    /**
     * null
     */
    private Date createTime;

    /**
     * null
     */
    private String ip;

    /**
     * null
     */
    private String address;

    /**
     * null
     */
    private String userAgent;

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
     * @return ADMIN_ID null
     */
    public BigDecimal getAdminId() {
        return adminId;
    }

    /**
     * null
     * @param adminId null
     */
    public void setAdminId(BigDecimal adminId) {
        this.adminId = adminId;
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
     * @return IP null
     */
    public String getIp() {
        return ip;
    }

    /**
     * null
     * @param ip null
     */
    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    /**
     * null
     * @return ADDRESS null
     */
    public String getAddress() {
        return address;
    }

    /**
     * null
     * @param address null
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * null
     * @return USER_AGENT null
     */
    public String getUserAgent() {
        return userAgent;
    }

    /**
     * null
     * @param userAgent null
     */
    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent == null ? null : userAgent.trim();
    }
}