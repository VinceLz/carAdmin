package com.xawl.car.mapper;

import com.xawl.car.pojo.DbSystem;
import com.xawl.car.pojo.DbSystemExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DbSystemMapper {
    int countByExample(DbSystemExample example);

    int deleteByExample(DbSystemExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DbSystem record);

    int insertSelective(DbSystem record);

    List<DbSystem> selectByExample(DbSystemExample example);

    DbSystem selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DbSystem record, @Param("example") DbSystemExample example);

    int updateByExample(@Param("record") DbSystem record, @Param("example") DbSystemExample example);

    int updateByPrimaryKeySelective(DbSystem record);

    int updateByPrimaryKey(DbSystem record);
}