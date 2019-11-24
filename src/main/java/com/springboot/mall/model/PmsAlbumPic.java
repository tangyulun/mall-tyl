package com.springboot.mall.model;

import java.math.BigDecimal;

public class PmsAlbumPic {
    /**
     * null
     */
    private BigDecimal id;

    /**
     * null
     */
    private BigDecimal albumId;

    /**
     * null
     */
    private String pic;

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
     * @return ALBUM_ID null
     */
    public BigDecimal getAlbumId() {
        return albumId;
    }

    /**
     * null
     * @param albumId null
     */
    public void setAlbumId(BigDecimal albumId) {
        this.albumId = albumId;
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
}