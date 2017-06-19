package com.xawl.car.service.impl;

import com.xawl.car.mapper.DbBuserMapper;
import com.xawl.car.pojo.DbBuser;
import com.xawl.car.pojo.DbBuserExample;
import com.xawl.car.service.BUserService;
import com.xawl.car.utils.CarResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/3/25.
 */
@Service
public class BUserServiceImpl implements BUserService{

    @Autowired
    private DbBuserMapper dbBuserMapper;

    public CarResult login(DbBuser buser) {

        String busername = buser.getBuser();
        String bpassword = buser.getBpassword();
        DbBuserExample example = new DbBuserExample();
        DbBuserExample.Criteria criteria = example.createCriteria();
        criteria.andBuserEqualTo(busername);
        List<DbBuser> dbBusers = dbBuserMapper.selectByExample(example);
        if (dbBusers == null || dbBusers.size() <= 0){
            return CarResult.build(0,"用户名错误");
        }
        if (!bpassword.equals(dbBusers.get(0).getBpassword())){
            return CarResult.build(1,"密码错误");
        }

        return CarResult.ok();
    }

    public CarResult addUser(DbBuser buser) {
        try {
            String busername = buser.getBuser();
            DbBuserExample example = new DbBuserExample();
            DbBuserExample.Criteria criteria = example.createCriteria();
            criteria.andBuserEqualTo(busername);
            List<DbBuser> dbBusers = dbBuserMapper.selectByExample(example);
            if (dbBusers.size()>=0){
                return CarResult.build(500,"用户名已存在");
            }else {
                dbBuserMapper.insert(buser);
                return CarResult.ok();
            }

        }catch (Exception e){
            e.printStackTrace();
            return CarResult.build(500,"添加失败");
        }

    }
}
