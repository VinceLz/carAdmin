package com.xawl.car.pojo;

public class DbColor {
    private Integer colorid;

    private String colorname;

    private String colorkey;

    private Integer mid;

    public Integer getColorid() {
        return colorid;
    }

    public void setColorid(Integer colorid) {
        this.colorid = colorid;
    }

    public String getColorname() {
        return colorname;
    }

    public void setColorname(String colorname) {
        this.colorname = colorname == null ? null : colorname.trim();
    }

    public String getColorkey() {
        return colorkey;
    }

    public void setColorkey(String colorkey) {
        this.colorkey = colorkey == null ? null : colorkey.trim();
    }

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }
}