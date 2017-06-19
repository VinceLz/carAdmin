package com.xawl.car.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xawl.car.pojo.DbNewCatalog;
import com.xawl.car.service.NewCatalogService;
import com.xawl.car.utils.CarResult;

@Controller
@RequestMapping("/NewCatalog")
public class NewCatalogContorller {

	@Autowired
	NewCatalogService newCatalogService;

	@RequestMapping("/selectAll.action")
	@ResponseBody
	public CarResult selectAll() {
		CarResult carResult = newCatalogService.selectAll();
		return carResult;
	}
	
	@RequestMapping("/selectBycid.action")
	@ResponseBody
	public CarResult selectBycid(Integer cid) {

		CarResult carResult = newCatalogService.selectBycid(cid);
		return carResult;
	}

	@RequestMapping("/addNewCatalog.action")
	@ResponseBody
	public CarResult addNewCatalog(DbNewCatalog dbNewCatalog) {

		CarResult carResult = newCatalogService.addNewCatalog(dbNewCatalog);
		return carResult;
	}

	@RequestMapping("/updateNewCatalog.action")
	@ResponseBody
	public CarResult updateNewCatalog(DbNewCatalog dbNewCatalog) {

		CarResult carResult = newCatalogService.updateNewCatalog(dbNewCatalog);
		return carResult;
	}

	@RequestMapping("/delete.action")
	@ResponseBody
	public CarResult delete(Integer catid,HttpServletRequest request) {
		CarResult carResult = newCatalogService.delete(catid,request);
		return carResult;
	}

}
