package com.xawl.car.mapper;

import java.util.List;
import java.util.Map;

import com.xawl.car.pojo.DbConsult;

public interface DbConsultMappers {

	List<DbConsult> findConsult(Integer page);

	void delete(Integer cid);

	void updateStatus(Integer cid);

}
