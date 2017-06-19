package com.xawl.car.service;

import javax.servlet.http.HttpServletRequest;

import com.xawl.car.pojo.DbNewCatalog;
import com.xawl.car.utils.CarResult;

public interface NewCatalogService {

	CarResult selectAll();

	CarResult addNewCatalog(DbNewCatalog dbNewCatalog);

	CarResult updateNewCatalog(DbNewCatalog dbNewCatalog);

	CarResult delete(Integer catid, HttpServletRequest request);

	CarResult selectBycid(Integer cid);

}
