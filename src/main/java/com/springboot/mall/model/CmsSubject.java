package com.springboot.mall.model;

import java.math.BigDecimal;
import java.util.Date;

public class CmsSubject {
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
    private String title;

    /**
     * null
     */
    private String pic;

    /**
     * null
     */
    private BigDecimal productCount;

    /**
     * null
     */
    private BigDecimal recommendStatus;

    /**
     * null
     */
    private Date createTime;

    /**
     * null
     */
    private BigDecimal collectCount;

    /**
     * null
     */
    private BigDecimal readCount;

    /**
     * null
     */
    private BigDecimal commentCount;

    /**
     * null
     */
    private String albumPics;

    /**
     * null
     */
    private String description;

    /**
     * null
     */
    private BigDecimal showStatus;

    /**
     * null
     */
    private BigDecimal forwardCount;

    /**
     * null
     */
    private String categoryName;

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
     * @return PIC null
     */
    public String getPic() {
        return pic;
    }

    /**
     * null
     * @param pic null
     */
    public void setPic(String pic) {
        this.pic = pic == null ? null : pic.trim();
    }

    /**
     * null
     * @return PRODUCT_COUNT null
     */
    public BigDecimal getProductCount() {
        return productCount;
    }

    /**
     * null
     * @param productCount null
     */
    public void setProductCount(BigDecimal productCount) {
        this.productCount = productCount;
    }

    /**
     * null
     * @return RECOMMEND_STATUS null
     */
    public BigDecimal getRecommendStatus() {
        return recommendStatus;
    }

    /**
     * null
     * @param recommendStatus null
     */
    public void setRecommendStatus(BigDecimal recommendStatus) {
        this.recommendStatus = recommendStatus;
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
     * @return COLLECT_COUNT null
     */
    public BigDecimal getCollectCount() {
        return collectCount;
    }

    /**
     * null
     * @param collectCount null
     */
    public void setCollectCount(BigDecimal collectCount) {
        this.collectCount = collectCount;
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
     * @return COMMENT_COUNT null
     */
    public BigDecimal getCommentCount() {
        return commentCount;
    }

    /**
     * null
     * @param commentCount null
     */
    public void setCommentCount(BigDecimal commentCount) {
        this.commentCount = commentCount;
    }

    /**
     * null
     * @return ALBUM_PICS null
     */
    public String getAlbumPics() {
        return albumPics;
    }

    /**
     * null
     * @param albumPics null
     */
    public void setAlbumPics(String albumPics) {
        this.albumPics = albumPics == null ? null : albumPics.trim();
    }

    /**
     * null
     * @return DESCRIPTION null
     */
    public String getDescription() {
        return description;
    }

    /**
     * null
     * @param description null
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
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
     * @return FORWARD_COUNT null
     */
    public BigDecimal getForwardCount() {
        return forwardCount;
    }

    /**
     * null
     * @param forwardCount null
     */
    public void setForwardCount(BigDecimal forwardCount) {
        this.forwardCount = forwardCount;
    }

    /**
     * null
     * @return CATEGORY_NAME null
     */
    public String getCategoryName() {
        return categoryName;
    }

    /**
     * null
     * @param categoryName null
     */
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName == null ? null : categoryName.trim();
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