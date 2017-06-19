package com.xawl.car.service.impl;

import com.xawl.car.mapper.DbRollGrantMapper;
import com.xawl.car.pojo.DbRollGrant;
import com.xawl.car.pojo.DbRollGrantExample;
import com.xawl.car.service.RollGrantService;
import com.xawl.car.utils.CarResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/4/4.
 */
@Service
public class RollGrantServiceImpl implements RollGrantService {

    @Autowired
    private DbRollGrantMapper dbRollGrantMapper;

    public CarResult updateRollGrant(DbRollGrant dbRollGrant) {
        try {
            dbRollGrantMapper.updateByPrimaryKeySelective(dbRollGrant);
            return CarResult.ok();
        } catch (Exception e) {
            e.printStackTrace();
            return CarResult.build(500, "失败");
        }

    }

    public CarResult getAllRollGrant() {
        DbRollGrantExample example = new DbRollGrantExample();
        List<DbRollGrant> dbRollGrants = dbRollGrantMapper.selectByExampleWithBLOBs(example);
        return CarResult.ok(dbRollGrants);
    }
}
