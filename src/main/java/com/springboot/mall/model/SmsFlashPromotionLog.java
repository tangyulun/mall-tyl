package com.springboot.mall.model;

import java.math.BigDecimal;
import java.util.Date;

public class SmsFlashPromotionLog {
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
    private BigDecimal productId;

    /**
     * null
     */
    private String memberPhone;

    /**
     * null
     */
    private String productName;

    /**
     * null
     */
    private Date subscribeTime;

    /**
     * null
     */
    private Date sendTime;

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
     * @return PRODUCT_ID null
     */
    public BigDecimal getProductId() {
        return productId;
    }

    /**
     * null
     * @param productId null
     */
    public void setProductId(BigDecimal productId) {
        this.productId = productId;
    }

    /**
     * null
     * @return MEMBER_PHONE null
     */
    public String getMemberPhone() {
        return memberPhone;
    }

    /**
     * null
     * @param memberPhone null
     */
    public void setMemberPhone(String memberPhone) {
        this.memberPhone = memberPhone == null ? null : memberPhone.trim();
    }

    /**
     * null
     * @return PRODUCT_NAME null
     */
    public String getProductName() {
        return productName;
    }

    /**
     * null
     * @param productName null
     */
    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    /**
     * null
     * @return SUBSCRIBE_TIME null
     */
    public Date getSubscribeTime() {
        return subscribeTime;
    }

    /**
     * null
     * @param subscribeTime null
     */
    public void setSubscribeTime(Date subscribeTime) {
        this.subscribeTime = subscribeTime;
    }

    /**
     * null
     * @return SEND_TIME null
     */
    public Date getSendTime() {
        return sendTime;
    }

    /**
     * null
     * @param sendTime null
     */
    public void setSendTime(Date sendTime) {
        this.sendTime = sendTime;
    }
}