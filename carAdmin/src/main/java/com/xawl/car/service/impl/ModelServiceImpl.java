package com.xawl.car.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xawl.car.mapper.DbImageMapper;
import com.xawl.car.mapper.DbModelMapper;
import com.xawl.car.pojo.*;
import com.xawl.car.service.ModelService;
import com.xawl.car.utils.CarResult;
import com.xawl.car.utils.Const;
import com.xawl.car.utils.MyFileUtils;
import com.xawl.car.utils.PageResult;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by Administrator on 2016/12/15.
 */
@Service
public class ModelServiceImpl implements ModelService {
	@Autowired
	private DbModelMapper dbModelMapper;

	@Autowired
	private DbImageMapper dbImageMapper;

	public PageResult getModelsByGid(Integer gid, Integer page) {
		if (page == null || page < 1) {
			page = 1;
		}
		DbModelExample example = new DbModelExample();
		DbModelExample.Criteria criteria = example.createCriteria();
		criteria.andGidEqualTo(gid);
		PageHelper.startPage(page, Const.PAGE);
		List<DbModel> dbModels = dbModelMapper
				.selectByExampleWithBLOBs(example);
		List<DataVo> list1 = new ArrayList<DataVo>();
		for (DbModel dbModel : dbModels) {
			DbImageExample example1 = new DbImageExample();
			DbImageExample.Criteria criteria1 = example1.createCriteria();
			criteria1.andMidEqualTo(dbModel.getMid());
			List<DbImage> dbImages = dbImageMapper.selectByExample(example1);
			DataVo dataVo = new DataVo();
			if (dbImages.size() >= 0 || dbImages != null) {
				List<DataVo.ImageBean> images = new ArrayList();
				for (int i = 0; i < dbImages.size(); i++) {
					DataVo.ImageBean imageBean = new DataVo.ImageBean();
					imageBean.setIid(dbImages.get(i).getIid());
					imageBean.setImage(dbImages.get(i).getImage());
					images.add(imageBean);
				}
				dataVo.setbImage(images);
			} else {
				dataVo.setbImage(null);
			}
			dataVo.setData(dbModel);
			list1.add(dataVo);
		}
		PageResult result = new PageResult();
		result.setRows(list1);
		PageInfo<DbModel> pageInfo = new PageInfo<DbModel>(dbModels);
		result.setTotal(pageInfo.getTotal());
		return result;
	}

	public CarResult deleteModel(final Integer mid, HttpServletRequest request) {
		try {
			ServletContext sc = request.getSession().getServletContext();
			final String path = sc.getRealPath("img") + "/";

			List<DbImage> listMImage = dbImageMapper.selectByMid(mid);
			MyFileUtils.deleteImage(listMImage, path, dbImageMapper);
			DbModel dbModer = dbModelMapper.selectByPrimaryKey(mid);
			if (dbModer.getMshowimage() != null
					&& !dbModer.getMshowimage().isEmpty()) {
				String Name = dbModer.getMshowimage().substring(
						dbModer.getMshowimage().lastIndexOf("/"));
				MyFileUtils.deleteOneImage(Name, path);
			}
			dbModelMapper.deleteByPrimaryKey(mid);

			return CarResult.ok();
		} catch (Exception e) {
			e.printStackTrace();
			return CarResult.build(500, "删除失败");
		}
	}

	public CarResult insertModel(DbModel dbModel) {
		try {
			dbModelMapper.insert(dbModel);
			return CarResult.ok();
		} catch (Exception e) {
			e.printStackTrace();
			return CarResult.build(500, "失败");
		}
	}

	public CarResult updateModel(DbModel dbModel) {
		try {
			dbModelMapper.updateByPrimaryKeySelective(dbModel);
			return CarResult.ok();
		} catch (Exception e) {
			e.printStackTrace();
			return CarResult.build(500, "失败");
		}
	}

}
