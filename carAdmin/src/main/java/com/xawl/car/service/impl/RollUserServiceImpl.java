package com.xawl.car.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xawl.car.mapper.DbRollUserMapper;
import com.xawl.car.pojo.DbRollUser;
import com.xawl.car.pojo.DbRollUserVo;
import com.xawl.car.service.RollUserService;
import com.xawl.car.utils.CarResult;
import com.xawl.car.utils.DateUtil;

@Service
public class RollUserServiceImpl implements RollUserService {

	@Autowired
	DbRollUserMapper dbRollUserVoMapper;

	public CarResult selectByUid(Integer uid) {
		List<DbRollUserVo> list = dbRollUserVoMapper.selectByUid(uid);
		return new CarResult(list);
	}

	@Override
	public CarResult addRoll(DbRollUser dbRollUser) {
		dbRollUser.setCreatedate(DateUtil.getSqlDate());
		dbRollUser.setPastdate(DateUtil.getSqlDate2addMouth(1));
		dbRollUser.setStatus(0);
		dbRollUserVoMapper.addaddRoll(dbRollUser);
		return new CarResult().ok();
	}

}
