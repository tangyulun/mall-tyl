package com.springboot.mall.model;

public class PmsProductWithBLOBs extends PmsProduct {
    /**
     * null
     */
    private byte[] description;

    /**
     * null
     */
    private byte[] detailDesc;

    /**
     * null
     */
    private byte[] detailHtml;

    /**
     * null
     */
    private byte[] detailMobileHtml;

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

    /**
     * null
     * @return DETAIL_DESC null
     */
    public byte[] getDetailDesc() {
        return detailDesc;
    }

    /**
     * null
     * @param detailDesc null
     */
    public void setDetailDesc(byte[] detailDesc) {
        this.detailDesc = detailDesc;
    }

    /**
     * null
     * @return DETAIL_HTML null
     */
    public byte[] getDetailHtml() {
        return detailHtml;
    }

    /**
     * null
     * @param detailHtml null
     */
    public void setDetailHtml(byte[] detailHtml) {
        this.detailHtml = detailHtml;
    }

    /**
     * null
     * @return DETAIL_MOBILE_HTML null
     */
    public byte[] getDetailMobileHtml() {
        return detailMobileHtml;
    }

    /**
     * null
     * @param detailMobileHtml null
     */
    public void setDetailMobileHtml(byte[] detailMobileHtml) {
        this.detailMobileHtml = detailMobileHtml;
    }
}