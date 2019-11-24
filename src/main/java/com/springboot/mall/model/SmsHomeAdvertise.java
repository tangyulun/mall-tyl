package com.springboot.mall.model;

import java.math.BigDecimal;
import java.util.Date;

public class SmsHomeAdvertise {
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
    private BigDecimal type;

    /**
     * null
     */
    private String pic;

    /**
     * null
     */
    private Date startTime;

    /**
     * null
     */
    private Date endTime;

    /**
     * null
     */
    private BigDecimal status;

    /**
     * null
     */
    private BigDecimal clickCount;

    /**
     * null
     */
    private BigDecimal orderCount;

    /**
     * null
     */
    private String url;

    /**
     * null
     */
    private String note;

    /**
     * null
     */
    private BigDecimal sort;

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
     * @return START_TIME null
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * null
     * @param startTime null
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * null
     * @return END_TIME null
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * null
     * @param endTime null
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
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
     * @return CLICK_COUNT null
     */
    public BigDecimal getClickCount() {
        return clickCount;
    }

    /**
     * null
     * @param clickCount null
     */
    public void setClickCount(BigDecimal clickCount) {
        this.clickCount = clickCount;
    }

    /**
     * null
     * @return ORDER_COUNT null
     */
    public BigDecimal getOrderCount() {
        return orderCount;
    }

    /**
     * null
     * @param orderCount null
     */
    public void setOrderCount(BigDecimal orderCount) {
        this.orderCount = orderCount;
    }

    /**
     * null
     * @return URL null
     */
    public String getUrl() {
        return url;
    }

    /**
     * null
     * @param url null
     */
    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
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
}