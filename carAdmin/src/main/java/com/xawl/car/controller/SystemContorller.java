package com.xawl.car.controller;

import com.xawl.car.pojo.DbSystem;
import com.xawl.car.service.SystemService;
import com.xawl.car.utils.CarResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Administrator on 2017/1/2.
 */
@Controller
@RequestMapping("/system")
public class SystemContorller {

    @Autowired
    private SystemService systemService;


    @RequestMapping("/getall.action")
    @ResponseBody
    public CarResult getSystems(){
        CarResult result = systemService.getSystem();
        return result;
    }


    @RequestMapping("/update.action")
    @ResponseBody
    public CarResult updateSystems(DbSystem dbSystem){
        CarResult result = systemService.updateSystem(dbSystem);
        return result;
    }
}
