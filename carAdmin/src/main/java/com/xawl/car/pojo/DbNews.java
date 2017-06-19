package com.xawl.car.pojo;

public class DbNews {
	@Override
	public String toString() {
		return "DbNews [nid=" + nid + ", ntitle=" + ntitle + ", ncontent="
				+ ncontent + ", date=" + date + ", author=" + author
				+ ", linkNum=" + linkNum + ", cid=" + cid + ", image=" + image
				+ ", description=" + description + "]";
	}

	private Integer nid;
	private String ntitle;
	private String ncontent;
	private String date;
	private String author;
	private Integer linkNum;
	private Integer cid;
	private String image;
	private String description;

	public Integer getNid() {
		return nid;
	}

	public void setNid(Integer nid) {
		this.nid = nid;
	}

	public String getNtitle() {
		return ntitle;
	}

	public void setNtitle(String ntitle) {
		this.ntitle = ntitle;
	}

	public String getNcontent() {
		return ncontent;
	}

	public void setNcontent(String ncontent) {
		this.ncontent = ncontent;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Integer getLinkNum() {
		return linkNum;
	}

	public void setLinkNum(Integer linkNum) {
		this.linkNum = linkNum;
	}

	public Integer getCid() {
		return cid;
	}

	public void setCid(Integer cid) {
		this.cid = cid;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
