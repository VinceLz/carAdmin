package com.xawl.car.controller;

import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xawl.car.pojo.DbGoods;
import com.xawl.car.service.GoodsService;
import com.xawl.car.utils.CarResult;
import com.xawl.car.utils.PageResult;

/**
 * Created by Administrator on 2016/12/15.
 */

@Controller
@RequestMapping("/goods")
public class GoodsController {

	@Autowired
	private GoodsService goodsService;

	/**
	 * 通过bid获取所有goods
	 *
	 * @return
	 */
	@RequestMapping("/getall.action")
	@ResponseBody
	public CarResult getGoodsByBid(Integer bid, Integer page) {
		PageResult result = goodsService.getGoodsByBid(bid, page);
		return CarResult.ok(result);
	}

	/**
	 * 通过gid删除
	 *
	 * @param gid
	 * @return
	 */
	@RequestMapping("/delete.action")
	@ResponseBody
	public CarResult deleteGoods(Integer gid, HttpServletRequest request) {
		CarResult result = goodsService.deleteGoods(gid, request);
		return result;
	}

	@RequestMapping("/add.action")
	@ResponseBody
	public CarResult insertGoods(DbGoods dbGoods) {
		CarResult result = goodsService.insertGoods(dbGoods);
		return result;
	}

	@RequestMapping("/update.action")
	@ResponseBody
	public CarResult updateGoods(DbGoods dbGoods) {
		CarResult result = goodsService.updateGoods(dbGoods);
		return result;
	}

	// 根据gid查询的数据更改bid后插入一条新数据
	@RequestMapping("/addNewBidGoods.action")
	@ResponseBody
	public CarResult addNewBidGoods(@RequestParam() Integer gid,
			@RequestParam() Integer bid, HttpServletRequest request) {
		CarResult result = goodsService.addNewBidGoods(gid, bid, request);
		return result;
	}

	// 先 拿到年 月 2017-12 impteDatefrom("yyyy-mm);
	// File file=new File(xxx);
	// 判断这葛文件是否存在
	//

	// 根据gname进行模糊查询gname%
	@RequestMapping("/getLikeGname.action")
	@ResponseBody
	public CarResult getLikeGname(String gname, HttpServletRequest request,
			HttpServletResponse response) throws UnsupportedEncodingException {
		request.setCharacterEncoding("utf-8");
		List<DbGoods> list = goodsService.getLikeGname(gname);
		CarResult result = new CarResult(list);
		return result;
	}

}
