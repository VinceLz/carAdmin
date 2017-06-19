package com.xawl.car.mapper;

import com.xawl.car.pojo.DbModel;
import com.xawl.car.pojo.DbModelExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DbModelMapper {
    int countByExample(DbModelExample example);

    int deleteByExample(DbModelExample example);

    int deleteByPrimaryKey(Integer mid);

    int insert(DbModel record);

    int insertSelective(DbModel record);

    List<DbModel> selectByExampleWithBLOBs(DbModelExample example);

    List<DbModel> selectByExample(DbModelExample example);

    DbModel selectByPrimaryKey(Integer mid);

    int updateByExampleSelective(@Param("record") DbModel record, @Param("example") DbModelExample example);

    int updateByExampleWithBLOBs(@Param("record") DbModel record, @Param("example") DbModelExample example);

    int updateByExample(@Param("record") DbModel record, @Param("example") DbModelExample example);

    int updateByPrimaryKeySelective(DbModel record);

    int updateByPrimaryKeyWithBLOBs(DbModel record);

    int updateByPrimaryKey(DbModel record);

    void updateConfig(DbModel model);

    List<DbModel> selectEn(Integer gid);
    
    List<DbModel> selectByGid(Integer gid);
    
	void insertNewDbModel(DbModel dbModel);

}