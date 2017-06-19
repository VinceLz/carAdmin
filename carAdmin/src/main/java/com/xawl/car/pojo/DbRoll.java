package com.xawl.car.pojo;

import java.math.BigDecimal;

public class DbRoll {
    private Integer rid;

    private Byte type;

    private String rname;

    private BigDecimal price;

    private Integer leng;
    
    private double condition;

//    private String typestr;
//
//    public String getTypestr() {
//        return typestr;
//    }
//
//    public void setTypestr(String typestr) {
//        this.typestr = typestr;
//    }

    public double getCondition() {
		return condition;
	}

	public void setCondition(double condition) {
		this.condition = condition;
	}

	public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public String getRname() {
        return rname;
    }

    public void setRname(String rname) {
        this.rname = rname == null ? null : rname.trim();
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
}