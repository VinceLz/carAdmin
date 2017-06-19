package com.xawl.car.mapper;

import com.xawl.car.pojo.DbAdmin;
import com.xawl.car.pojo.DbAdminExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DbAdminMapper {
    int countByExample(DbAdminExample example);

    int deleteByExample(DbAdminExample example);

    int deleteByPrimaryKey(Integer aid);

    int insert(DbAdmin record);

    int insertSelective(DbAdmin record);

    List<DbAdmin> selectByExample(DbAdminExample example);

    DbAdmin selectByPrimaryKey(Integer aid);

    int updateByExampleSelective(@Param("record") DbAdmin record, @Param("example") DbAdminExample example);

    int updateByExample(@Param("record") DbAdmin record, @Param("example") DbAdminExample example);

    int updateByPrimaryKeySelective(DbAdmin record);

    int updateByPrimaryKey(DbAdmin record);
}