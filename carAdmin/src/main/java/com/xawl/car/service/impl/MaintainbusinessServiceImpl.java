package com.xawl.car.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.http.util.TextUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xawl.car.mapper.DbImageMapper;
import com.xawl.car.mapper.DbMaintainbusinessMapper;
import com.xawl.car.pojo.DataVo;
import com.xawl.car.pojo.DbImage;
import com.xawl.car.pojo.DbImageExample;
import com.xawl.car.pojo.DbMaintainbusiness;
import com.xawl.car.pojo.DbMaintainbusinessExample;
import com.xawl.car.service.MaintainbusinessService;
import com.xawl.car.utils.CarResult;
import com.xawl.car.utils.Const;
import com.xawl.car.utils.DesUtil;
import com.xawl.car.utils.MyFileUtils;
import com.xawl.car.utils.PageResult;
import com.xawl.car.utils.TokenUtil;

/**
 * Created by Administrator on 2017/3/22.
 */
@Service
public class MaintainbusinessServiceImpl implements MaintainbusinessService {

	@Autowired
	private DbMaintainbusinessMapper maintainbusinessMapper;
	@Autowired
	private DbImageMapper dbImageMapper;

	public PageResult getAll(Integer page) {
		if (page == null || page < 1) {
			page = 1;
		}
		DbMaintainbusinessExample example = new DbMaintainbusinessExample();
		DbMaintainbusinessExample.Criteria criteria = example.createCriteria();
		PageHelper.startPage(page, Const.PAGE);
		List<DbMaintainbusiness> dbMaintainbusinesses = maintainbusinessMapper
				.selectByExample(example);
		List<DataVo> list1 = new ArrayList<DataVo>();
		for (DbMaintainbusiness dbMaintainbusiness : dbMaintainbusinesses) {
			if (!TextUtils.isEmpty(dbMaintainbusiness.getMpassword())) {
				dbMaintainbusiness.setMpassword(DesUtil.decode(Const.DES,
						dbMaintainbusiness.getMpassword()));
			}
			DbImageExample example1 = new DbImageExample();
			DbImageExample.Criteria criteria1 = example1.createCriteria();
			criteria1.andMbidEqualTo(dbMaintainbusiness.getMbid());
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
			dataVo.setData(dbMaintainbusiness);
			list1.add(dataVo);
		}
		PageResult result = new PageResult();
		result.setRows(list1);
		PageInfo<DbMaintainbusiness> pageInfo = new PageInfo<DbMaintainbusiness>(
				dbMaintainbusinesses);
		result.setTotal(pageInfo.getTotal());
		return result;
	}

	public CarResult insertDbMaintainbusiness(
			DbMaintainbusiness dbMaintainbusiness) {
		try {
			dbMaintainbusiness.setBdate(new Date());
			if (!TextUtils.isEmpty(dbMaintainbusiness.getMpassword())) {
				dbMaintainbusiness.setMpassword(DesUtil.encode(Const.DES,
						dbMaintainbusiness.getMpassword()));
			}
			int insert = maintainbusinessMapper.insert(dbMaintainbusiness);
			return CarResult.ok();
		} catch (Exception e) {
			return CarResult.build(500, "插入失败");
		}

	}

	public CarResult deleteDbMaintainbusiness(Integer mbid,
			HttpServletRequest request) {
		try {
			String path = request.getSession().getServletContext()
					.getRealPath("img")
					+ "/";
			List<DbImage> list = dbImageMapper.selectByMibd(mbid);
			if (list != null && list.size() > 0) {
				MyFileUtils.deleteImage(list, path, dbImageMapper);
			}
			DbMaintainbusiness dbMaintainbusiness = maintainbusinessMapper
					.selectByPrimaryKey(mbid);

			if (dbMaintainbusiness.getBshowimage() != null
					&& !dbMaintainbusiness.getBshowimage().isEmpty()) {
				String Name = dbMaintainbusiness.getBshowimage().substring(
						dbMaintainbusiness.getBshowimage().lastIndexOf("/"));
				MyFileUtils.deleteOneImage(Name, path);
			}
			maintainbusinessMapper.deleteByPrimaryKey(mbid);
			return CarResult.ok();
		} catch (Exception e) {
			return CarResult.build(500, "删除失败");
		}
	}

	public CarResult updateDbMaintainbusiness(
			DbMaintainbusiness dbMaintainbusiness) {
		try {
			if (!TextUtils.isEmpty(dbMaintainbusiness.getMpassword())) {
				dbMaintainbusiness.setMpassword(DesUtil.encode(Const.DES,
						dbMaintainbusiness.getMpassword()));
			}
			maintainbusinessMapper
					.updateByPrimaryKeySelective(dbMaintainbusiness);
			return CarResult.ok();
		} catch (Exception e) {
			return CarResult.build(500, "修改失败");
		}
	}
	// public CarResult updateDbMaintainbusinessPassWord(Integer mbid) {
	// String sixPass = DesUtil.rundomPass();
	// String mpassword=TokenUtil.MD5(sixPass);
	// System.out.println(mpassword);
	// Map map=new HashMap();
	// map.put("mbid", mbid);
	// map.put("mpassword", mpassword);
	//
	// maintainbusinessMapper.updateMPass(map);
	// return new CarResult(sixPass);
	// }

}
