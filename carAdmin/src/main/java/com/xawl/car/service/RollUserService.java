package com.xawl.car.service;

import java.util.Map;

import com.xawl.car.pojo.DbRollUser;
import com.xawl.car.utils.CarResult;

public interface RollUserService {
	CarResult selectByUid(Integer uid);

	CarResult addRoll(DbRollUser dbRollUser);
}
