package com.xawl.car.mapper;

import java.util.List;

import com.xawl.car.pojo.DbNewCatalog;

public interface DbNewCatalogMapper {

	List<DbNewCatalog> selectAll();

	int addNewCatalog(DbNewCatalog dbNewCatalog);

	int updateNewCatalog(DbNewCatalog dbNewCatalog);

	int delete(Integer catid);

	Object selectBycatid(Integer catid);
}
