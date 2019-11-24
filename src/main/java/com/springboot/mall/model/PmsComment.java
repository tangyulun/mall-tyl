package com.springboot.mall.model;

import java.math.BigDecimal;
import java.util.Date;

public class PmsComment {
    /**
     * null
     */
    private BigDecimal id;

    /**
     * null
     */
    private BigDecimal productId;

    /**
     * null
     */
    private String memberNickName;

    /**
     * null
     */
    private String productName;

    /**
     * null
     */
    private BigDecimal star;

    /**
     * null
     */
    private String memberIp;

    /**
     * null
     */
    private Date createTime;

    /**
     * null
     */
    private BigDecimal showStatus;

    /**
     * null
     */
    private String productAttribute;

    /**
     * null
     */
    private BigDecimal collectCouont;

    /**
     * null
     */
    private BigDecimal readCount;

    /**
     * null
     */
    private String pics;

    /**
     * null
     */
    private String memberIcon;

    /**
     * null
     */
    private BigDecimal replayCount;

    /**
     * null
     */
    private byte[] content;

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
     * @return MEMBER_NICK_NAME null
     */
    public String getMemberNickName() {
        return memberNickName;
    }

    /**
     * null
     * @param memberNickName null
     */
    public void setMemberNickName(String memberNickName) {
        this.memberNickName = memberNickName == null ? null : memberNickName.trim();
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
     * @return STAR null
     */
    public BigDecimal getStar() {
        return star;
    }

    /**
     * null
     * @param star null
     */
    public void setStar(BigDecimal star) {
        this.star = star;
    }

    /**
     * null
     * @return MEMBER_IP null
     */
    public String getMemberIp() {
        return memberIp;
    }

    /**
     * null
     * @param memberIp null
     */
    public void setMemberIp(String memberIp) {
        this.memberIp = memberIp == null ? null : memberIp.trim();
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
     * @return SHOW_STATUS null
     */
    public BigDecimal getShowStatus() {
        return showStatus;
    }

    /**
     * null
     * @param showStatus null
     */
    public void setShowStatus(BigDecimal showStatus) {
        this.showStatus = showStatus;
    }

    /**
     * null
     * @return PRODUCT_ATTRIBUTE null
     */
    public String getProductAttribute() {
        return productAttribute;
    }

    /**
     * null
     * @param productAttribute null
     */
    public void setProductAttribute(String productAttribute) {
        this.productAttribute = productAttribute == null ? null : productAttribute.trim();
    }

    /**
     * null
     * @return COLLECT_COUONT null
     */
    public BigDecimal getCollectCouont() {
        return collectCouont;
    }

    /**
     * null
     * @param collectCouont null
     */
    public void setCollectCouont(BigDecimal collectCouont) {
        this.collectCouont = collectCouont;
    }

    /**
     * null
     * @return READ_COUNT null
     */
    public BigDecimal getReadCount() {
        return readCount;
    }

    /**
     * null
     * @param readCount null
     */
    public void setReadCount(BigDecimal readCount) {
        this.readCount = readCount;
    }

    /**
     * null
     * @return PICS null
     */
    public String getPics() {
        return pics;
    }

    /**
     * null
     * @param pics null
     */
    public void setPics(String pics) {
        this.pics = pics == null ? null : pics.trim();
    }

    /**
     * null
     * @return MEMBER_ICON null
     */
    public String getMemberIcon() {
        return memberIcon;
    }

    /**
     * null
     * @param memberIcon null
     */
    public void setMemberIcon(String memberIcon) {
        this.memberIcon = memberIcon == null ? null : memberIcon.trim();
    }

    /**
     * null
     * @return REPLAY_COUNT null
     */
    public BigDecimal getReplayCount() {
        return replayCount;
    }

    /**
     * null
     * @param replayCount null
     */
    public void setReplayCount(BigDecimal replayCount) {
        this.replayCount = replayCount;
    }

    /**
     * null
     * @return CONTENT null
     */
    public byte[] getContent() {
        return content;
    }

    /**
     * null
     * @param content null
     */
    public void setContent(byte[] content) {
        this.content = content;
    }
}