package com.xawl.car.mapper;

import java.util.List;

import org.springframework.stereotype.Component;

import com.xawl.car.pojo.DbRollUser;
import com.xawl.car.pojo.DbRollUserVo;

@Component
public interface DbRollUserMapper {

	List<DbRollUserVo> selectByUid(Integer uid);

	void addaddRoll(DbRollUser dbRollUser);

}