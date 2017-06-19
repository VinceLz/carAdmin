package com.xawl.car.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xawl.car.mapper.DbNewsMapper;
import com.xawl.car.pojo.DbNews;
import com.xawl.car.service.NewsService;
import com.xawl.car.utils.CarResult;
import com.xawl.car.utils.Const;
import com.xawl.car.utils.ImageUtils;
import com.xawl.car.utils.MyFileUtils;
import com.xawl.car.utils.PageResult;

@Service
public class NewsServiceImpl implements NewsService {
	@Autowired
	DbNewsMapper dbNewsMapper;

	public CarResult selectByCid(Integer cid) {
		List<DbNews> list = dbNewsMapper.selectByCid(cid);
		return new CarResult(list);
	}

	public CarResult addNews(DbNews dbnews) {
		int nid = dbNewsMapper.addNews(dbnews);
		return new CarResult(nid);
	}

	public PageResult selectAll(Integer page) {
		if (page == null || page < 1) {
			page = 1;
		}

		PageHelper.startPage(page, Const.PAGE);
		List<DbNews> list = dbNewsMapper.selectAll();
		PageResult result = new PageResult();
		result.setRows(list);
		PageInfo<DbNews> pageInfo = new PageInfo<DbNews>(list);
		result.setTotal(pageInfo.getTotal());
		return result;
	}

	public CarResult deleteByNid(Integer nid, HttpServletRequest request) {
		// 删除图片
		DbNews selectByNid = dbNewsMapper.selectByNid(nid);
		// 遍历内容
		String ncontent = selectByNid.getNcontent();

		// 过滤出这个字段中的内容然后删除
		List<String> imageSrc = ImageUtils.getImageSrc(ncontent);
		// 添加封面图
		if (imageSrc == null) {
			dbNewsMapper.deleteByNid(nid);
			return CarResult.ok();
		}
		if (selectByNid.getImage() != null && !selectByNid.getImage().isEmpty()) {
			imageSrc.add(selectByNid.getImage());
		}
		ImageUtils.deleteImages(imageSrc, request);
		dbNewsMapper.deleteByNid(nid);
		return CarResult.ok();
	}

	public CarResult updateNews(DbNews dbnews, HttpServletRequest request) {
		// 获取旧的新闻
		DbNews selectByNid = dbNewsMapper.selectByNid(dbnews.getNid());
		// 遍历内容
		String ncontent = selectByNid.getNcontent();

		// 获取旧的图片地址
		List<String> old = ImageUtils.getImageSrc(ncontent);

		// 新的图片地址
		List<String> news = ImageUtils.getImageSrc(dbnews.getNcontent());

		List<String> dele = new ArrayList<String>();
		for (int i = 0; i < old.size(); i++) {
			if (!news.contains(old.get(i))) {
				dele.add(old.get(i));
			}
		}
		ImageUtils.deleteImages(dele, request);
		dbNewsMapper.updateNews(dbnews);
		return CarResult.ok();
	}

	public CarResult updateImage(String url, int nid, String path) {
		DbNews selectByNid = dbNewsMapper.selectByNid(nid);
		if (selectByNid.getImage() != null && !selectByNid.getImage().isEmpty()) {
			MyFileUtils.deleteFile(path, selectByNid.getImage());
		}
		Map map = new HashMap<String, Object>();
		map.put("url", url);
		map.put("nid", nid);
		dbNewsMapper.updateImage(map);
		return CarResult.ok();
	}

	public CarResult selectByNid(Integer nid) {
		DbNews news = dbNewsMapper.selectByNid(nid);
		return new CarResult(news);
	}
}
