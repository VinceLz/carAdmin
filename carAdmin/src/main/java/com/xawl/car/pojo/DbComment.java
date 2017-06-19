package com.xawl.car.pojo;

import java.util.Date;

public class DbComment {
	private Integer commentId;

	private Integer mbid;

	private String content;
	private String date;
	private String uname;
	private String mbname;
	private int uid;

	public Integer getCommentId() {
		return commentId;
	}

	public void setCommentId(Integer commentId) {
		this.commentId = commentId;
	}

	public Integer getMbid() {
		return mbid;
	}

	public void setMbid(Integer mbid) {
		this.mbid = mbid;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getMbname() {
		return mbname;
	}

	public void setMbname(String mbname) {
		this.mbname = mbname;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

}