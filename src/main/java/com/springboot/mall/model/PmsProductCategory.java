package com.springboot.mall.model;

import java.math.BigDecimal;

public class PmsProductCategory {
    /**
     * null
     */
    private BigDecimal id;

    /**
     * null
     */
    private BigDecimal parentId;

    /**
     * null
     */
    private String name;

    /**
     * null
     */
    private BigDecimal level;

    /**
     * null
     */
    private BigDecimal productCount;

    /**
     * null
     */
    private String productUnit;

    /**
     * null
     */
    private BigDecimal navStatus;

    /**
     * null
     */
    private BigDecimal showStatus;

    /**
     * null
     */
    private BigDecimal sort;

    /**
     * null
     */
    private String icon;

    /**
     * null
     */
    private String keywords;

    /**
     * null
     */
    private byte[] description;

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
     * @return PARENT_ID null
     */
    public BigDecimal getParentId() {
        return parentId;
    }

    /**
     * null
     * @param parentId null
     */
    public void setParentId(BigDecimal parentId) {
        this.parentId = parentId;
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
     * @return LEVEL null
     */
    public BigDecimal getLevel() {
        return level;
    }

    /**
     * null
     * @param level null
     */
    public void setLevel(BigDecimal level) {
        this.level = level;
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
     * @return PRODUCT_UNIT null
     */
    public String getProductUnit() {
        return productUnit;
    }

    /**
     * null
     * @param productUnit null
     */
    public void setProductUnit(String productUnit) {
        this.productUnit = productUnit == null ? null : productUnit.trim();
    }

    /**
     * null
     * @return NAV_STATUS null
     */
    public BigDecimal getNavStatus() {
        return navStatus;
    }

    /**
     * null
     * @param navStatus null
     */
    public void setNavStatus(BigDecimal navStatus) {
        this.navStatus = navStatus;
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
     * @return KEYWORDS null
     */
    public String getKeywords() {
        return keywords;
    }

    /**
     * null
     * @param keywords null
     */
    public void setKeywords(String keywords) {
        this.keywords = keywords == null ? null : keywords.trim();
    }

    /**
     * null
     * @return DESCRIPTION null
     */
    public byte[] getDescription() {
        return description;
    }

    /**
     * null
     * @param description null
     */
    public void setDescription(byte[] description) {
        this.description = description;
    }
}