package com.xawl.car.service;

import java.util.Map;

import com.xawl.car.pojo.DbHome;
import com.xawl.car.utils.CarResult;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Administrator on 2017/1/2.
 */
public interface HomeService {
    CarResult getall();

    CarResult insertHome(DbHome dbHome);

    CarResult deleteHome(Integer hid, HttpServletRequest request);

    CarResult updateHome(DbHome dbHome);	
    //获取所有orders为1 type为0的DbHome 的list集合
	CarResult getAll(Map<String, Integer> map);
}
