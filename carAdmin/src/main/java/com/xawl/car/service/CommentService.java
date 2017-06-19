package com.xawl.car.service;

import java.util.List;

import com.xawl.car.pojo.DbComment;
import com.xawl.car.utils.CarResult;
import com.xawl.car.utils.PageResult;

public interface CommentService {

	PageResult getAll(Integer page);

	CarResult delete(Integer id);

}
