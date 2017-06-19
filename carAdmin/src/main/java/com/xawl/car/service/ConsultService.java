package com.xawl.car.service;

import java.util.List;

import com.xawl.car.pojo.DbConsult;
import com.xawl.car.utils.CarResult;
import com.xawl.car.utils.PageResult;

public interface ConsultService {
	PageResult findConsult(Integer page, int status);

	CarResult delete(Integer cid);

	void updateStatus(Integer cid);
}
