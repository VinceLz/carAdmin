package com.xawl.car.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.xawl.car.pojo.DbGoods;
import com.xawl.car.pojo.DbGoodsExample;

public interface DbGoodsMapper {
    int countByExample(DbGoodsExample example);

    int deleteByExample(DbGoodsExample example);

    int deleteByPrimaryKey(Integer gid);

    int insert(DbGoods record);

    int insertSelective(DbGoods record);

    List<DbGoods> selectByExample(DbGoodsExample example);

    DbGoods selectByPrimaryKey(Integer gid);

    int updateByExampleSelective(@Param("record") DbGoods record, @Param("example") DbGoodsExample example);

    int updateByExample(@Param("record") DbGoods record, @Param("example") DbGoodsExample example);

    int updateByPrimaryKeySelective(DbGoods record);

    int updateByPrimaryKey(DbGoods record);

	DbGoods findByGid(Integer gid);

	int insertNewBidGoods(DbGoods dbGoods);

	List<DbGoods> getLikeGname(String gname);

	List<DbGoods> selectByBid(Integer bid);
}