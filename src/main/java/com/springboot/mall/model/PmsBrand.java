package com.springboot.mall.model;

import java.math.BigDecimal;

public class PmsBrand {
    /**
     * null
     */
    private BigDecimal id;

    /**
     * null
     */
    private String name;

    /**
     * null
     */
    private String firstLetter;

    /**
     * null
     */
    private BigDecimal sort;

    /**
     * null
     */
    private BigDecimal factoryStatus;

    /**
     * null
     */
    private BigDecimal showStatus;

    /**
     * null
     */
    private BigDecimal productCount;

    /**
     * null
     */
    private BigDecimal productCommentCount;

    /**
     * null
     */
    private String logo;

    /**
     * null
     */
    private String bigPic;

    /**
     * null
     */
    private byte[] brandStory;

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
     * @return NAME null
     */
    public String getName() {
        return name;
    }

    /**
     * null
     * @param name null
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * null
     * @return FIRST_LETTER null
     */
    public String getFirstLetter() {
        return firstLetter;
    }

    /**
     * null
     * @param firstLetter null
     */
    public void setFirstLetter(String firstLetter) {
        this.firstLetter = firstLetter == null ? null : firstLetter.trim();
    }

    /**
     * null
     * @return SORT null
     */
    public BigDecimal getSort() {
        return sort;
    }

    /**
     * null
     * @param sort null
     */
    public void setSort(BigDecimal sort) {
        this.sort = sort;
    }

    /**
     * null
     * @return FACTORY_STATUS null
     */
    public BigDecimal getFactoryStatus() {
        return factoryStatus;
    }

    /**
     * null
     * @param factoryStatus null
     */
    public void setFactoryStatus(BigDecimal factoryStatus) {
        this.factoryStatus = factoryStatus;
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
     * @return PRODUCT_COMMENT_COUNT null
     */
    public BigDecimal getProductCommentCount() {
        return productCommentCount;
    }

    /**
     * null
     * @param productCommentCount null
     */
    public void setProductCommentCount(BigDecimal productCommentCount) {
        this.productCommentCount = productCommentCount;
    }

    /**
     * null
     * @return LOGO null
     */
    public String getLogo() {
        return logo;
    }

    /**
     * null
     * @param logo null
     */
    public void setLogo(String logo) {
        this.logo = logo == null ? null : logo.trim();
    }

    /**
     * null
     * @return BIG_PIC null
     */
    public String getBigPic() {
        return bigPic;
    }

    /**
     * null
     * @param bigPic null
     */
    public void setBigPic(String bigPic) {
        this.bigPic = bigPic == null ? null : bigPic.trim();
    }

    /**
     * null
     * @return BRAND_STORY null
     */
    public byte[] getBrandStory() {
        return brandStory;
    }

    /**
     * null
     * @param brandStory null
     */
    public void setBrandStory(byte[] brandStory) {
        this.brandStory = brandStory;
    }
}