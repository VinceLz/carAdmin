package com.xawl.car.mapper;

import java.util.List;
import java.util.Map;

import com.xawl.car.pojo.DbNews;

public interface DbNewsMapper {
	int addNews(DbNews dbNews);
	
	List<DbNews> selectByCid(Integer cid);
	
	List<DbNews> selectAll();
	
	int deleteByNid(Integer nid);
	
	int updateNews(DbNews dbNews);

	void updateImage(Map map);

	DbNews selectByNid(Integer nid);
} 
