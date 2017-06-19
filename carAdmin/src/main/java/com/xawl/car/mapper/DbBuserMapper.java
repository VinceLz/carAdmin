package com.xawl.car.mapper;

import com.xawl.car.pojo.DbBuser;
import com.xawl.car.pojo.DbBuserExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DbBuserMapper {
    int countByExample(DbBuserExample example);

    int deleteByExample(DbBuserExample example);

    int deleteByPrimaryKey(Integer buid);

    int insert(DbBuser record);

    int insertSelective(DbBuser record);

    List<DbBuser> selectByExample(DbBuserExample example);

    DbBuser selectByPrimaryKey(Integer buid);

    int updateByExampleSelective(@Param("record") DbBuser record, @Param("example") DbBuserExample example);

    int updateByExample(@Param("record") DbBuser record, @Param("example") DbBuserExample example);

    int updateByPrimaryKeySelective(DbBuser record);

    int updateByPrimaryKey(DbBuser record);
}