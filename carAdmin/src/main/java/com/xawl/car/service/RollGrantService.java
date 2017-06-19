package com.xawl.car.service;

import com.xawl.car.pojo.DbRollGrant;
import com.xawl.car.utils.CarResult;

/**
 * Created by Administrator on 2017/4/4.
 */
public interface RollGrantService {
    CarResult updateRollGrant(DbRollGrant dbRollGrant);

    CarResult getAllRollGrant();
}
