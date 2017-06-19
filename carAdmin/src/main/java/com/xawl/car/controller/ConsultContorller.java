package com.xawl.car.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xawl.car.service.ConsultService;
import com.xawl.car.utils.CarResult;
import com.xawl.car.utils.PageResult;

@Controller
@RequestMapping("/consult")
public class ConsultContorller {
	@Autowired
	ConsultService consultService;

	/**
	 * 
	 * @param page
	 *            分页
	 * @param beginDate
	 *            开始查询日期
	 * @param endDate
	 *            结束查询日期
	 * @param request
	 * @param response
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/findAll.action")
	public PageResult findConsult(Integer page, int status) {
		PageResult findConsult = consultService.findConsult(page, status);
		return findConsult;

	}

	@ResponseBody
	@RequestMapping("/del.action")
	public CarResult del(Integer cid) {
		return consultService.delete(cid);
	}

	@ResponseBody
	@RequestMapping("/ok.action")
	public CarResult consult_ok(Integer cid) {
		consultService.updateStatus(cid);
		return new CarResult().ok();
	}
}
