package com.xawl.car.mapper;

import com.xawl.car.pojo.DbCartitem;
import com.xawl.car.pojo.DbCartitemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DbCartitemMapper {
    int countByExample(DbCartitemExample example);

    int deleteByExample(DbCartitemExample example);

    int deleteByPrimaryKey(Integer cartitemId);

    int insert(DbCartitem record);

    int insertSelective(DbCartitem record);

    List<DbCartitem> selectByExample(DbCartitemExample example);

    DbCartitem selectByPrimaryKey(Integer cartitemId);

    int updateByExampleSelective(@Param("record") DbCartitem record, @Param("example") DbCartitemExample example);

    int updateByExample(@Param("record") DbCartitem record, @Param("example") DbCartitemExample example);

    int updateByPrimaryKeySelective(DbCartitem record);

    int updateByPrimaryKey(DbCartitem record);
}