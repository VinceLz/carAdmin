package com.xawl.car.mapper;

import com.xawl.car.pojo.DbRoll;
import com.xawl.car.pojo.DbRollExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DbRollMapper {
    int countByExample(DbRollExample example);

    int deleteByExample(DbRollExample example);

    int deleteByPrimaryKey(Integer rid);

    int insert(DbRoll record);

    int insertSelective(DbRoll record);

    List<DbRoll> selectByExample(DbRollExample example);

    DbRoll selectByPrimaryKey(Integer rid);

    int updateByExampleSelective(@Param("record") DbRoll record, @Param("example") DbRollExample example);

    int updateByExample(@Param("record") DbRoll record, @Param("example") DbRollExample example);

    int updateByPrimaryKeySelective(DbRoll record);

    int updateByPrimaryKey(DbRoll record);

	List<DbRoll> getRollAll();
}