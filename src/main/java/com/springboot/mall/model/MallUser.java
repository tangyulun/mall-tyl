package com.springboot.mall.model;

import java.math.BigDecimal;
import java.util.Date;

public class MallUser {
    /**
     * null
     */
    private BigDecimal id;

    /**
     * null
     */
    private String userName;

    /**
     * null
     */
    private String password;

    /**
     * null
     */
    private String phone;

    /**
     * null
     */
    private String email;

    /**
     * null
     */
    private BigDecimal isActive;

    /**
     * null
     */
    private Date createTime;

    /**
     * null
     */
    private Date updateTime;

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
     * @return USER_NAME null
     */
    public String getUserName() {
        return userName;
    }

    /**
     * null
     * @param userName null
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * null
     * @return PASSWORD null
     */
    public String getPassword() {
        return password;
    }

    /**
     * null
     * @param password null
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * null
     * @return PHONE null
     */
    public String getPhone() {
        return phone;
    }

    /**
     * null
     * @param phone null
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * null
     * @return EMAIL null
     */
    public String getEmail() {
        return email;
    }

    /**
     * null
     * @param email null
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * null
     * @return IS_ACTIVE null
     */
    public BigDecimal getIsActive() {
        return isActive;
    }

    /**
     * null
     * @param isActive null
     */
    public void setIsActive(BigDecimal isActive) {
        this.isActive = isActive;
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
     * @return UPDATE_TIME null
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * null
     * @param updateTime null
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}