package com.xawl.car.mapper;

import com.xawl.car.pojo.DbOrder;
import com.xawl.car.pojo.DbOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DbOrderMapper {
    int countByExample(DbOrderExample example);

    int deleteByExample(DbOrderExample example);

    int deleteByPrimaryKey(Integer oid);

    int insert(DbOrder record);

    int insertSelective(DbOrder record);

    List<DbOrder> selectByExample(DbOrderExample example);

    DbOrder selectByPrimaryKey(Integer oid);

    int updateByExampleSelective(@Param("record") DbOrder record, @Param("example") DbOrderExample example);

    int updateByExample(@Param("record") DbOrder record, @Param("example") DbOrderExample example);

    int updateByPrimaryKeySelective(DbOrder record);

    int updateByPrimaryKey(DbOrder record);
}