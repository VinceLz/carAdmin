package com.xawl.car.mapper;

import java.util.List;
import java.util.Map;

import com.xawl.car.pojo.DbYcOrder;

public interface DbYcOrderMapper {

	public List<DbYcOrder> selectYcOreder(Map map) ;

	public List<DbYcOrder> getOrder(String goodid);

	public void updateStat(Map map);

	public List<DbYcOrder> getAll();

	public void updateStatById(String yoid);
}
