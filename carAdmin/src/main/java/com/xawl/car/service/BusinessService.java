package com.xawl.car.service;

import javax.servlet.http.HttpServletRequest;

import com.xawl.car.pojo.DbBusiness;
import com.xawl.car.utils.CarResult;
import com.xawl.car.utils.PageResult;

/**
 * Created by Administrator on 2016/12/15.
 */

public interface BusinessService {
    PageResult getAll(Integer pages);

    CarResult insertBusiness(DbBusiness dbBusiness);

    CarResult updateBusiness(DbBusiness dbBusiness);

    CarResult deleteBusiness(Integer bid, HttpServletRequest request);

}
