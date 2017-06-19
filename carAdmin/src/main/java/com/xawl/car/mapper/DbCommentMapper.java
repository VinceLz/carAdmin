package com.xawl.car.mapper;

import java.util.List;

import com.xawl.car.pojo.DbComment;


public interface DbCommentMapper {
	List<DbComment> selectAll();

	void delete(Integer id);



	
}