package com.xawl.car.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xawl.car.pojo.DbModel;
import com.xawl.car.service.ModelService;
import com.xawl.car.utils.CarResult;
import com.xawl.car.utils.PageResult;

/**
 * Created by Administrator on 2016/12/15.
 */
@Controller
@RequestMapping("/model")
public class ModelContorller {

    @Autowired
    private ModelService modelService;

    /**
     * 通过gid获取所有model
     *
     * @return
     */
    @RequestMapping("/getall.action")
    @ResponseBody
    public CarResult getModelsByGid(Integer gid, Integer page) {
        PageResult result = modelService.getModelsByGid(gid, page);
        return CarResult.ok(result);
    }

    /**
     * 通过mid删除
     *
     * @param mid
     * @return
     */
    @RequestMapping("/delete.action")
    @ResponseBody
    public CarResult deleteModel(Integer mid,HttpServletRequest request) {
        CarResult result = modelService.deleteModel(mid,request);
        return result;
    }

    @RequestMapping("/add.action")
    @ResponseBody
    public CarResult insertModel(DbModel dbModel) {
        CarResult result = modelService.insertModel(dbModel);
        return result;
    }


    @RequestMapping("/update.action")
    @ResponseBody
    public CarResult updateModel(DbModel dbModel) {
        CarResult result = modelService.updateModel(dbModel);
        return result;
    }


}
