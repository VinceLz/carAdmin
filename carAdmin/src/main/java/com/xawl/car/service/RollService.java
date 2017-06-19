package com.xawl.car.service;

import com.xawl.car.pojo.DbRoll;
import com.xawl.car.utils.CarResult;

/**
 * Created by Administrator on 2017/4/4.
 */
public interface RollService {
    CarResult getRollAll();

    CarResult deleteRoll(Integer rid);

    CarResult insertRoll(DbRoll dbRoll);

    CarResult updateRoll(DbRoll dbRoll);



}
