package com.xawl.car.pojo;

public class DbBuser {
    private Integer buid;

    private String buser;

    private String bpassword;

    private Integer type;

    public Integer getBuid() {
        return buid;
    }

    public void setBuid(Integer buid) {
        this.buid = buid;
    }

    public String getBuser() {
        return buser;
    }

    public void setBuser(String buser) {
        this.buser = buser == null ? null : buser.trim();
    }

    public String getBpassword() {
        return bpassword;
    }

    public void setBpassword(String bpassword) {
        this.bpassword = bpassword == null ? null : bpassword.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }
}