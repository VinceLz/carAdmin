package com.xawl.car.pojo;

import java.util.Date;

public class DbMaintainbusiness {
    private Integer mbid;

    private String mbname;

    private String bshowimage;

    private String baddress;

    private Date bdate;

    private String bphone;

    private String uname;

    private String longitude;

    private String latitude;

    private Boolean ishot;

    private String title1;

    private Float score;

    private Integer purchase;

    private Integer commentcount;

    private String time;

    private String mpassword;

    private String preferentialinformation;

    public Integer getMbid() {
        return mbid;
    }

    public void setMbid(Integer mbid) {
        this.mbid = mbid;
    }

    public String getMbname() {
        return mbname;
    }

    public void setMbname(String mbname) {
        this.mbname = mbname == null ? null : mbname.trim();
    }

    public String getBshowimage() {
        return bshowimage;
    }

    public void setBshowimage(String bshowimage) {
        this.bshowimage = bshowimage == null ? null : bshowimage.trim();
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

    public Boolean getIshot() {
        return ishot;
    }

    public void setIshot(Boolean ishot) {
        this.ishot = ishot;
    }

    public String getTitle1() {
        return title1;
    }

    public void setTitle1(String title1) {
        this.title1 = title1 == null ? null : title1.trim();
    }

    public Float getScore() {
        return score;
    }

    public void setScore(Float score) {
        this.score = score;
    }

    public Integer getPurchase() {
        return purchase;
    }

    public void setPurchase(Integer purchase) {
        this.purchase = purchase;
    }

    public Integer getCommentcount() {
        return commentcount;
    }

    public void setCommentcount(Integer commentcount) {
        this.commentcount = commentcount;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time == null ? null : time.trim();
    }

    public String getMpassword() {
        return mpassword;
    }

    public void setMpassword(String mpassword) {
        this.mpassword = mpassword == null ? null : mpassword.trim();
    }

    public String getPreferentialinformation() {
        return preferentialinformation;
    }

    public void setPreferentialinformation(String preferentialinformation) {
        this.preferentialinformation = preferentialinformation == null ? null : preferentialinformation.trim();
    }
}