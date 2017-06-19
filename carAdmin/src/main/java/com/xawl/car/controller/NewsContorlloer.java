package com.xawl.car.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import net.sf.json.JSONObject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor;
import com.fasterxml.jackson.databind.util.JSONPObject;
import com.xawl.car.pojo.DbNews;
import com.xawl.car.service.NewsService;
import com.xawl.car.service.PictureService;
import com.xawl.car.utils.CarResult;
import com.xawl.car.utils.DateUtil;
import com.xawl.car.utils.PageResult;

@Controller
@RequestMapping("/news")
public class NewsContorlloer {

	@Autowired
	NewsService newsService;
	@Autowired
	PictureService pictureService;

	public static String urlImage = "http://www.singpa.com";

	// 富文本编辑图片上传
	@RequestMapping("/cupload.action")
	@ResponseBody
	public String cupload(MultipartFile uploadFile, HttpServletRequest request) {
		Map<String, Object> uploadPicture = pictureService.uploadPicture(
				uploadFile, request);
		String string = urlImage + (String) uploadPicture.get("url");
		Object err = uploadPicture.get("error");
		List results = new ArrayList<String>();
		results.add(string);
		JSONObject jsonObject = new JSONObject();
		jsonObject.accumulate("data", results);
		jsonObject.accumulate("errno", err);
		return jsonObject.toString();
	}

	@RequestMapping("/addNews.action")
	@ResponseBody
	public CarResult findByUid(DbNews dbnews) {
		// 1 组建发布日期
		dbnews.setDate(DateUtil.getSqlDate());
		// 2 组建点击率 0
		dbnews.setLinkNum(0);
		// 返回nid
		CarResult carResult = newsService.addNews(dbnews);
		return carResult;
	}

	@RequestMapping("/upload.action")
	@ResponseBody
	public CarResult upload(Integer nid, MultipartFile uploadFile,
			HttpServletRequest request) {
		Map<String, String> uploadPicture = pictureService.uploadPicture(
				uploadFile, request);
		String url = uploadPicture.get("url");
		ServletContext sc = request.getSession().getServletContext();
		final String path = sc.getRealPath("img") + "/";
		CarResult updateImage = newsService.updateImage(url, nid, path);
		return updateImage;
	}

	@RequestMapping("/get.action")
	@ResponseBody
	public CarResult get(Integer nid) {
		CarResult carResult = newsService.selectByNid(nid);
		return carResult;
	}

	@RequestMapping("/selectByCid.action")
	@ResponseBody
	public CarResult selectByCid(Integer cid) {
		CarResult carResult = newsService.selectByCid(cid);
		return carResult;
	}

	@RequestMapping("/selectAll.action")
	@ResponseBody
	public PageResult selectAll(Integer page) {
		PageResult selectAll = newsService.selectAll(page);
		return selectAll;
	}

	@RequestMapping("/deleteByNid.action")
	@ResponseBody
	public CarResult deleteByNid(Integer nid, HttpServletRequest request) {
		// 删除并删除图片
		CarResult carResult = newsService.deleteByNid(nid, request);
		return carResult;
	}

	@RequestMapping("/updateNews.action")
	@ResponseBody
	public CarResult updateNews(DbNews dbnews, HttpServletRequest request) {
		// 更新删除图片
		CarResult carResult = newsService.updateNews(dbnews, request);
		return carResult;
	}
}
