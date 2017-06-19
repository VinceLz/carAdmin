package com.xawl.car.pojo;

public class DbSystem {
	private Integer id;

	private String title2;

	private String stages12;

	private String stages24;

	private String stages36;

	private String mbtitle2;
	
	

	public String getMbtitle2() {
		return mbtitle2;
	}

	public void setMbtitle2(String mbtitle2) {
		this.mbtitle2 = mbtitle2;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle2() {
		return title2;
	}

	public void setTitle2(String title2) {
		this.title2 = title2 == null ? null : title2.trim();
	}

	public String getStages12() {
		return stages12;
	}

	public void setStages12(String stages12) {
		this.stages12 = stages12 == null ? null : stages12.trim();
	}

	public String getStages24() {
		return stages24;
	}

	public void setStages24(String stages24) {
		this.stages24 = stages24 == null ? null : stages24.trim();
	}

	public String getStages36() {
		return stages36;
	}

	public void setStages36(String stages36) {
		this.stages36 = stages36 == null ? null : stages36.trim();
	}
}