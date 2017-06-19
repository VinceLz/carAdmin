package com.xawl.car.mapper;

import com.xawl.car.pojo.DbRollGrant;
import com.xawl.car.pojo.DbRollGrantExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DbRollGrantMapper {
    int countByExample(DbRollGrantExample example);

    int deleteByExample(DbRollGrantExample example);

    int deleteByPrimaryKey(Integer rgid);

    int insert(DbRollGrant record);

    int insertSelective(DbRollGrant record);

    List<DbRollGrant> selectByExampleWithBLOBs(DbRollGrantExample example);

    List<DbRollGrant> selectByExample(DbRollGrantExample example);

    DbRollGrant selectByPrimaryKey(Integer rgid);

    int updateByExampleSelective(@Param("record") DbRollGrant record, @Param("example") DbRollGrantExample example);

    int updateByExampleWithBLOBs(@Param("record") DbRollGrant record, @Param("example") DbRollGrantExample example);

    int updateByExample(@Param("record") DbRollGrant record, @Param("example") DbRollGrantExample example);

    int updateByPrimaryKeySelective(DbRollGrant record);

    int updateByPrimaryKeyWithBLOBs(DbRollGrant record);

    int updateByPrimaryKey(DbRollGrant record);
}