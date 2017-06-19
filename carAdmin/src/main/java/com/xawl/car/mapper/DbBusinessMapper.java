package com.xawl.car.mapper;

import com.xawl.car.pojo.DbBusiness;
import com.xawl.car.pojo.DbBusinessExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DbBusinessMapper {
    int countByExample(DbBusinessExample example);

    int deleteByExample(DbBusinessExample example);

    int deleteByPrimaryKey(Integer bid);

    int insert(DbBusiness record);

    int insertSelective(DbBusiness record);

    List<DbBusiness> selectByExample(DbBusinessExample example);

    DbBusiness selectByPrimaryKey(Integer bid);

    int updateByExampleSelective(@Param("record") DbBusiness record, @Param("example") DbBusinessExample example);

    int updateByExample(@Param("record") DbBusiness record, @Param("example") DbBusinessExample example);

    int updateByPrimaryKeySelective(DbBusiness record);

    int updateByPrimaryKey(DbBusiness record);
}