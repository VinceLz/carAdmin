package com.xawl.car.pojo;

public class DbRollGrant {
    private Integer rgid;

    private String rgname;

    private Byte status;

    private String handler;

    private String param;

    public Integer getRgid() {
        return rgid;
    }

    public void setRgid(Integer rgid) {
        this.rgid = rgid;
    }

    public String getRgname() {
        return rgname;
    }

    public void setRgname(String rgname) {
        this.rgname = rgname == null ? null : rgname.trim();
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public String getHandler() {
        return handler;
    }

    public void setHandler(String handler) {
        this.handler = handler == null ? null : handler.trim();
    }

    public String getParam() {
        return param;
    }

    public void setParam(String param) {
        this.param = param == null ? null : param.trim();
    }
}