package com.xawl.car.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.apache.http.util.TextUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xawl.car.mapper.DbHomeMapper;
import com.xawl.car.pojo.DbHome;
import com.xawl.car.pojo.DbHomeExample;
import com.xawl.car.pojo.HomeVo;
import com.xawl.car.service.HomeService;
import com.xawl.car.utils.CarResult;
import com.xawl.car.utils.IOUtils;

/**
 * Created by Administrator on 2017/1/2.
 */
@Service
public class HomeServiceImpl implements HomeService {

    @Autowired
    private DbHomeMapper dbHomeMapper;

    public CarResult getall() {
        DbHomeExample example = new DbHomeExample();
        DbHomeExample.Criteria criteria = example.createCriteria();
        criteria.andOrdersEqualTo((byte) 0);
        List<DbHome> list = dbHomeMapper.selectByExample(example);
        ArrayList<HomeVo.HomeImageBean> homeImage = new ArrayList<HomeVo.HomeImageBean>();
        ArrayList<HomeVo.HomeImageBean> selectImage = new ArrayList<HomeVo.HomeImageBean>();
        ArrayList<HomeVo.HeadLineBean> headLine = new ArrayList<HomeVo.HeadLineBean>();
        for (DbHome dbHome : list) {
            Byte type = dbHome.getType();
            if (type == (byte) 0) {
                HomeVo.HomeImageBean homeImageBean = new HomeVo.HomeImageBean(dbHome.getHid(), dbHome.getImage(), dbHome.getUrl());
                homeImage.add(homeImageBean);
            } else if (type == (byte) 2) {
                HomeVo.HomeImageBean homeImageBean = new HomeVo.HomeImageBean(dbHome.getHid(), dbHome.getImage(), dbHome.getUrl());
                selectImage.add(homeImageBean);
            } else if (type == (byte) 1) {
                HomeVo.HeadLineBean headLineBean = new HomeVo.HeadLineBean(dbHome.getHid(), dbHome.getTitle(), dbHome.getUrl());
                headLine.add(headLineBean);
            }
        }
        HomeVo homeVo = new HomeVo(homeImage, selectImage, headLine);
        return CarResult.ok(homeVo);
    }

    public CarResult insertHome(DbHome dbHome) {
        try {
            dbHome.setDate(new Date());
            dbHome.setIshot(1);
            dbHomeMapper.insert(dbHome);
            return CarResult.ok();
        } catch (Exception e) {
            e.printStackTrace();
            return CarResult.build(500, "失败");
        }
    }

    public CarResult deleteHome(Integer hid, HttpServletRequest request) {
        try {
            DbHome dbHome = dbHomeMapper.selectByPrimaryKey(hid);
            String image = dbHome.getImage();
            //对图片进行删除
            if (!TextUtils.isEmpty(image)) {
                ServletContext sc = request.getSession().getServletContext();
                String path = sc.getRealPath("img") + "/";
                String[] split = image.split("/");
                path += split[split.length - 1];
                IOUtils.deleteLocalFile(path);
            }
            dbHomeMapper.deleteByPrimaryKey(hid);
            return CarResult.ok();
        } catch (Exception e) {
            e.printStackTrace();
            return CarResult.build(500, "失败");
        }
    }

    public CarResult updateHome(DbHome dbHome) {
        try {
            dbHomeMapper.updateByPrimaryKeySelective(dbHome);
            return CarResult.ok();
        } catch (Exception e) {
            e.printStackTrace();
            return CarResult.build(500, "失败");
        }
    }

	public CarResult getAll(Map map) {
		List<DbHome> list=dbHomeMapper.selectAll(map);
		CarResult carResult =new CarResult();
		carResult.setData(list);
		
		return carResult;
	}
}
