package com.xawl.car.pojo;

import java.util.Date;

public class DbUser {
    private Integer uid;

    private String ulogin;

    private String uphone;

    private String uaddress;

    private String ulongitude;

    private String uname;

    private String upassword;

    private String uprovince;

    private String ucity;

    private String ulatitude;

    private Date udate;

    private Integer rid;

    private String ulastlogin;

    private String uemail;

    private Byte status;

    private String rname;

    private String uimage;

    private String token;

    private String bid;

    private Short sex;

    private Short isonline;

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }
    

    public String getUlogin() {
        return ulogin;
    }

    public void setUlogin(String ulogin) {
        this.ulogin = ulogin == null ? null : ulogin.trim();
    }

    public String getUphone() {
        return uphone;
    }

    public void setUphone(String uphone) {
        this.uphone = uphone == null ? null : uphone.trim();
    }

    public String getUaddress() {
        return uaddress;
    }

    public void setUaddress(String uaddress) {
        this.uaddress = uaddress == null ? null : uaddress.trim();
    }

    public String getUlongitude() {
        return ulongitude;
    }

    public void setUlongitude(String ulongitude) {
        this.ulongitude = ulongitude == null ? null : ulongitude.trim();
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname == null ? null : uname.trim();
    }

    public String getUpassword() {
        return upassword;
    }

    public void setUpassword(String upassword) {
        this.upassword = upassword == null ? null : upassword.trim();
    }

    public String getUprovince() {
        return uprovince;
    }

    public void setUprovince(String uprovince) {
        this.uprovince = uprovince == null ? null : uprovince.trim();
    }

    public String getUcity() {
        return ucity;
    }

    public void setUcity(String ucity) {
        this.ucity = ucity == null ? null : ucity.trim();
    }

    public String getUlatitude() {
        return ulatitude;
    }

    public void setUlatitude(String ulatitude) {
        this.ulatitude = ulatitude == null ? null : ulatitude.trim();
    }

    public Date getUdate() {
        return udate;
    }

    public void setUdate(Date udate) {
        this.udate = udate;
    }

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public String getUlastlogin() {
        return ulastlogin;
    }

    public void setUlastlogin(String ulastlogin) {
        this.ulastlogin = ulastlogin == null ? null : ulastlogin.trim();
    }

    public String getUemail() {
        return uemail;
    }

    public void setUemail(String uemail) {
        this.uemail = uemail == null ? null : uemail.trim();
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public String getRname() {
        return rname;
    }

    public void setRname(String rname) {
        this.rname = rname == null ? null : rname.trim();
    }

    public String getUimage() {
        return uimage;
    }

    public void setUimage(String uimage) {
        this.uimage = uimage == null ? null : uimage.trim();
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token == null ? null : token.trim();
    }

    public String getBid() {
        return bid;
    }

    public void setBid(String bid) {
        this.bid = bid == null ? null : bid.trim();
    }

    public Short getSex() {
        return sex;
    }

    public void setSex(Short sex) {
        this.sex = sex;
    }

    public Short getIsonline() {
        return isonline;
    }

    public void setIsonline(Short isonline) {
        this.isonline = isonline;
    }
}