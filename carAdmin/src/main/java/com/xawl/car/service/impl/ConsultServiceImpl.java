package com.xawl.car.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xawl.car.mapper.DbConsultMappers;
import com.xawl.car.pojo.DbConsult;
import com.xawl.car.service.ConsultService;
import com.xawl.car.utils.CarResult;
import com.xawl.car.utils.Const;
import com.xawl.car.utils.PageResult;

@Service
public class ConsultServiceImpl implements ConsultService {

	@Autowired
	DbConsultMappers dbConsultMappers;

	public PageResult findConsult(Integer page, int status) {
		if (page == null || page < 1) {
			page = 1;
		}
		PageHelper.startPage(page, Const.PAGE);
		List<DbConsult> list = dbConsultMappers.findConsult(status);
		PageResult result = new PageResult();
		result.setRows(list);
		PageInfo<DbConsult> pageInfo = new PageInfo<DbConsult>(list);
		result.setTotal(pageInfo.getTotal());
		return result;
	}

	@Override
	public CarResult delete(Integer cid) {
		dbConsultMappers.delete(cid);
		return new CarResult().ok();
	}

	@Override
	public void updateStatus(Integer cid) {
		dbConsultMappers.updateStatus(cid);
	}

}
