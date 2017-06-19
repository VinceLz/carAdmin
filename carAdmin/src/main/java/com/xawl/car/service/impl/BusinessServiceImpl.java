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
import com.xawl.car.mapper.DbBusinessMapper;
import com.xawl.car.mapper.DbGoodsMapper;
import com.xawl.car.mapper.DbImageMapper;
import com.xawl.car.mapper.DbModelMapper;
import com.xawl.car.pojo.DataVo;
import com.xawl.car.pojo.DbBusiness;
import com.xawl.car.pojo.DbBusinessExample;
import com.xawl.car.pojo.DbGoods;
import com.xawl.car.pojo.DbGoodsExample;
import com.xawl.car.pojo.DbImage;
import com.xawl.car.pojo.DbImageExample;
import com.xawl.car.pojo.DbModel;
import com.xawl.car.pojo.DbModelExample;
import com.xawl.car.service.BusinessService;
import com.xawl.car.service.GoodsService;
import com.xawl.car.utils.CarResult;
import com.xawl.car.utils.Const;
import com.xawl.car.utils.MyFileUtils;
import com.xawl.car.utils.PageResult;

/**
 * Created by Administrator on 2016/12/15.
 */
@Service
public class BusinessServiceImpl implements BusinessService {

	@Autowired
	private GoodsService goodsService;

	@Autowired
	private DbBusinessMapper dbBusinessMapper;

	@Autowired
	private DbImageMapper dbImageMapper;
	@Autowired
	private DbGoodsMapper dbGoodsMapper;
	@Autowired
	private DbModelMapper dbModelMapper;

	public PageResult getAll(Integer page) {
		if (page == null || page < 1) {
			page = 1;
		}
		
		DbBusinessExample example = new DbBusinessExample();
		// 分页处理
		PageHelper.startPage(page, Const.PAGE);
		
		List<DbBusiness> list = dbBusinessMapper.selectByExample(example);
		List<DataVo> list1 = new ArrayList<DataVo>();
		for (DbBusiness dbBusiness : list) {
			DbImageExample example1 = new DbImageExample();
			DbImageExample.Criteria criteria = example1.createCriteria();
			criteria.andBidEqualTo(dbBusiness.getBid());
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
			dataVo.setData(dbBusiness);
			list1.add(dataVo);
		}
		PageResult result = new PageResult();
		result.setRows(list1);
		PageInfo<DbBusiness> pageInfo = new PageInfo<DbBusiness>(list);
		result.setTotal(pageInfo.getTotal());
		return result;
	}

	public CarResult insertBusiness(DbBusiness dbBusiness) {
		try {
			dbBusiness.setBdate(new Date());
			int insert = dbBusinessMapper.insert(dbBusiness);
			return CarResult.ok();
		} catch (Exception e) {
			e.printStackTrace();
			return CarResult.build(500, "增加失败");
		}
	}

	public CarResult updateBusiness(DbBusiness dbBusiness) {
		try {
			dbBusinessMapper.updateByPrimaryKeySelective(dbBusiness);
			return CarResult.ok();
		} catch (Exception e) {
			e.printStackTrace();
			return CarResult.build(500, "修改失败");
		}
	}

	public CarResult deleteBusiness(final Integer bid,
			HttpServletRequest request) {
		try {
			ServletContext sc = request.getSession().getServletContext();
			final String path = sc.getRealPath("img") + "/";
			
					List<DbImage> listBImage = dbImageMapper.selectByBid(bid);
					DbBusiness dbBusiness = dbBusinessMapper
							.selectByPrimaryKey(bid);
					MyFileUtils.deleteImage(listBImage, path, dbImageMapper);
					if (dbBusiness.getBshowimage() != null
							&& !dbBusiness.getBshowimage().isEmpty()) {
						String Name = dbBusiness.getBshowimage().substring(
								dbBusiness.getBshowimage().lastIndexOf("/"));
						MyFileUtils.deleteOneImage(Name, path);
					}
					List<DbGoods> list = dbGoodsMapper.selectByBid(bid);
					for (DbGoods dbGoods : list) {
						if (dbGoods.getGshowimage() != null
								&& !dbGoods.getGshowimage().isEmpty()) {
							String GName = dbGoods.getGshowimage().substring(
									dbGoods.getGshowimage().lastIndexOf("/"));
							MyFileUtils.deleteOneImage(GName, path);
						}
						List<DbImage> listGImgae = dbImageMapper
								.selectByGid(dbGoods.getGid());
						MyFileUtils
								.deleteImage(listGImgae, path, dbImageMapper);
						List<DbModel> listDbModer = dbModelMapper
								.selectByGid(dbGoods.getGid());
						for (DbModel dbModel : listDbModer) {
							if (dbModel.getMshowimage() != null
									&& !dbModel.getMshowimage().isEmpty()) {
								String MName = dbModel.getMshowimage()
										.substring(
												dbModel.getMshowimage()
														.lastIndexOf("/"));
								List<DbImage> listMImage = dbImageMapper
										.selectByMid(dbModel.getMid());
								MyFileUtils.deleteImage(listMImage, path,
										dbImageMapper);
								MyFileUtils.deleteOneImage(MName, path);
							}
							dbModelMapper.deleteByPrimaryKey(dbModel.getMid());
						}
						dbGoodsMapper.deleteByPrimaryKey(dbGoods.getGid());
					}
					dbBusinessMapper.deleteByPrimaryKey(bid);
				
		
			return CarResult.ok();
		} catch (Exception e) {
			e.printStackTrace();
			return CarResult.build(500, "删除失败");
		}
	}
}
