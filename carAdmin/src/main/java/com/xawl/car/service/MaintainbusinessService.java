package com.xawl.car.service;

import com.xawl.car.pojo.DbMaintainbusiness;
import com.xawl.car.utils.CarResult;
import com.xawl.car.utils.PageResult;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Administrator on 2017/3/22.
 */
public interface MaintainbusinessService {
    PageResult getAll(Integer page);

    CarResult insertDbMaintainbusiness(DbMaintainbusiness dbMaintainbusiness);

    CarResult deleteDbMaintainbusiness(Integer mbid, HttpServletRequest request);

    CarResult updateDbMaintainbusiness(DbMaintainbusiness dbMaintainbusiness);

//	CarResult updateDbMaintainbusinessPassWord(Integer mid);
}
