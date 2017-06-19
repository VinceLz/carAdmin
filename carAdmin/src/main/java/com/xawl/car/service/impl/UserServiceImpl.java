package com.xawl.car.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xawl.car.mapper.DbUserMapper;
import com.xawl.car.pojo.DbBuser;
import com.xawl.car.pojo.DbUser;
import com.xawl.car.service.UserService;
import com.xawl.car.utils.CarResult;
import com.xawl.car.utils.Const;
import com.xawl.car.utils.PageResult;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	DbUserMapper dbUserMapper;

	public PageResult findAll(Integer page) {
		if (page == null) {
			page = 1;
		}
		PageHelper.startPage(page, Const.PAGE);
		List<DbUser> list = dbUserMapper.selectAll();
		PageResult result = new PageResult();
		result.setRows(list);
		PageInfo<DbUser> pageInfo = new PageInfo<DbUser>(list);
		result.setTotal(pageInfo.getTotal());
		return result;
	}

	public CarResult delete(Integer uid) {
		dbUserMapper.deleteByUid(uid);
		return CarResult.ok();
	}

	public CarResult stopUser(Integer uid) {
		DbUser selectByUid = dbUserMapper.selectByUid(uid);

		if (selectByUid.getStatus() == 1) {
			dbUserMapper.stopUserByUid(uid);
		} else {
			dbUserMapper.startUserByUid(uid);
		}

		return CarResult.ok();
	}

	public CarResult findByUid(Integer uid) {
		CarResult carResult = new CarResult(dbUserMapper.selectByUid(uid));
		return CarResult.ok();
	}

}
