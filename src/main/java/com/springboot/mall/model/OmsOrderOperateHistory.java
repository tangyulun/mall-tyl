package com.springboot.mall.model;

import java.math.BigDecimal;
import java.util.Date;

public class OmsOrderOperateHistory {
    /**
     * null
     */
    private BigDecimal id;

    /**
     * null
     */
    private BigDecimal orderId;

    /**
     * null
     */
    private String operateMan;

    /**
     * null
     */
    private Date createTime;

    /**
     * null
     */
    private BigDecimal orderStatus;

    /**
     * null
     */
    private String note;

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
     * @return OPERATE_MAN null
     */
    public String getOperateMan() {
        return operateMan;
    }

    /**
     * null
     * @param operateMan null
     */
    public void setOperateMan(String operateMan) {
        this.operateMan = operateMan == null ? null : operateMan.trim();
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
     * @return ORDER_STATUS null
     */
    public BigDecimal getOrderStatus() {
        return orderStatus;
    }

    /**
     * null
     * @param orderStatus null
     */
    public void setOrderStatus(BigDecimal orderStatus) {
        this.orderStatus = orderStatus;
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
}