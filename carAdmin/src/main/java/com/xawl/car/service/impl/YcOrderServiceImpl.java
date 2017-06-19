package com.xawl.car.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xawl.car.mapper.DbYcOrderMapper;
import com.xawl.car.pojo.DbYcOrder;
import com.xawl.car.service.YcOrderService;
import com.xawl.car.utils.CarResult;
import com.xawl.car.utils.Const;
import com.xawl.car.utils.PageResult;

@Service
public class YcOrderServiceImpl implements YcOrderService {

	@Autowired
	DbYcOrderMapper dbYcOrderMapper;

	public PageResult selectYcOreder(Integer status, Integer page, Integer type) {
		if (page == null || page < 1) {
			page = 1;
		}
		PageHelper.startPage(page, Const.PAGE);
		Map map = new HashMap<String, String>();
		map.put("status", status);
		map.put("type", type);
		List<DbYcOrder> list = (List<DbYcOrder>) dbYcOrderMapper
				.selectYcOreder(map);
		PageResult result = new PageResult();
		result.setRows(list);
		PageInfo<DbYcOrder> pageInfo = new PageInfo<DbYcOrder>(list);
		result.setTotal(pageInfo.getTotal());
		return result;
	}

	public List<DbYcOrder> getOrder(String goodid) {
		return dbYcOrderMapper.getOrder(goodid);
	}

	public void updateStat(Map map) {
		dbYcOrderMapper.updateStat(map);
	}

	@Override
	public List<DbYcOrder> getAll() {
		return dbYcOrderMapper.getAll();
	}

	@Override
	public void updateStatById(String yoid) {
		dbYcOrderMapper.updateStatById(yoid);
	}

}
