package com.xawl.car.service;

import com.xawl.car.utils.CarResult;
import com.xawl.car.utils.PageResult;

public interface UserService {

	PageResult findAll(Integer page);

	CarResult delete(Integer uid);

	CarResult stopUser(Integer uid);

	CarResult findByUid(Integer uid);

}
