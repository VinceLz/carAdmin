package com.xawl.car.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xawl.car.pojo.DbBackgroudErr;
import com.xawl.car.service.BackgroudErrService;

@Controller
@RequestMapping("/Error")
public class BackgroudErrContorller {
	@Autowired
	BackgroudErrService backgroudErrService;
	
	public void insertMessage(DbBackgroudErr dbBackgroudErr){
		backgroudErrService.insertMessage(dbBackgroudErr);
	}
}
