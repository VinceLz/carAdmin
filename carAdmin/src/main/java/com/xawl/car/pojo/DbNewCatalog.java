package com.xawl.car.pojo;

public class DbNewCatalog {
	private Integer catid;
	private String cname;
	private Integer sort;
	private String cdesc;

	@Override
	public String toString() {
		return "DbNewCatalog [catid=" + catid + ", cname=" + cname + ", sort="
				+ sort + ", cdesc=" + cdesc + "]";
	}

	public Integer getCatid() {
		return catid;
	}

	public void setCatid(Integer catid) {
		this.catid = catid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public Integer getSort() {
		return sort;
	}

	public void setSort(Integer sort) {
		this.sort = sort;
	}

	public String getCdesc() {
		return cdesc;
	}

	public void setCdesc(String cdesc) {
		this.cdesc = cdesc;
	}
}
