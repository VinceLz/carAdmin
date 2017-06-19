package com.xawl.car.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xawl.car.mapper.DbGoodsMapper;
import com.xawl.car.mapper.DbImageMapper;
import com.xawl.car.mapper.DbModelMapper;
import com.xawl.car.pojo.DataVo;
import com.xawl.car.pojo.DbGoods;
import com.xawl.car.pojo.DbGoodsExample;
import com.xawl.car.pojo.DbImage;
import com.xawl.car.pojo.DbImageExample;
import com.xawl.car.pojo.DbModel;
import com.xawl.car.service.GoodsService;
import com.xawl.car.utils.CarResult;
import com.xawl.car.utils.Const;
import com.xawl.car.utils.IDUtils;
import com.xawl.car.utils.MyFileUtils;
import com.xawl.car.utils.PageResult;

/**
 * Created by Administrator on 2016/12/15.
 */
@Service
public class GoodsServiceImpl implements GoodsService {

	@Autowired
	private DbGoodsMapper dbGoodsMapper;
	@Autowired
	private DbImageMapper dbImageMapper;
	@Autowired
	private DbModelMapper dbModelMapper;

	public PageResult getGoodsByBid(Integer bid, Integer page) {
		if (page == null || page < 1) {
			page = 1;
		}
		DbGoodsExample example = new DbGoodsExample();
		DbGoodsExample.Criteria criteria = example.createCriteria();
		criteria.andBidEqualTo(bid);
		PageHelper.startPage(page, Const.PAGE);
		List<DbGoods> list = dbGoodsMapper.selectByExample(example);
		List<DataVo> list1 = new ArrayList<DataVo>();
		for (DbGoods dbGoods : list) {

			DbImageExample example1 = new DbImageExample();
			DbImageExample.Criteria criteria1 = example1.createCriteria();
			criteria1.andGidEqualTo(dbGoods.getGid());
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
			dataVo.setData(dbGoods);
			list1.add(dataVo);
		}
		PageResult result = new PageResult();
		result.setRows(list1);
		PageInfo<DbGoods> pageInfo = new PageInfo<DbGoods>(list);
		result.setTotal(pageInfo.getTotal());
		return result;
	}

	public CarResult deleteGoods(final Integer gid, HttpServletRequest request) {
		try {
			ServletContext sc = request.getSession().getServletContext();
			final String path = sc.getRealPath("img") + "/";

			DbGoods dbGoods = dbGoodsMapper.selectByPrimaryKey(gid);
			if (dbGoods.getGshowimage() != null
					&& !dbGoods.getGshowimage().isEmpty()) {
				String Name = dbGoods.getGshowimage().substring(
						dbGoods.getGshowimage().lastIndexOf("/"));
				MyFileUtils.deleteOneImage(Name, path);
			}
			List<DbImage> listGImgae = dbImageMapper.selectByGid(dbGoods
					.getGid());
			MyFileUtils.deleteImage(listGImgae, path, dbImageMapper);
			List<DbModel> listDbModer = dbModelMapper.selectByGid(dbGoods
					.getGid());
			for (DbModel dbModel : listDbModer) {
				if (dbModel.getMshowimage() != null
						&& !dbModel.getMshowimage().isEmpty()) {
					String MName = dbModel.getMshowimage().substring(
							dbModel.getMshowimage().lastIndexOf("/"));
					List<DbImage> listMImage = dbImageMapper
							.selectByMid(dbModel.getMid());
					MyFileUtils.deleteImage(listMImage, path, dbImageMapper);
					MyFileUtils.deleteOneImage(MName, path);
					dbModelMapper.deleteByPrimaryKey(dbModel.getMid());
				}
				dbModelMapper.deleteByPrimaryKey(dbModel.getMid());
			}
			dbGoodsMapper.deleteByPrimaryKey(dbGoods.getGid());

			return CarResult.ok();
		} catch (Exception e) {
			e.printStackTrace();
			return CarResult.build(500, "删除失败");
		}
	}

	public CarResult deleteGoods(final Integer gid, final String path) {
		try {

			DbGoods dbGoods = dbGoodsMapper.selectByPrimaryKey(gid);
			if (dbGoods.getGshowimage() != null
					&& !dbGoods.getGshowimage().isEmpty()) {
				String Name = dbGoods.getGshowimage().substring(
						dbGoods.getGshowimage().lastIndexOf("/"));
				MyFileUtils.deleteOneImage(Name, path);
			}
			List<DbImage> listGImgae = dbImageMapper.selectByGid(dbGoods
					.getGid());
			MyFileUtils.deleteImage(listGImgae, path, dbImageMapper);
			List<DbModel> listDbModer = dbModelMapper.selectByGid(dbGoods
					.getGid());
			for (DbModel dbModel : listDbModer) {
				if (dbModel.getMshowimage() != null
						&& !dbModel.getMshowimage().isEmpty()) {
					String MName = dbModel.getMshowimage().substring(
							dbModel.getMshowimage().lastIndexOf("/"));
					List<DbImage> listMImage = dbImageMapper
							.selectByMid(dbModel.getMid());
					MyFileUtils.deleteImage(listMImage, path, dbImageMapper);
					MyFileUtils.deleteOneImage(MName, path);
					dbModelMapper.deleteByPrimaryKey(dbModel.getMid());
				}
				dbModelMapper.deleteByPrimaryKey(dbModel.getMid());
			}
			dbGoodsMapper.deleteByPrimaryKey(dbGoods.getGid());
			return CarResult.ok();
		} catch (Exception e) {
			e.printStackTrace();
			return CarResult.build(500, "删除失败");
		}
	}

	public CarResult insertGoods(DbGoods dbGoods) {
		try {
			dbGoods.setGdate(new Date());
			int i = dbGoodsMapper.insert(dbGoods);
			return CarResult.ok();
		} catch (Exception e) {
			e.printStackTrace();
			return CarResult.build(500, "错误");
		}
	}

	public CarResult updateGoods(DbGoods dbGoods) {
		try {
			dbGoodsMapper.updateByPrimaryKeySelective(dbGoods);
			return CarResult.ok();
		} catch (Exception e) {
			e.printStackTrace();
			return CarResult.build(500, "错误");
		}
	}

	public DbGoods findByGid(Integer gid) {

		return dbGoodsMapper.findByGid(gid);
	}

	public CarResult insertNewBidGoods(DbGoods dbGoods) {
		try {
			dbGoods.setGdate(new Date());
			int i = dbGoodsMapper.insertNewBidGoods(dbGoods);
			return CarResult.ok();
		} catch (Exception e) {
			e.printStackTrace();
			return CarResult.build(500, "错误");
		}

	}

	public List<DbGoods> getLikeGname(String gname) {

		return dbGoodsMapper.getLikeGname(gname);
	}

	public CarResult addNewBidGoods(final Integer gid, final Integer bid,
			final HttpServletRequest request) {
		// 获取绝对路径
		final ServletContext sc = request.getSession().getServletContext();
		DbGoods dbGoods = findByGid(gid);
		dbGoods.setBid(bid);
		try {
			if (dbGoods.getGshowimage() != null
					&& !dbGoods.getGshowimage().trim().isEmpty()) {
				String oldName = dbGoods.getGshowimage().substring(
						dbGoods.getGshowimage().lastIndexOf("/"));
				String newName = IDUtils.getImageName();
				//
				newName = newName + oldName.substring(oldName.lastIndexOf("."));
				if (MyFileUtils.copyNewImage(oldName, newName, sc)) {
					dbGoods.setGshowimage("/img/" + newName);
					insertNewBidGoods(dbGoods);
				} else {
					dbGoods.setGshowimage(null);
					insertNewBidGoods(dbGoods);
				}
				
			} else {
				dbGoods.setGshowimage(null);
				insertNewBidGoods(dbGoods);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		List<DbImage> listI = dbImageMapper.selectByGid(gid);
		for (DbImage DbImage : listI) {
			DbImage.setGid(dbGoods.getGid());
			try {
				if (DbImage.getImage() != null
						&& !DbImage.getImage().trim().isEmpty()) {
					String oldName = DbImage.getImage().substring(
							DbImage.getImage().lastIndexOf("/"));
					String newName = IDUtils.getImageName();
					newName = newName
							+ oldName.substring(oldName.lastIndexOf("."));
					if (MyFileUtils.copyNewImage(oldName, newName, sc)) {
						DbImage.setImage("/img/" + newName);
						dbImageMapper.insertNewDbImage(DbImage);
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		List<DbModel> listM = dbModelMapper.selectByGid(gid);
		
		for (DbModel dbModel : listM) {
			dbModel.setGid(dbGoods.getGid());
			try {
				if (dbModel.getMshowimage() != null
						&& !dbModel.getMshowimage().trim().isEmpty()) {
					String oldName = dbModel.getMshowimage().substring(
							dbModel.getMshowimage().lastIndexOf("/"));
					String newName = IDUtils.getImageName();
					newName = newName
							+ oldName.substring(oldName.lastIndexOf("."));
					if (MyFileUtils.copyNewImage(oldName, newName, sc)) {
						dbModel.setMshowimage("/img/" + newName);
						dbModelMapper.insertNewDbModel(dbModel);
					} else {
						dbModel.setMshowimage(null);
						dbModelMapper.insertNewDbModel(dbModel);
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			List<DbImage> listIb = dbImageMapper.selectByMid(dbModel.getMid());
			for (DbImage DbImage : listIb) {
				DbImage.setMid(dbModel.getMid());
				try {
					if (DbImage.getImage() != null
							&& !DbImage.getImage().trim().isEmpty()) {

						String oldName = DbImage.getImage().substring(
								DbImage.getImage().lastIndexOf("/"));
						String newName = IDUtils.getImageName();
						newName = newName
								+ oldName.substring(oldName.lastIndexOf("."));
						if (MyFileUtils.copyNewImage(oldName, newName, sc)) {
							DbImage.setImage("/img/" + newName);
							dbImageMapper.insertNewDbImage(DbImage);
						}
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}

		return CarResult.ok();
	}
}
