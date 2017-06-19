package com.xawl.car.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xawl.car.pojo.DbBusiness;
import com.xawl.car.service.BusinessService;
import com.xawl.car.utils.CarResult;
import com.xawl.car.utils.PageResult;

/**
 * Created by Administrator on 2016/12/15.
 */
@Controller
@RequestMapping("/business")
public class BusinessContorller {
    @Autowired
    private BusinessService businessService;

    /**
     * 获取所有business
     *
     * @return
     */
    @RequestMapping("/getall.action")
    @ResponseBody
    public PageResult getBusiness(Integer page) {
        PageResult result = businessService.getAll(page);
        return result;
    }

    /**
     * 增加business
     *
     * @param dbBusiness
     * @return
     */
    @RequestMapping("/add.action")
    @ResponseBody
    public CarResult insertBusiness(DbBusiness dbBusiness) {
        System.out.print(dbBusiness.toString());
        CarResult result = businessService.insertBusiness(dbBusiness);
        return result;
    }

    /**
     * 修改
     *
     * @param dbBusiness
     * @return
     */
    @RequestMapping("/update.action")
    @ResponseBody
    public CarResult updateBusiness(DbBusiness dbBusiness) {
        CarResult result = businessService.updateBusiness(dbBusiness);
        return result;
    }

    /**
     * 通过bid删除
     *
     * @param bid
     * @return
     */
    @RequestMapping("/delete.action")
    @ResponseBody
    public CarResult deleteBusiness(Integer bid,HttpServletRequest request) {
        CarResult result = businessService.deleteBusiness(bid,request);
        return result;
    }

}
