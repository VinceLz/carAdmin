package com.xawl.car.service.impl;

import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xawl.car.mapper.DbNewCatalogMapper;
import com.xawl.car.mapper.DbNewsMapper;
import com.xawl.car.pojo.DbNewCatalog;
import com.xawl.car.pojo.DbNews;
import com.xawl.car.service.NewCatalogService;
import com.xawl.car.utils.CarResult;
import com.xawl.car.utils.MyFileUtils;

@Service
public class NewCatalogServiceImpl implements NewCatalogService {
	@Autowired
	DbNewsMapper dbNewsMapper;

	@Autowired
	DbNewCatalogMapper dbNewCatalogMapper;

	public CarResult selectAll() {
		List<DbNewCatalog> list = dbNewCatalogMapper.selectAll();
		return new CarResult(list);
	}

	public CarResult addNewCatalog(DbNewCatalog dbNewCatalog) {
		dbNewCatalogMapper.addNewCatalog(dbNewCatalog);
		return CarResult.ok();
	}

	public CarResult updateNewCatalog(DbNewCatalog dbNewCatalog) {
		dbNewCatalogMapper.updateNewCatalog(dbNewCatalog);
		return CarResult.ok();
	}

	public CarResult delete(Integer catid, HttpServletRequest request) {
		ServletContext sc = request.getSession().getServletContext();
		final String path = sc.getRealPath("img") + "/";
		List<DbNews> list = dbNewsMapper.selectByCid(catid);
		for (DbNews dbNews : list) {
			if (dbNews.getImage() != null && !dbNews.getImage().isEmpty()) {
				String Name = dbNews.getImage().substring(
						dbNews.getImage().lastIndexOf("/"));
				MyFileUtils.deleteOneImage(Name, path);
			}
			dbNewsMapper.deleteByNid(dbNews.getNid());
		}
		dbNewCatalogMapper.delete(catid);
		return CarResult.ok();
	}

	public CarResult selectBycid(Integer cid) {
		CarResult carResule =new CarResult(dbNewCatalogMapper.selectBycatid(cid));
		return carResule;
	}

}
