package com.xawl.car.service;

import javax.servlet.http.HttpServletRequest;

import com.xawl.car.pojo.DbModel;
import com.xawl.car.utils.CarResult;
import com.xawl.car.utils.PageResult;

/**
 * Created by Administrator on 2016/12/15.
 */

public interface ModelService {

    PageResult getModelsByGid(Integer gid, Integer page);

    CarResult deleteModel(Integer mid, HttpServletRequest request);

    CarResult insertModel(DbModel dbModel);

    CarResult updateModel(DbModel dbModel);
}
