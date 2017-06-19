package com.xawl.car.pojo;

import java.math.BigDecimal;

public class DbBasic {
    private Integer basicid;

    private BigDecimal gprice;

    private BigDecimal subsidy;

    private BigDecimal guidegprice;

    private String level;

    private String motor;

    private String transmission;

    private String lWH;

    private String structure;

    private String maxspeed;

    private String official0;

    private String reality100;

    private String reality0;

    private String oilwear;

    private String colligateoil;

    private String realitygap;

    private String warranty;

    public Integer getBasicid() {
        return basicid;
    }

    public void setBasicid(Integer basicid) {
        this.basicid = basicid;
    }

    public BigDecimal getGprice() {
        return gprice;
    }

    public void setGprice(BigDecimal gprice) {
        this.gprice = gprice;
    }

    public BigDecimal getSubsidy() {
        return subsidy;
    }

    public void setSubsidy(BigDecimal subsidy) {
        this.subsidy = subsidy;
    }

    public BigDecimal getGuidegprice() {
        return guidegprice;
    }

    public void setGuidegprice(BigDecimal guidegprice) {
        this.guidegprice = guidegprice;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level == null ? null : level.trim();
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor == null ? null : motor.trim();
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission == null ? null : transmission.trim();
    }

    public String getlWH() {
        return lWH;
    }

    public void setlWH(String lWH) {
        this.lWH = lWH == null ? null : lWH.trim();
    }

    public String getStructure() {
        return structure;
    }

    public void setStructure(String structure) {
        this.structure = structure == null ? null : structure.trim();
    }

    public String getMaxspeed() {
        return maxspeed;
    }

    public void setMaxspeed(String maxspeed) {
        this.maxspeed = maxspeed == null ? null : maxspeed.trim();
    }

    public String getOfficial0() {
        return official0;
    }

    public void setOfficial0(String official0) {
        this.official0 = official0 == null ? null : official0.trim();
    }

    public String getReality100() {
        return reality100;
    }

    public void setReality100(String reality100) {
        this.reality100 = reality100 == null ? null : reality100.trim();
    }

    public String getReality0() {
        return reality0;
    }

    public void setReality0(String reality0) {
        this.reality0 = reality0 == null ? null : reality0.trim();
    }

    public String getOilwear() {
        return oilwear;
    }

    public void setOilwear(String oilwear) {
        this.oilwear = oilwear == null ? null : oilwear.trim();
    }

    public String getColligateoil() {
        return colligateoil;
    }

    public void setColligateoil(String colligateoil) {
        this.colligateoil = colligateoil == null ? null : colligateoil.trim();
    }

    public String getRealitygap() {
        return realitygap;
    }

    public void setRealitygap(String realitygap) {
        this.realitygap = realitygap == null ? null : realitygap.trim();
    }

    public String getWarranty() {
        return warranty;
    }

    public void setWarranty(String warranty) {
        this.warranty = warranty == null ? null : warranty.trim();
    }
}