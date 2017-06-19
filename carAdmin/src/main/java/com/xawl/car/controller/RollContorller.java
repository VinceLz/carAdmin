package com.xawl.car.controller;

import com.xawl.car.pojo.DbRoll;
import com.xawl.car.service.RollService;
import com.xawl.car.utils.CarResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Administrator on 2017/4/4.
 */
@Controller
@RequestMapping("/roll")
public class RollContorller {

    @Autowired
    private RollService rollService;

    //少字段
    @RequestMapping("/getall.action")
    @ResponseBody
    public CarResult getRollAll() {
        CarResult result = rollService.getRollAll();
        return result;
    }


    @RequestMapping("/delete.action")
    @ResponseBody
    public CarResult deleteRoll(Integer rid) {
        CarResult result = rollService.deleteRoll(rid);
        return result;
    }

    @RequestMapping("/add.action")
    @ResponseBody
    public CarResult insertRoll(DbRoll dbRoll) {
        CarResult result = rollService.insertRoll(dbRoll);
        return result;
    }


    @RequestMapping("/update.action")
    @ResponseBody
    public CarResult updateModel(DbRoll dbRoll) {
        CarResult result = rollService.updateRoll(dbRoll);
        return result;
    }


}
