package com.xawl.car.controller;


import com.xawl.car.pojo.DbHome;
import com.xawl.car.service.PictureService;
import com.xawl.car.utils.CarResult;
import com.xawl.car.utils.JsonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * Created by xuzi on 9/23/2016.
 */
@Controller
public class PictureController {
    @Autowired
    private PictureService pictureService;

    /**
     * 轮播图接口
     *
     * @param uploadFile
     * @param id
     * @param idName
     * @param iid
     * @return
     */
    @RequestMapping("/images/upload.action")
    @ResponseBody
    public String pictureUpload(MultipartFile uploadFile, Integer id, String idName, Integer iid, HttpServletRequest request) {
        System.out.print("xuzi" + id + "  " + idName + "  " + iid + uploadFile);
        Map map = pictureService.uploadPicture(uploadFile, id, idName, iid, request);
        String s = JsonUtils.objectToJson(map);
        return s;
    }


    /**
     * 轮播图删除接口
     *
     * @param iid
     * @param request
     * @return
     */
    @RequestMapping("/images/delete.action")
    @ResponseBody
    public CarResult deleteCarouselImage(Integer iid, HttpServletRequest request) {
        CarResult result = pictureService.deleteCarouselImage(iid, request);
        return result;
    }

    /**
     * 上传主图
     *
     * @param uploadFile
     * @return
     */
    @RequestMapping("/simage/upload.action")
    @ResponseBody
    public String pictureUpload(MultipartFile uploadFile, HttpServletRequest request) {
        System.out.print(uploadFile);
        Map map = pictureService.uploadPicture(uploadFile, request);
        String s = JsonUtils.objectToJson(map);
        return s;
    }

    /**
     * 修改主图
     *
     * @param uploadFile
     * @param imageName
     * @return
     */
    @RequestMapping("/update/image.action")
    @ResponseBody
    public String updateImage(MultipartFile uploadFile, String imageName, HttpServletRequest request) {
        System.out.print("xuzi" + imageName);
        Map map = pictureService.updateUpload(uploadFile, imageName, request);
        String s = JsonUtils.objectToJson(map);
        return s;
    }


    @RequestMapping("/pic/delete")
    @ResponseBody
    public CarResult dropImage(String imageName) {
        CarResult result = pictureService.dropImage(imageName);
        return result;
    }

    @RequestMapping("/execl/upload.action")
    @ResponseBody
    public CarResult uploadExecl(MultipartFile execlFile, Integer mid) {
        CarResult result = pictureService.uploadExecl(execlFile, mid);
        return result;
    }

    /**
     * 上传首页和搜索界面轮播图
     *
     * @param uploadFile
     * @return
     */
    @RequestMapping("/home/upload.action")
    @ResponseBody
    public String uploadHomeImage(MultipartFile uploadFile, DbHome dbHome, HttpServletRequest request) {
        Map map = pictureService.uploadHomeImage(uploadFile, dbHome, request);
        String s = JsonUtils.objectToJson(map);
        return s;
    }

}
