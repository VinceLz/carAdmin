package com.xawl.car.controller;

import com.xawl.car.pojo.DbRollGrant;
import com.xawl.car.service.RollGrantService;
import com.xawl.car.utils.CarResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Administrator on 2017/4/4.
 */
@Controller
@RequestMapping("/rollgrant")
public class RollGrantContorller {

    @Autowired
    private RollGrantService rollGrantService;

    @RequestMapping("/getall.action")
    @ResponseBody
    public CarResult getRollAll() {
        CarResult result = rollGrantService.getAllRollGrant();
        return result;
    }

    @RequestMapping("/update.action")
    @ResponseBody
    public CarResult updateRollGrant(DbRollGrant dbRollGrant) {
        CarResult result = rollGrantService.updateRollGrant(dbRollGrant);
        return result;
    }

}
