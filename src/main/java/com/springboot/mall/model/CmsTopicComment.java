package com.springboot.mall.model;

import java.math.BigDecimal;
import java.util.Date;

public class CmsTopicComment {
    /**
     * null
     */
    private BigDecimal id;

    /**
     * null
     */
    private String memberNickName;

    /**
     * null
     */
    private BigDecimal topicId;

    /**
     * null
     */
    private String memberIcon;

    /**
     * null
     */
    private String content;

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
     * @return TOPIC_ID null
     */
    public BigDecimal getTopicId() {
        return topicId;
    }

    /**
     * null
     * @param topicId null
     */
    public void setTopicId(BigDecimal topicId) {
        this.topicId = topicId;
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
     * @return CONTENT null
     */
    public String getContent() {
        return content;
    }

    /**
     * null
     * @param content null
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
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
}