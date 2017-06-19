package com.xawl.car.controller;

import com.xawl.car.pojo.DbMaintainbusiness;
import com.xawl.car.service.MaintainbusinessService;
import com.xawl.car.utils.CarResult;
import com.xawl.car.utils.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Administrator on 2017/3/22.
 */
@RequestMapping("/maintainbusiness")
@Controller
public class MaintainbusinessContorller {

	@Autowired
	private MaintainbusinessService maintainbusinessService;

	@RequestMapping("/getall.action")
	@ResponseBody
	public PageResult getAll(Integer page) {
		PageResult result = maintainbusinessService.getAll(page);
		return result;
	}

	@RequestMapping(value = "/add.action", method = RequestMethod.POST)
	@ResponseBody
	public CarResult addHome(DbMaintainbusiness dbMaintainbusiness) {
		CarResult result = maintainbusinessService
				.insertDbMaintainbusiness(dbMaintainbusiness);
		return result;
	}

	@RequestMapping("/delete.action")
	@ResponseBody
	public CarResult deleteHome(Integer mbid, HttpServletRequest request) {
		CarResult result = maintainbusinessService.deleteDbMaintainbusiness(
				mbid, request);
		return result;
	}

	@RequestMapping(value = "/update.action")
	@ResponseBody
	public CarResult updateHome(DbMaintainbusiness dbMaintainbusiness) {
		CarResult result = maintainbusinessService
				.updateDbMaintainbusiness(dbMaintainbusiness);
		
		return result;
	}
//	@RequestMapping(value = "/updateMPass.action")
//	@ResponseBody
//	public CarResult updateMPass(Integer mbid) {
//		CarResult result = maintainbusinessService.updateDbMaintainbusinessPassWord(mbid);
//		return result;
//	}
	

}
