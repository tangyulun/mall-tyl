package com.springboot.mall.model;

import java.math.BigDecimal;
import java.util.Date;

public class PmsCommentReplay {
    /**
     * null
     */
    private BigDecimal id;

    /**
     * null
     */
    private BigDecimal commentId;

    /**
     * null
     */
    private String memberNickName;

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
    private BigDecimal type;

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
     * @return COMMENT_ID null
     */
    public BigDecimal getCommentId() {
        return commentId;
    }

    /**
     * null
     * @param commentId null
     */
    public void setCommentId(BigDecimal commentId) {
        this.commentId = commentId;
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
     * @return TYPE null
     */
    public BigDecimal getType() {
        return type;
    }

    /**
     * null
     * @param type null
     */
    public void setType(BigDecimal type) {
        this.type = type;
    }
}