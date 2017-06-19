package com.xawl.car.mapper;

import com.xawl.car.pojo.DbHome;
import com.xawl.car.pojo.DbHomeExample;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface DbHomeMapper {
    int countByExample(DbHomeExample example);

    int deleteByExample(DbHomeExample example);

    int deleteByPrimaryKey(Integer hid);

    int insert(DbHome record);

    int insertSelective(DbHome record);

    List<DbHome> selectByExample(DbHomeExample example);
    
    
    
    //获取所有orders为1 type为0的DbHome 的list集合
    List<DbHome> selectAll(Map map);

    DbHome selectByPrimaryKey(Integer hid);

    int updateByExampleSelective(@Param("record") DbHome record, @Param("example") DbHomeExample example);

    int updateByExample(@Param("record") DbHome record, @Param("example") DbHomeExample example);

    int updateByPrimaryKeySelective(DbHome record);

    int updateByPrimaryKey(DbHome record);
}