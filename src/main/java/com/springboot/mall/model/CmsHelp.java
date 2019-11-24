package com.springboot.mall.model;

import java.math.BigDecimal;
import java.util.Date;

public class CmsHelp {
    /**
     * null
     */
    private BigDecimal id;

    /**
     * null
     */
    private BigDecimal categoryId;

    /**
     * null
     */
    private String icon;

    /**
     * null
     */
    private String title;

    /**
     * null
     */
    private BigDecimal showStatus;

    /**
     * null
     */
    private Date createTime;

    /**
     * null
     */
    private BigDecimal readCount;

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
     * @return CATEGORY_ID null
     */
    public BigDecimal getCategoryId() {
        return categoryId;
    }

    /**
     * null
     * @param categoryId null
     */
    public void setCategoryId(BigDecimal categoryId) {
        this.categoryId = categoryId;
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
     * @return TITLE null
     */
    public String getTitle() {
        return title;
    }

    /**
     * null
     * @param title null
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
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