package com.xawl.car.mapper;

import com.xawl.car.pojo.DbErr;
import com.xawl.car.pojo.DbErrExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DbErrMapper {
    int countByExample(DbErrExample example);

    int deleteByExample(DbErrExample example);

    int insert(DbErr record);

    int insertSelective(DbErr record);

    List<DbErr> selectByExampleWithBLOBs(DbErrExample example);

    List<DbErr> selectByExample(DbErrExample example);

    int updateByExampleSelective(@Param("record") DbErr record, @Param("example") DbErrExample example);

    int updateByExampleWithBLOBs(@Param("record") DbErr record, @Param("example") DbErrExample example);

    int updateByExample(@Param("record") DbErr record, @Param("example") DbErrExample example);
}