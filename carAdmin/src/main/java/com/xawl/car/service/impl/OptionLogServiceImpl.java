package com.xawl.car.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xawl.car.mapper.OptionLogMapper;
import com.xawl.car.pojo.OptionLog;
import com.xawl.car.service.OptionLogService;

@Service
public class OptionLogServiceImpl implements OptionLogService {
	@Autowired
	private OptionLogMapper optionLogMapperion;

	public void insert(OptionLog log) {
		optionLogMapperion.insertLog(log);
	}
}
