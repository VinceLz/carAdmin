package com.xawl.car.pojo;


public class DbConsult {
    private Integer consultid;

    private Integer mid;

    private String phone;

    private String uname;

    private String date;
    
    private int status;//询底价状态  0 未询  1 以询
    public Integer getConsultid() {
        return consultid;
    }

    public void setConsultid(Integer consultid) {
        this.consultid = consultid;
    }

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname == null ? null : uname.trim();
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}
    
}