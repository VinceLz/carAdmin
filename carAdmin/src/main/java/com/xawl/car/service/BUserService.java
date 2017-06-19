package com.xawl.car.service;

import com.xawl.car.pojo.DbBuser;
import com.xawl.car.utils.CarResult;

/**
 * Created by Administrator on 2017/3/25.
 */
public interface BUserService {

    CarResult login(DbBuser buser);


    CarResult addUser(DbBuser buser);
}
