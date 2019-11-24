package com.springboot.mall.model;

import java.math.BigDecimal;

public class OmsCompanyAddress {
    /**
     * null
     */
    private BigDecimal id;

    /**
     * null
     */
    private String addressName;

    /**
     * null
     */
    private BigDecimal sendStatus;

    /**
     * null
     */
    private BigDecimal receiveStatus;

    /**
     * null
     */
    private String name;

    /**
     * null
     */
    private String phone;

    /**
     * null
     */
    private String province;

    /**
     * null
     */
    private String city;

    /**
     * null
     */
    private String region;

    /**
     * null
     */
    private String detailAddress;

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
     * @return ADDRESS_NAME null
     */
    public String getAddressName() {
        return addressName;
    }

    /**
     * null
     * @param addressName null
     */
    public void setAddressName(String addressName) {
        this.addressName = addressName == null ? null : addressName.trim();
    }

    /**
     * null
     * @return SEND_STATUS null
     */
    public BigDecimal getSendStatus() {
        return sendStatus;
    }

    /**
     * null
     * @param sendStatus null
     */
    public void setSendStatus(BigDecimal sendStatus) {
        this.sendStatus = sendStatus;
    }

    /**
     * null
     * @return RECEIVE_STATUS null
     */
    public BigDecimal getReceiveStatus() {
        return receiveStatus;
    }

    /**
     * null
     * @param receiveStatus null
     */
    public void setReceiveStatus(BigDecimal receiveStatus) {
        this.receiveStatus = receiveStatus;
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
     * @return PHONE null
     */
    public String getPhone() {
        return phone;
    }

    /**
     * null
     * @param phone null
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * null
     * @return PROVINCE null
     */
    public String getProvince() {
        return province;
    }

    /**
     * null
     * @param province null
     */
    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    /**
     * null
     * @return CITY null
     */
    public String getCity() {
        return city;
    }

    /**
     * null
     * @param city null
     */
    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    /**
     * null
     * @return REGION null
     */
    public String getRegion() {
        return region;
    }

    /**
     * null
     * @param region null
     */
    public void setRegion(String region) {
        this.region = region == null ? null : region.trim();
    }

    /**
     * null
     * @return DETAIL_ADDRESS null
     */
    public String getDetailAddress() {
        return detailAddress;
    }

    /**
     * null
     * @param detailAddress null
     */
    public void setDetailAddress(String detailAddress) {
        this.detailAddress = detailAddress == null ? null : detailAddress.trim();
    }
}