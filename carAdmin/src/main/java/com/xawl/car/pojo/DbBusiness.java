package com.xawl.car.pojo;

import java.util.Date;

public class DbBusiness {
    private Integer bid;

    private String bname;

    private String baddress;

    private Date bdate;

    private String bphone;

    private String uname;

    private String longitude;

    private String latitude;

    private String type;

    private Boolean ishot;

    private String myphone;

    private String majorbusiness;

    private String title1;

    private String bshowimage;

    private Boolean isactivity;

    public Integer getBid() {
        return bid;
    }

    public void setBid(Integer bid) {
        this.bid = bid;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname == null ? null : bname.trim();
    }

    public String getBaddress() {
        return baddress;
    }

    public void setBaddress(String baddress) {
        this.baddress = baddress == null ? null : baddress.trim();
    }

    public Date getBdate() {
        return bdate;
    }

    public void setBdate(Date bdate) {
        this.bdate = bdate;
    }

    public String getBphone() {
        return bphone;
    }

    public void setBphone(String bphone) {
        this.bphone = bphone == null ? null : bphone.trim();
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname == null ? null : uname.trim();
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude == null ? null : longitude.trim();
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude == null ? null : latitude.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public Boolean getIshot() {
        return ishot;
    }

    public void setIshot(Boolean ishot) {
        this.ishot = ishot;
    }

    public String getMyphone() {
        return myphone;
    }

    public void setMyphone(String myphone) {
        this.myphone = myphone == null ? null : myphone.trim();
    }

    public String getMajorbusiness() {
        return majorbusiness;
    }

    public void setMajorbusiness(String majorbusiness) {
        this.majorbusiness = majorbusiness == null ? null : majorbusiness.trim();
    }

    public String getTitle1() {
        return title1;
    }

    public void setTitle1(String title1) {
        this.title1 = title1 == null ? null : title1.trim();
    }

    public String getBshowimage() {
        return bshowimage;
    }

    public void setBshowimage(String bshowimage) {
        this.bshowimage = bshowimage == null ? null : bshowimage.trim();
    }

    public Boolean getIsactivity() {
        return isactivity;
    }

    public void setIsactivity(Boolean isactivity) {
        this.isactivity = isactivity;
    }
}