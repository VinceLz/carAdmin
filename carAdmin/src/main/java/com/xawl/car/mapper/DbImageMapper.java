package com.xawl.car.mapper;

import com.xawl.car.pojo.DbImage;
import com.xawl.car.pojo.DbImageExample;

import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DbImageMapper {
    int countByExample(DbImageExample example);

    int deleteByExample(DbImageExample example);

    int deleteByPrimaryKey(Integer iid);

    int insert(DbImage record);

    int insertSelective(DbImage record);

    List<DbImage> selectByExample(DbImageExample example);

    DbImage selectByPrimaryKey(Integer iid);

    int updateByExampleSelective(@Param("record") DbImage record, @Param("example") DbImageExample example);

    int updateByExample(@Param("record") DbImage record, @Param("example") DbImageExample example);

    int updateByPrimaryKeySelective(DbImage record);

    int updateByPrimaryKey(DbImage record);

	List<DbImage> selectByGid(Integer gid);

	void insertNewDbImage(DbImage dbImage);

	List<DbImage> selectByMid(Integer mid);

	List<DbImage> selectByBid(Integer bid);

	List<DbImage> selectByMibd(Integer mbid);
}