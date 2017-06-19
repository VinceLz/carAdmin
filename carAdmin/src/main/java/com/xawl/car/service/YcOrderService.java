package com.xawl.car.service;

import java.util.List;
import java.util.Map;

import com.xawl.car.pojo.DbYcOrder;
import com.xawl.car.utils.PageResult;

public interface YcOrderService {

	public PageResult selectYcOreder(Integer status, Integer page, Integer type);

	public List<DbYcOrder> getOrder(String goodid);

	public void updateStat(Map map);

	public List<DbYcOrder> getAll();

	public void updateStatById(String yoid);
}
