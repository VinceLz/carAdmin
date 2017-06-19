package com.xawl.car.mapper;

import com.xawl.car.pojo.DbCategory;
import com.xawl.car.pojo.DbCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DbCategoryMapper {
    int countByExample(DbCategoryExample example);

    int deleteByExample(DbCategoryExample example);

    int deleteByPrimaryKey(String cid);

    int insert(DbCategory record);

    int insertSelective(DbCategory record);

    List<DbCategory> selectByExample(DbCategoryExample example);

    DbCategory selectByPrimaryKey(String cid);

    int updateByExampleSelective(@Param("record") DbCategory record, @Param("example") DbCategoryExample example);

    int updateByExample(@Param("record") DbCategory record, @Param("example") DbCategoryExample example);

    int updateByPrimaryKeySelective(DbCategory record);

    int updateByPrimaryKey(DbCategory record);
}