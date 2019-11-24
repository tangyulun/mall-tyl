package com.springboot.mall.model;

import java.math.BigDecimal;
import java.util.Date;

public class OmsOrder {
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
    private BigDecimal couponId;

    /**
     * null
     */
    private String orderSn;

    /**
     * null
     */
    private Date createTime;

    /**
     * null
     */
    private String memberUsername;

    /**
     * null
     */
    private BigDecimal totalAmount;

    /**
     * null
     */
    private BigDecimal payAmount;

    /**
     * null
     */
    private BigDecimal freightAmount;

    /**
     * null
     */
    private BigDecimal promotionAmount;

    /**
     * null
     */
    private BigDecimal integrationAmount;

    /**
     * null
     */
    private BigDecimal couponAmount;

    /**
     * null
     */
    private BigDecimal discountAmount;

    /**
     * null
     */
    private BigDecimal payType;

    /**
     * null
     */
    private BigDecimal sourceType;

    /**
     * null
     */
    private BigDecimal status;

    /**
     * null
     */
    private BigDecimal orderType;

    /**
     * null
     */
    private String deliveryCompany;

    /**
     * null
     */
    private String deliverySn;

    /**
     * null
     */
    private BigDecimal autoConfirmDay;

    /**
     * null
     */
    private BigDecimal integration;

    /**
     * null
     */
    private BigDecimal growth;

    /**
     * null
     */
    private String promotionInfo;

    /**
     * null
     */
    private BigDecimal billType;

    /**
     * null
     */
    private String billHeader;

    /**
     * null
     */
    private String billContent;

    /**
     * null
     */
    private String billReceiverPhone;

    /**
     * null
     */
    private String billReceiverEmail;

    /**
     * null
     */
    private String receiverName;

    /**
     * null
     */
    private String receiverPhone;

    /**
     * null
     */
    private String receiverPostCode;

    /**
     * null
     */
    private String receiverProvince;

    /**
     * null
     */
    private String receiverCity;

    /**
     * null
     */
    private String receiverRegion;

    /**
     * null
     */
    private String receiverDetailAddress;

    /**
     * null
     */
    private String note;

    /**
     * null
     */
    private BigDecimal confirmStatus;

    /**
     * null
     */
    private BigDecimal deleteStatus;

    /**
     * null
     */
    private BigDecimal useIntegration;

    /**
     * null
     */
    private Date paymentTime;

    /**
     * null
     */
    private Date deliveryTime;

    /**
     * null
     */
    private Date receiveTime;

    /**
     * null
     */
    private Date commentTime;

    /**
     * null
     */
    private Date modifyTime;

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
     * @return MEMBER_USERNAME null
     */
    public String getMemberUsername() {
        return memberUsername;
    }

    /**
     * null
     * @param memberUsername null
     */
    public void setMemberUsername(String memberUsername) {
        this.memberUsername = memberUsername == null ? null : memberUsername.trim();
    }

    /**
     * null
     * @return TOTAL_AMOUNT null
     */
    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    /**
     * null
     * @param totalAmount null
     */
    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    /**
     * null
     * @return PAY_AMOUNT null
     */
    public BigDecimal getPayAmount() {
        return payAmount;
    }

    /**
     * null
     * @param payAmount null
     */
    public void setPayAmount(BigDecimal payAmount) {
        this.payAmount = payAmount;
    }

    /**
     * null
     * @return FREIGHT_AMOUNT null
     */
    public BigDecimal getFreightAmount() {
        return freightAmount;
    }

    /**
     * null
     * @param freightAmount null
     */
    public void setFreightAmount(BigDecimal freightAmount) {
        this.freightAmount = freightAmount;
    }

    /**
     * null
     * @return PROMOTION_AMOUNT null
     */
    public BigDecimal getPromotionAmount() {
        return promotionAmount;
    }

    /**
     * null
     * @param promotionAmount null
     */
    public void setPromotionAmount(BigDecimal promotionAmount) {
        this.promotionAmount = promotionAmount;
    }

    /**
     * null
     * @return INTEGRATION_AMOUNT null
     */
    public BigDecimal getIntegrationAmount() {
        return integrationAmount;
    }

    /**
     * null
     * @param integrationAmount null
     */
    public void setIntegrationAmount(BigDecimal integrationAmount) {
        this.integrationAmount = integrationAmount;
    }

    /**
     * null
     * @return COUPON_AMOUNT null
     */
    public BigDecimal getCouponAmount() {
        return couponAmount;
    }

    /**
     * null
     * @param couponAmount null
     */
    public void setCouponAmount(BigDecimal couponAmount) {
        this.couponAmount = couponAmount;
    }

    /**
     * null
     * @return DISCOUNT_AMOUNT null
     */
    public BigDecimal getDiscountAmount() {
        return discountAmount;
    }

    /**
     * null
     * @param discountAmount null
     */
    public void setDiscountAmount(BigDecimal discountAmount) {
        this.discountAmount = discountAmount;
    }

    /**
     * null
     * @return PAY_TYPE null
     */
    public BigDecimal getPayType() {
        return payType;
    }

    /**
     * null
     * @param payType null
     */
    public void setPayType(BigDecimal payType) {
        this.payType = payType;
    }

    /**
     * null
     * @return SOURCE_TYPE null
     */
    public BigDecimal getSourceType() {
        return sourceType;
    }

    /**
     * null
     * @param sourceType null
     */
    public void setSourceType(BigDecimal sourceType) {
        this.sourceType = sourceType;
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
     * @return ORDER_TYPE null
     */
    public BigDecimal getOrderType() {
        return orderType;
    }

    /**
     * null
     * @param orderType null
     */
    public void setOrderType(BigDecimal orderType) {
        this.orderType = orderType;
    }

    /**
     * null
     * @return DELIVERY_COMPANY null
     */
    public String getDeliveryCompany() {
        return deliveryCompany;
    }

    /**
     * null
     * @param deliveryCompany null
     */
    public void setDeliveryCompany(String deliveryCompany) {
        this.deliveryCompany = deliveryCompany == null ? null : deliveryCompany.trim();
    }

    /**
     * null
     * @return DELIVERY_SN null
     */
    public String getDeliverySn() {
        return deliverySn;
    }

    /**
     * null
     * @param deliverySn null
     */
    public void setDeliverySn(String deliverySn) {
        this.deliverySn = deliverySn == null ? null : deliverySn.trim();
    }

    /**
     * null
     * @return AUTO_CONFIRM_DAY null
     */
    public BigDecimal getAutoConfirmDay() {
        return autoConfirmDay;
    }

    /**
     * null
     * @param autoConfirmDay null
     */
    public void setAutoConfirmDay(BigDecimal autoConfirmDay) {
        this.autoConfirmDay = autoConfirmDay;
    }

    /**
     * null
     * @return INTEGRATION null
     */
    public BigDecimal getIntegration() {
        return integration;
    }

    /**
     * null
     * @param integration null
     */
    public void setIntegration(BigDecimal integration) {
        this.integration = integration;
    }

    /**
     * null
     * @return GROWTH null
     */
    public BigDecimal getGrowth() {
        return growth;
    }

    /**
     * null
     * @param growth null
     */
    public void setGrowth(BigDecimal growth) {
        this.growth = growth;
    }

    /**
     * null
     * @return PROMOTION_INFO null
     */
    public String getPromotionInfo() {
        return promotionInfo;
    }

    /**
     * null
     * @param promotionInfo null
     */
    public void setPromotionInfo(String promotionInfo) {
        this.promotionInfo = promotionInfo == null ? null : promotionInfo.trim();
    }

    /**
     * null
     * @return BILL_TYPE null
     */
    public BigDecimal getBillType() {
        return billType;
    }

    /**
     * null
     * @param billType null
     */
    public void setBillType(BigDecimal billType) {
        this.billType = billType;
    }

    /**
     * null
     * @return BILL_HEADER null
     */
    public String getBillHeader() {
        return billHeader;
    }

    /**
     * null
     * @param billHeader null
     */
    public void setBillHeader(String billHeader) {
        this.billHeader = billHeader == null ? null : billHeader.trim();
    }

    /**
     * null
     * @return BILL_CONTENT null
     */
    public String getBillContent() {
        return billContent;
    }

    /**
     * null
     * @param billContent null
     */
    public void setBillContent(String billContent) {
        this.billContent = billContent == null ? null : billContent.trim();
    }

    /**
     * null
     * @return BILL_RECEIVER_PHONE null
     */
    public String getBillReceiverPhone() {
        return billReceiverPhone;
    }

    /**
     * null
     * @param billReceiverPhone null
     */
    public void setBillReceiverPhone(String billReceiverPhone) {
        this.billReceiverPhone = billReceiverPhone == null ? null : billReceiverPhone.trim();
    }

    /**
     * null
     * @return BILL_RECEIVER_EMAIL null
     */
    public String getBillReceiverEmail() {
        return billReceiverEmail;
    }

    /**
     * null
     * @param billReceiverEmail null
     */
    public void setBillReceiverEmail(String billReceiverEmail) {
        this.billReceiverEmail = billReceiverEmail == null ? null : billReceiverEmail.trim();
    }

    /**
     * null
     * @return RECEIVER_NAME null
     */
    public String getReceiverName() {
        return receiverName;
    }

    /**
     * null
     * @param receiverName null
     */
    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName == null ? null : receiverName.trim();
    }

    /**
     * null
     * @return RECEIVER_PHONE null
     */
    public String getReceiverPhone() {
        return receiverPhone;
    }

    /**
     * null
     * @param receiverPhone null
     */
    public void setReceiverPhone(String receiverPhone) {
        this.receiverPhone = receiverPhone == null ? null : receiverPhone.trim();
    }

    /**
     * null
     * @return RECEIVER_POST_CODE null
     */
    public String getReceiverPostCode() {
        return receiverPostCode;
    }

    /**
     * null
     * @param receiverPostCode null
     */
    public void setReceiverPostCode(String receiverPostCode) {
        this.receiverPostCode = receiverPostCode == null ? null : receiverPostCode.trim();
    }

    /**
     * null
     * @return RECEIVER_PROVINCE null
     */
    public String getReceiverProvince() {
        return receiverProvince;
    }

    /**
     * null
     * @param receiverProvince null
     */
    public void setReceiverProvince(String receiverProvince) {
        this.receiverProvince = receiverProvince == null ? null : receiverProvince.trim();
    }

    /**
     * null
     * @return RECEIVER_CITY null
     */
    public String getReceiverCity() {
        return receiverCity;
    }

    /**
     * null
     * @param receiverCity null
     */
    public void setReceiverCity(String receiverCity) {
        this.receiverCity = receiverCity == null ? null : receiverCity.trim();
    }

    /**
     * null
     * @return RECEIVER_REGION null
     */
    public String getReceiverRegion() {
        return receiverRegion;
    }

    /**
     * null
     * @param receiverRegion null
     */
    public void setReceiverRegion(String receiverRegion) {
        this.receiverRegion = receiverRegion == null ? null : receiverRegion.trim();
    }

    /**
     * null
     * @return RECEIVER_DETAIL_ADDRESS null
     */
    public String getReceiverDetailAddress() {
        return receiverDetailAddress;
    }

    /**
     * null
     * @param receiverDetailAddress null
     */
    public void setReceiverDetailAddress(String receiverDetailAddress) {
        this.receiverDetailAddress = receiverDetailAddress == null ? null : receiverDetailAddress.trim();
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
     * @return CONFIRM_STATUS null
     */
    public BigDecimal getConfirmStatus() {
        return confirmStatus;
    }

    /**
     * null
     * @param confirmStatus null
     */
    public void setConfirmStatus(BigDecimal confirmStatus) {
        this.confirmStatus = confirmStatus;
    }

    /**
     * null
     * @return DELETE_STATUS null
     */
    public BigDecimal getDeleteStatus() {
        return deleteStatus;
    }

    /**
     * null
     * @param deleteStatus null
     */
    public void setDeleteStatus(BigDecimal deleteStatus) {
        this.deleteStatus = deleteStatus;
    }

    /**
     * null
     * @return USE_INTEGRATION null
     */
    public BigDecimal getUseIntegration() {
        return useIntegration;
    }

    /**
     * null
     * @param useIntegration null
     */
    public void setUseIntegration(BigDecimal useIntegration) {
        this.useIntegration = useIntegration;
    }

    /**
     * null
     * @return PAYMENT_TIME null
     */
    public Date getPaymentTime() {
        return paymentTime;
    }

    /**
     * null
     * @param paymentTime null
     */
    public void setPaymentTime(Date paymentTime) {
        this.paymentTime = paymentTime;
    }

    /**
     * null
     * @return DELIVERY_TIME null
     */
    public Date getDeliveryTime() {
        return deliveryTime;
    }

    /**
     * null
     * @param deliveryTime null
     */
    public void setDeliveryTime(Date deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    /**
     * null
     * @return RECEIVE_TIME null
     */
    public Date getReceiveTime() {
        return receiveTime;
    }

    /**
     * null
     * @param receiveTime null
     */
    public void setReceiveTime(Date receiveTime) {
        this.receiveTime = receiveTime;
    }

    /**
     * null
     * @return COMMENT_TIME null
     */
    public Date getCommentTime() {
        return commentTime;
    }

    /**
     * null
     * @param commentTime null
     */
    public void setCommentTime(Date commentTime) {
        this.commentTime = commentTime;
    }

    /**
     * null
     * @return MODIFY_TIME null
     */
    public Date getModifyTime() {
        return modifyTime;
    }

    /**
     * null
     * @param modifyTime null
     */
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }
}