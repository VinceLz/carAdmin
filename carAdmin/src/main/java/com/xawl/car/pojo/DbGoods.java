package com.xawl.car.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class DbGoods {
    private Integer gid;

    private String gname;

    private Integer bid;

    private Date gdate;

    private Integer sale;

    private Boolean ishot;

    private String title;

    private BigDecimal maxprice;

    private BigDecimal minprice;

    private String gshowimage;

    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }

    public String getGname() {
        return gname;
    }

    public void setGname(String gname) {
        this.gname = gname == null ? null : gname.trim();
    }

    public Integer getBid() {
        return bid;
    }

    public void setBid(Integer bid) {
        this.bid = bid;
    }

    public Date getGdate() {
        return gdate;
    }

    public void setGdate(Date gdate) {
        this.gdate = gdate;
    }

    public Integer getSale() {
        return sale;
    }

    public void setSale(Integer sale) {
        this.sale = sale;
    }

    public Boolean getIshot() {
        return ishot;
    }

    public void setIshot(Boolean ishot) {
        this.ishot = ishot;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public BigDecimal getMaxprice() {
        return maxprice;
    }

    public void setMaxprice(BigDecimal maxprice) {
        this.maxprice = maxprice;
    }

    public BigDecimal getMinprice() {
        return minprice;
    }

    public void setMinprice(BigDecimal minprice) {
        this.minprice = minprice;
    }

    public String getGshowimage() {
        return gshowimage;
    }

    public void setGshowimage(String gshowimage) {
        this.gshowimage = gshowimage == null ? null : gshowimage.trim();
    }
}