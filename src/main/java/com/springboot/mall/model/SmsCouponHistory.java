package com.springboot.mall.model;

import java.math.BigDecimal;
import java.util.Date;

public class SmsCouponHistory {
    /**
     * null
     */
    private BigDecimal id;

    /**
     * null
     */
    private BigDecimal couponId;

    /**
     * null
     */
    private BigDecimal memberId;

    /**
     * null
     */
    private String couponCode;

    /**
     * null
     */
    private String memberNickname;

    /**
     * null
     */
    private BigDecimal getType;

    /**
     * null
     */
    private Date createTime;

    /**
     * null
     */
    private BigDecimal useStatus;

    /**
     * null
     */
    private Date useTime;

    /**
     * null
     */
    private BigDecimal orderId;

    /**
     * null
     */
    private String orderSn;

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
     * @return COUPON_ID null
     */
    public BigDecimal getCouponId() {
        return couponId;
    }

    /**
     * null
     * @param couponId null
     */
    public void setCouponId(BigDecimal couponId) {
        this.couponId = couponId;
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
     * @return COUPON_CODE null
     */
    public String getCouponCode() {
        return couponCode;
    }

    /**
     * null
     * @param couponCode null
     */
    public void setCouponCode(String couponCode) {
        this.couponCode = couponCode == null ? null : couponCode.trim();
    }

    /**
     * null
     * @return MEMBER_NICKNAME null
     */
    public String getMemberNickname() {
        return memberNickname;
    }

    /**
     * null
     * @param memberNickname null
     */
    public void setMemberNickname(String memberNickname) {
        this.memberNickname = memberNickname == null ? null : memberNickname.trim();
    }

    /**
     * null
     * @return GET_TYPE null
     */
    public BigDecimal getGetType() {
        return getType;
    }

    /**
     * null
     * @param getType null
     */
    public void setGetType(BigDecimal getType) {
        this.getType = getType;
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
     * @return USE_STATUS null
     */
    public BigDecimal getUseStatus() {
        return useStatus;
    }

    /**
     * null
     * @param useStatus null
     */
    public void setUseStatus(BigDecimal useStatus) {
        this.useStatus = useStatus;
    }

    /**
     * null
     * @return USE_TIME null
     */
    public Date getUseTime() {
        return useTime;
    }

    /**
     * null
     * @param useTime null
     */
    public void setUseTime(Date useTime) {
        this.useTime = useTime;
    }

    /**
     * null
     * @return ORDER_ID null
     */
    public BigDecimal getOrderId() {
        return orderId;
    }

    /**
     * null
     * @param orderId null
     */
    public void setOrderId(BigDecimal orderId) {
        this.orderId = orderId;
    }

    /**
     * null
     * @return ORDER_SN null
     */
    public String getOrderSn() {
        return orderSn;
    }

    /**
     * null
     * @param orderSn null
     */
    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn == null ? null : orderSn.trim();
    }
}