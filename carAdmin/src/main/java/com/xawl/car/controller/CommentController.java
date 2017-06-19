package com.xawl.car.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xawl.car.pojo.DbComment;
import com.xawl.car.service.CommentService;
import com.xawl.car.utils.CarResult;
import com.xawl.car.utils.PageResult;

@Controller
public class CommentController {

	@Autowired
	private CommentService commentService;

	@RequestMapping("/comment/getAll")
	@ResponseBody
	public PageResult getAll(Integer page) {
		PageResult all = commentService.getAll(page);
		return all;
	}

	@RequestMapping("/comment/del")
	@ResponseBody
	public CarResult getAll2(Integer id) {
		CarResult car = commentService.delete(id);
		return car;
	}

}
