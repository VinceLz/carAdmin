package com.xawl.car.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.xawl.car.service.UserService;
import com.xawl.car.service.YcOrderService;
import com.xawl.car.utils.CarResult;
import com.xawl.car.utils.PageResult;

@Controller
@RequestMapping("/user")
public class UserContorller {
	@Autowired
	UserService userService;

	@RequestMapping("/findAll.action")
	@ResponseBody
	public PageResult findAll(Integer page) {
		PageResult findAll = userService.findAll(page);
		return findAll;
	}

	@RequestMapping("/delete.action")
	@ResponseBody
	public CarResult delete(Integer uid) {
		CarResult carResult = userService.delete(uid);
		return carResult;
	}

	@RequestMapping("/stopUser.action")
	@ResponseBody
	public CarResult stopUser(Integer uid) {
		CarResult carResult = userService.stopUser(uid);
		return carResult;
	}
}
