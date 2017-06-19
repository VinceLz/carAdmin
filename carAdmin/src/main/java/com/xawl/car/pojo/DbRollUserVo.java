package com.xawl.car.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class DbRollUserVo {
	private Integer ruid;

	private Integer uid;

	private Integer rid;

	private String pastdate;

	private String createdate;

	private int status;

	private int type;
	private String rname;

	private BigDecimal price;

	private Integer leng;

	private double condition;

	public Integer getRuid() {
		return ruid;
	}

	public void setRuid(Integer ruid) {
		this.ruid = ruid;
	}
	

	public Integer getUid() {
		return uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public Integer getRid() {
		return rid;
	}

	public void setRid(Integer rid) {
		this.rid = rid;
	}

	public String getPastdate() {
		return pastdate;
	}

	public void setPastdate(String pastdate) {
		this.pastdate = pastdate;
	}

	public String getCreatedate() {
		return createdate;
	}

	public void setCreatedate(String createdate) {
		this.createdate = createdate;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public String getRname() {
		return rname;
	}

	public void setRname(String rname) {
		this.rname = rname;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public Integer getLeng() {
		return leng;
	}

	public void setLeng(Integer leng) {
		this.leng = leng;
	}

	public double getCondition() {
		return condition;
	}

	public void setCondition(double condition) {
		this.condition = condition;
	}

}
