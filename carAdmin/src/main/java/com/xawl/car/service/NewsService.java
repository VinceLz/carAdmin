package com.xawl.car.service;

import javax.servlet.http.HttpServletRequest;

import com.xawl.car.pojo.DbNews;
import com.xawl.car.utils.CarResult;
import com.xawl.car.utils.PageResult;

public interface NewsService {

	CarResult addNews(DbNews dbnews);

	CarResult selectByCid(Integer cid);

	PageResult selectAll(Integer page);

	CarResult deleteByNid(Integer nid, HttpServletRequest req);

	CarResult updateNews(DbNews dbnews, HttpServletRequest request);

	CarResult updateImage(String url, int nid, String path);

	CarResult selectByNid(Integer nid);

}
