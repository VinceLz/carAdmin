package com.xawl.car.mapper;

import com.xawl.car.pojo.DbUser;
import com.xawl.car.pojo.DbUserExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface DbUserMapper {

	List<DbUser> selectAll();

	int deleteByUid(Integer uid);

	DbUser selectByUid(Integer uid);

	void startUserByUid(Integer uid);

	int stopUserByUid(Integer uid);

}