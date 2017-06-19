package com.xawl.car.service.impl;

import com.xawl.car.mapper.DbRollMapper;
import com.xawl.car.pojo.DbRoll;
import com.xawl.car.pojo.DbRollExample;
import com.xawl.car.service.RollService;
import com.xawl.car.utils.CarResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/4/4.
 */
@Service
public class RollServiceImpl implements RollService {

    @Autowired
    private DbRollMapper dbRollMapper;

    /**
     * 查所有的优惠卷
     *
     * @return
     */
    public CarResult getRollAll() {
//        DbRollExample example = new DbRollExample();
//        List<DbRoll> dbRolls = dbRollMapper.selectByExample(example);
    	List<DbRoll> dbRolls= dbRollMapper.getRollAll();
//        for (int i = 0; i < dbRolls.size(); i++) {
//            DbRoll dbRoll = dbRolls.get(i);
//            if (dbRoll.getType() == 1){
//                dbRoll.setTypestr("清洗使用");
//            }else if (dbRoll.getType() == 2){
//                dbRoll.setTypestr("保养使用");
//            }else if (dbRoll.getType() == 3){
//                dbRoll.setTypestr("装潢使用");
//            }else if (dbRoll.getType() == 0){
//                dbRoll.setTypestr("全场通用");
//            }
//        }
        return CarResult.ok(dbRolls);
    }

    public CarResult deleteRoll(Integer rid) {
        try {
            dbRollMapper.deleteByPrimaryKey(rid);
            return CarResult.ok();
        } catch (Exception e) {
            e.printStackTrace();
            return CarResult.build(500, "删除失败");
        }

    }

    public CarResult insertRoll(DbRoll dbRoll) {
        try {
            dbRollMapper.insert(dbRoll);
            return CarResult.ok();
        } catch (Exception e) {
            e.printStackTrace();
            return CarResult.build(500, "添加失败");
        }
    }

    public CarResult updateRoll(DbRoll dbRoll) {
        try {
            dbRollMapper.updateByPrimaryKeySelective(dbRoll);
            return CarResult.ok();
        } catch (Exception e) {
            e.printStackTrace();
            return CarResult.build(500, "添加失败");
        }
    }
}
