package com.xawl.car.pojo;

public class DbImage {
    private Integer iid;

    private String image;

    private Integer bid;

    private Integer gid;

    private Integer mid;

    private Integer mbid;

    public Integer getIid() {
        return iid;
    }

    public void setIid(Integer iid) {
        this.iid = iid;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image == null ? null : image.trim();
    }

    public Integer getBid() {
        return bid;
    }

    public void setBid(Integer bid) {
        this.bid = bid;
    }

    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

    public Integer getMbid() {
        return mbid;
    }

    public void setMbid(Integer mbid) {
        this.mbid = mbid;
    }
}