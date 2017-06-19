package com.xawl.car.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xawl.car.mapper.DbCommentMapper;
import com.xawl.car.pojo.DbComment;
import com.xawl.car.service.CommentService;
import com.xawl.car.utils.CarResult;
import com.xawl.car.utils.Const;
import com.xawl.car.utils.PageResult;

@Service
public class CommentServiceImpl implements CommentService {

	@Autowired
	DbCommentMapper commentMapper;

	@Override
	public PageResult getAll(Integer page) {
		if (page == null) {
			page = 1;
		}
		PageHelper.startPage(page, Const.PAGE);
		List<DbComment> list = commentMapper.selectAll();
		PageResult result = new PageResult();
		result.setRows(list);
		PageInfo<DbComment> pageInfo = new PageInfo<DbComment>(list);
		result.setTotal(pageInfo.getTotal());
		return result;
	}

	@Override
	public CarResult delete(Integer id) {
		commentMapper.delete(id);
		return new CarResult().ok();
	}

}
