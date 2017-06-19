package com.xawl.car.mapper;

import com.xawl.car.pojo.DbMaintainbusiness;
import com.xawl.car.pojo.DbMaintainbusinessExample;

import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface DbMaintainbusinessMapper {
    int countByExample(DbMaintainbusinessExample example);

    int deleteByExample(DbMaintainbusinessExample example);

    int deleteByPrimaryKey(Integer mbid);

    int insert(DbMaintainbusiness record);

    int insertSelective(DbMaintainbusiness record);

    List<DbMaintainbusiness> selectByExampleWithBLOBs(DbMaintainbusinessExample example);

    List<DbMaintainbusiness> selectByExample(DbMaintainbusinessExample example);

    DbMaintainbusiness selectByPrimaryKey(Integer mbid);

    int updateByExampleSelective(@Param("record") DbMaintainbusiness record, @Param("example") DbMaintainbusinessExample example);

    int updateByExampleWithBLOBs(@Param("record") DbMaintainbusiness record, @Param("example") DbMaintainbusinessExample example);

    int updateByExample(@Param("record") DbMaintainbusiness record, @Param("example") DbMaintainbusinessExample example);

    int updateByPrimaryKeySelective(DbMaintainbusiness record);

    int updateByPrimaryKeyWithBLOBs(DbMaintainbusiness record);

    int updateByPrimaryKey(DbMaintainbusiness record);

	void updateMPass(Map map);
}