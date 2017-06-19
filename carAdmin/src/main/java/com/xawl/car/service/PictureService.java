package com.xawl.car.service;

import com.xawl.car.pojo.DbHome;
import com.xawl.car.utils.CarResult;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * Created by Administrator on 2016/12/17.
 */
public interface PictureService {
    /**
     * 上传图片
     * @param uploadFile
     * @return
     */
    Map uploadPicture(MultipartFile uploadFile,Integer id,String idName,Integer iid, HttpServletRequest request);

    /**
     * 上传主图
     * @param uploadFile
     * @return
     */
    Map uploadPicture(MultipartFile uploadFile,HttpServletRequest request);

    /**
     * 根据文件名删除图片
     * @param imageName
     * @return
     */
    CarResult dropImage(String imageName);

    /***
     * execl参数
     * @param execlFile
     * @return
     */
    CarResult uploadExecl(MultipartFile execlFile,Integer mid);

    Map updateUpload(MultipartFile uploadFile, String imageName,HttpServletRequest request);

    Map uploadHomeImage(MultipartFile uploadFile, DbHome dbHome, HttpServletRequest request);

    CarResult deleteCarouselImage(Integer iid, HttpServletRequest request);

}
