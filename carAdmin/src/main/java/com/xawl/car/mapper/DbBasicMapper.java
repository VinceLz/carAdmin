package com.xawl.car.mapper;

import com.xawl.car.pojo.DbBasic;
import com.xawl.car.pojo.DbBasicExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DbBasicMapper {
    int countByExample(DbBasicExample example);

    int deleteByExample(DbBasicExample example);

    int deleteByPrimaryKey(Integer basicid);

    int insert(DbBasic record);

    int insertSelective(DbBasic record);

    List<DbBasic> selectByExample(DbBasicExample example);

    DbBasic selectByPrimaryKey(Integer basicid);

    int updateByExampleSelective(@Param("record") DbBasic record, @Param("example") DbBasicExample example);

    int updateByExample(@Param("record") DbBasic record, @Param("example") DbBasicExample example);

    int updateByPrimaryKeySelective(DbBasic record);

    int updateByPrimaryKey(DbBasic record);
}