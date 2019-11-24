package com.springboot.mall.model;

import java.math.BigDecimal;
import java.util.Date;

public class UmsMemberLoginLog {
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
    private String ip;

    /**
     * null
     */
    private String city;

    /**
     * null
     */
    private BigDecimal loginType;

    /**
     * null
     */
    private String province;

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
     * @return CITY null
     */
    public String getCity() {
        return city;
    }

    /**
     * null
     * @param city null
     */
    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    /**
     * null
     * @return LOGIN_TYPE null
     */
    public BigDecimal getLoginType() {
        return loginType;
    }

    /**
     * null
     * @param loginType null
     */
    public void setLoginType(BigDecimal loginType) {
        this.loginType = loginType;
    }

    /**
     * null
     * @return PROVINCE null
     */
    public String getProvince() {
        return province;
    }

    /**
     * null
     * @param province null
     */
    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }
}