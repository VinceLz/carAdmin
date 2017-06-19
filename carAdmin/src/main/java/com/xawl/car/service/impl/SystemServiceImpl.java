package com.xawl.car.service.impl;

import com.xawl.car.mapper.DbSystemMapper;
import com.xawl.car.pojo.DbSystem;
import com.xawl.car.pojo.DbSystemExample;
import com.xawl.car.service.SystemService;
import com.xawl.car.utils.CarResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2016/12/15.
 */
@Service
public class SystemServiceImpl implements SystemService {

    @Autowired
    private DbSystemMapper dbSystemMapper;

    public CarResult getSystem() {
        DbSystemExample example = new DbSystemExample();
        DbSystemExample.Criteria criteria = example.createCriteria();
        List<DbSystem> list = dbSystemMapper.selectByExample(example);
        return CarResult.ok(list);
    }

    public CarResult updateSystem(DbSystem dbSystem) {
        try {
            dbSystemMapper.updateByPrimaryKeySelective(dbSystem);
            return CarResult.ok();
        }catch (Exception e){
            e.printStackTrace();
            return CarResult.build(500,"失败");
        }
    }
}
