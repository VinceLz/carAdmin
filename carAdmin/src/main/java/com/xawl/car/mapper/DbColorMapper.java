package com.xawl.car.mapper;

import com.xawl.car.pojo.DbColor;
import com.xawl.car.pojo.DbColorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DbColorMapper {
    int countByExample(DbColorExample example);

    int deleteByExample(DbColorExample example);

    int deleteByPrimaryKey(Integer colorid);

    int insert(DbColor record);

    int insertSelective(DbColor record);

    List<DbColor> selectByExample(DbColorExample example);

    DbColor selectByPrimaryKey(Integer colorid);

    int updateByExampleSelective(@Param("record") DbColor record, @Param("example") DbColorExample example);

    int updateByExample(@Param("record") DbColor record, @Param("example") DbColorExample example);

    int updateByPrimaryKeySelective(DbColor record);

    int updateByPrimaryKey(DbColor record);
}