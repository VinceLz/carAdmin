package com.xawl.car.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.xawl.car.pojo.DbGoods;
import com.xawl.car.utils.CarResult;
import com.xawl.car.utils.PageResult;

/**
 * Created by Administrator on 2016/12/15.
 */

public interface GoodsService {

    PageResult getGoodsByBid(Integer bid, Integer page);

    CarResult deleteGoods(Integer gid, HttpServletRequest request);
    CarResult deleteGoods(Integer gid,String path);

    CarResult insertGoods(DbGoods dbGoods);

    CarResult updateGoods(DbGoods dbGoods);

	DbGoods findByGid(Integer gid);

	List<DbGoods> getLikeGname(String gname);

	CarResult addNewBidGoods(Integer gid, Integer bid, HttpServletRequest request);
}
