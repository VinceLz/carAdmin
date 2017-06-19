package com.xawl.car.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xawl.car.mapper.DbBackgroudErrMapper;
import com.xawl.car.pojo.DbBackgroudErr;
import com.xawl.car.service.BackgroudErrService;
@Service
public class BackgroudErrServiceImpl implements BackgroudErrService {
	@Autowired
	DbBackgroudErrMapper DbBackgroudErrMapper;
	
	public void insertMessage(DbBackgroudErr dbBackgroudErr) {
		DbBackgroudErrMapper.insertMessage(dbBackgroudErr);
	}

}
