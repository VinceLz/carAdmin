package com.xawl.car.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xawl.car.pojo.DbHome;
import com.xawl.car.service.HomeService;
import com.xawl.car.utils.CarResult;

/**
 * Created by Administrator on 2017/1/2.
 */
@Controller
@RequestMapping("/home")
public class HomeController {

    @Autowired
    private HomeService homeService;

    @RequestMapping("/getall.action")
    @ResponseBody
    public CarResult getall() {
        CarResult result = homeService.getall();
        return result;
    }
    //获取所有orders为1 type为0的DbHome 的list集合
    @RequestMapping("/getAll.action")
    @ResponseBody
    public CarResult getAll() {
    	Map<String,Integer> map=new HashMap<String, Integer>();
    	map.put("orders", 1);
    	map.put("type", 0);
        CarResult result = homeService.getAll(map);
        return result;
    }

    @RequestMapping("/add.action")
    @ResponseBody
    public CarResult addHome(DbHome dbHome) {
        CarResult result = homeService.insertHome(dbHome);
        return result;
    }

    @RequestMapping("/delete.action")
    @ResponseBody
    public CarResult deleteHome(Integer hid, HttpServletRequest request) {
        CarResult result = homeService.deleteHome(hid, request);
        return result;
    }

    @RequestMapping("/update.action")
    @ResponseBody
    public CarResult updateHome(DbHome dbHome) {
        CarResult result = homeService.updateHome(dbHome);
        return result;
    }
}
