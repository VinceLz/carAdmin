package com.xawl.car.mapper;

import com.xawl.car.pojo.DbOrderitem;
import com.xawl.car.pojo.DbOrderitemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DbOrderitemMapper {
    int countByExample(DbOrderitemExample example);

    int deleteByExample(DbOrderitemExample example);

    int deleteByPrimaryKey(Integer orderitemId);

    int insert(DbOrderitem record);

    int insertSelective(DbOrderitem record);

    List<DbOrderitem> selectByExampleWithBLOBs(DbOrderitemExample example);

    List<DbOrderitem> selectByExample(DbOrderitemExample example);

    DbOrderitem selectByPrimaryKey(Integer orderitemId);

    int updateByExampleSelective(@Param("record") DbOrderitem record, @Param("example") DbOrderitemExample example);

    int updateByExampleWithBLOBs(@Param("record") DbOrderitem record, @Param("example") DbOrderitemExample example);

    int updateByExample(@Param("record") DbOrderitem record, @Param("example") DbOrderitemExample example);

    int updateByPrimaryKeySelective(DbOrderitem record);

    int updateByPrimaryKeyWithBLOBs(DbOrderitem record);

    int updateByPrimaryKey(DbOrderitem record);
}