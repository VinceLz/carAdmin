package com.xawl.car.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xawl.car.pojo.DbRollUser;
import com.xawl.car.service.RollUserService;
import com.xawl.car.utils.CarResult;

@Controller
@RequestMapping("/RollUser")
public class RollUserContorller {
	@Autowired
	RollUserService rollUserService;

	@RequestMapping("/findByUid.action")
	@ResponseBody
	public CarResult findByUid(Integer uid) {
		CarResult carResult = rollUserService.selectByUid(uid);
		return carResult;
	}

	@RequestMapping("/add.action")
	@ResponseBody
	public CarResult add(Integer uid, Integer rid) {
		DbRollUser dbRollUser = new DbRollUser();
		dbRollUser.setUid(uid);
		dbRollUser.setRid(rid);
		CarResult carResult = rollUserService.addRoll(dbRollUser);
		return carResult;
	}
}
