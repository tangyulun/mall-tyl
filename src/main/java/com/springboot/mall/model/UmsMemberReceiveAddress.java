package com.springboot.mall.model;

import java.math.BigDecimal;

public class UmsMemberReceiveAddress {
    /**
     * null
     */
    private BigDecimal id;

    /**
     * null
     */
    private BigDecimal memberId;

    /**
     * null
     */
    private String name;

    /**
     * null
     */
    private String phoneNumber;

    /**
     * null
     */
    private BigDecimal defaultStatus;

    /**
     * null
     */
    private String postCode;

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
     * @return MEMBER_ID null
     */
    public BigDecimal getMemberId() {
        return memberId;
    }

    /**
     * null
     * @param memberId null
     */
    public void setMemberId(BigDecimal memberId) {
        this.memberId = memberId;
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
     * @return PHONE_NUMBER null
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * null
     * @param phoneNumber null
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber == null ? null : phoneNumber.trim();
    }

    /**
     * null
     * @return DEFAULT_STATUS null
     */
    public BigDecimal getDefaultStatus() {
        return defaultStatus;
    }

    /**
     * null
     * @param defaultStatus null
     */
    public void setDefaultStatus(BigDecimal defaultStatus) {
        this.defaultStatus = defaultStatus;
    }

    /**
     * null
     * @return POST_CODE null
     */
    public String getPostCode() {
        return postCode;
    }

    /**
     * null
     * @param postCode null
     */
    public void setPostCode(String postCode) {
        this.postCode = postCode == null ? null : postCode.trim();
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