package com.xawl.car.service;

import com.xawl.car.pojo.DbSystem;
import com.xawl.car.utils.CarResult;

/**
 * Created by Administrator on 2016/12/15.
 */

public interface SystemService {
    CarResult getSystem();

    CarResult updateSystem(DbSystem dbSystem);
}
