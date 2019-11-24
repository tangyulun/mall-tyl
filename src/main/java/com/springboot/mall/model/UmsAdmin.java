package com.springboot.mall.model;

import java.math.BigDecimal;
import java.util.Date;

public class UmsAdmin {
    /**
     * null
     */
    private BigDecimal id;

    /**
     * null
     */
    private String username;

    /**
     * null
     */
    private String password;

    /**
     * null
     */
    private String icon;

    /**
     * null
     */
    private String email;

    /**
     * null
     */
    private String nickName;

    /**
     * null
     */
    private String note;

    /**
     * null
     */
    private Date createTime;

    /**
     * null
     */
    private Date loginTime;

    /**
     * null
     */
    private BigDecimal status;

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
     * @return USERNAME null
     */
    public String getUsername() {
        return username;
    }

    /**
     * null
     * @param username null
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
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
     * @return NICK_NAME null
     */
    public String getNickName() {
        return nickName;
    }

    /**
     * null
     * @param nickName null
     */
    public void setNickName(String nickName) {
        this.nickName = nickName == null ? null : nickName.trim();
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
     * @return LOGIN_TIME null
     */
    public Date getLoginTime() {
        return loginTime;
    }

    /**
     * null
     * @param loginTime null
     */
    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
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
}