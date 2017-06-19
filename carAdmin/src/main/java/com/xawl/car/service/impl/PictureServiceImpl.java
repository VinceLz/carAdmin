package com.xawl.car.service.impl;

import com.xawl.car.mapper.DbHomeMapper;
import com.xawl.car.mapper.DbImageMapper;
import com.xawl.car.mapper.DbModelMapper;
import com.xawl.car.pojo.DbHome;
import com.xawl.car.pojo.DbImage;
import com.xawl.car.pojo.DbModel;
import com.xawl.car.service.PictureService;
import com.xawl.car.utils.*;
import org.apache.http.util.TextUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by Administrator on 2016/12/17.
 */
@Service
public class PictureServiceImpl implements PictureService {

	/*
	 * FTP_ADDRESS=172.16.120.183 FTP_PORT=22 FTP_USERNAME=root
	 * FTP_PASSWORD=qq15929091519 FTP_BASE_PATH=/usr/local/nginx/html/images/
	 */
	@Value("${FTP_ADDRESS}")
	private String FTP_ADDRESS;
	@Value("${FTP_PORT}")
	private Integer FTP_PORT;
	@Value("${FTP_USERNAME}")
	private String FTP_USERNAME;
	@Value("${FTP_PASSWORD}")
	private String FTP_PASSWORD;
	@Value("${FTP_BASE_PATH}")
	private String FTP_BASE_PATH;
	@Value("${IMAGE_BASE_URL}")
	private String IMAGE_BASE_URL;
	private PictureResult pictureResult;

	@Autowired
	private DbImageMapper dbImageMapper;

	@Autowired
	private DbModelMapper dbModelMapper;

	@Autowired
	private DbHomeMapper dbHomeMapper;

	/**
	 * 轮播图
	 * 
	 * @param uploadFile
	 * @param id
	 * @param idName
	 * @param iid
	 * @return
	 */
	public Map uploadPicture(MultipartFile uploadFile, Integer id,
			String idName, Integer iid, HttpServletRequest request) {
		System.out.println(id + "_---" + idName + "_------" + iid
				+ "-----------");
		Map resultMap = new HashMap();
		// 增加
		try {
			// 重新生成一个新的文件名
			// 取原始文件名
			String oldName = uploadFile.getOriginalFilename();
			// 生成新的文件名
			// 使用id生成策略生成图片名称
			String newName = IDUtils.getImageName();
			newName = newName + oldName.substring(oldName.lastIndexOf("."));
			// 图片上传
			System.out.print("xuzi" + newName);

			ServletContext sc = request.getSession().getServletContext();
			String path = sc.getRealPath("img") + "/";
			File f = new File(path);
			if (!f.exists()) {
				f.mkdirs();
			}
			FileOutputStream fos = new FileOutputStream(path + newName);
			int b1 = 0;
			InputStream in = uploadFile.getInputStream();
			while ((b1 = in.read()) != -1) {
				fos.write(b1);
			}

			// String imagePath = new DateTime().toString("/yyyy/MM/dd");'

			DbImage dbImage = new DbImage();
			dbImage.setImage("/img/" + newName);
			if (iid > 0) {
				// 修改
				dbImage.setIid(iid);
				dbImageMapper.updateByPrimaryKeySelective(dbImage);
			} else {
				// 上传
				if (idName.equals("bid")) {
					dbImage.setBid(id);
				} else if (idName.trim().equals("gid")) {
					dbImage.setGid(id);
				} else if (idName.equals("mid")) {
					dbImage.setMid(id);
				} else if (idName.equals("mbid")) {
					dbImage.setMbid(id);
				}
				dbImageMapper.insert(dbImage);
			}
			fos.close();
			in.close();
			// 返回结果
			resultMap.put("error", 0); // 正常
			resultMap.put("url", "/img/" + newName);
			return resultMap;
		} catch (Exception e) {
			e.printStackTrace();
			resultMap.put("error", 1);// 错误
			resultMap.put("message", "exception");
			return resultMap;
		}
	}

	public Map uploadPicture(MultipartFile uploadFile,
			HttpServletRequest request) {
		Map resultMap = new HashMap();
		try {
			// 重新生成一个新的文件名
			// 取原始文件名
			String oldName = uploadFile.getOriginalFilename();
			// 生成新的文件名
			// 使用id生成策略生成图片名称
			String newName = IDUtils.getImageName();
			newName = newName + oldName.substring(oldName.lastIndexOf("."));
			// 图片上传
			System.out.print("xuzi" + newName);
			// String imagePath = new DateTime().toString("/yyyy/MM/dd");'
			ServletContext sc = request.getSession().getServletContext();
			String path = sc.getRealPath("img") + "/";
			File f = new File(path);
			if (!f.exists()) {
				f.mkdirs();
			}
			FileOutputStream fos = new FileOutputStream(path + newName);
			int b1 = 0;
			InputStream in = uploadFile.getInputStream();
			while ((b1 = in.read()) != -1) {
				fos.write(b1);
			}
			fos.close();
			in.close();
			resultMap.put("error", 0);
			resultMap.put("url", "/img/" + newName);
			// 返回结果
			return resultMap;
		} catch (Exception e) {
			e.printStackTrace();
			resultMap.put("error", 1);
			resultMap.put("message", "exception");
			return resultMap;
		}
	}

	public CarResult dropImage(String imageName) {
		try {
			SFTPTool sftpTool = new SFTPTool("172.16.120.1", 22, "root",
					"zhen1314");
			sftpTool.delete(FTP_BASE_PATH, imageName);
			return CarResult.ok();
		} catch (Exception e) {
			e.printStackTrace();
			return CarResult.build(500, "删除失败");
		}
	}

	public CarResult uploadExecl(MultipartFile execlFile, Integer mid) {
		try {

			LinkedHashMap<String, LinkedHashMap<String, String>> map = PoiUtils
					.execl2Map(execlFile.getInputStream());
			String s = JsonUtils.objectToJson(map);
			DbModel dbModel = new DbModel();
			dbModel.setMid(mid);
			dbModel.setConfigure(s);
			System.out.println(dbModel);

			dbModelMapper.updateConfig(dbModel);
			return CarResult.ok(s);
		} catch (Exception e) {
			e.printStackTrace();
			return CarResult.build(500, "错误");
		}
	}

	/**
	 * 修改图片
	 * 
	 * @param uploadFile
	 * @param imageName
	 * @return
	 */
	public Map updateUpload(MultipartFile uploadFile, String imageName,
			HttpServletRequest request) {
		Map resultMap = new HashMap();
		try {
			// SFTPTool sftpTool = new SFTPTool("172.16.120.1", 22, "root",
			// "zhen1314");
			// sftpTool.delete(FTP_BASE_PATH, imageName.split("/img/")[1]);
			// 重新生成一个新的文件名
			// 取原始文件名
			String oldName = uploadFile.getOriginalFilename();
			// 生成新的文件名
			// 使用id生成策略生成图片名称
			String newName = IDUtils.getImageName();
			newName = newName + oldName.substring(oldName.lastIndexOf("."));
			// 图片上传
			System.out.print("xuzi" + newName);

			ServletContext sc = request.getSession().getServletContext();
			String path = sc.getRealPath("img") + "/";
			File f = new File(path);
			if (!f.exists()) {
				f.mkdirs();
			}
			FileOutputStream fos = new FileOutputStream(path + newName);
			int b1 = 0;
			InputStream in = uploadFile.getInputStream();
			while ((b1 = in.read()) != -1) {
				fos.write(b1);
			}
			// String imagePath = new DateTime().toString("/yyyy/MM/dd");'
			resultMap.put("error", 0);
			resultMap.put("url", "/img/" + newName);
			// 返回结果
			fos.close();
			in.close();
			return resultMap;
		} catch (Exception e) {
			resultMap.put("error", 1);
			resultMap.put("message", "exception");
			return resultMap;
		}
	}

	/**
	 * 修改首页和搜索页面轮播图
	 * 
	 * @param uploadFile
	 * @param dbHome
	 * @param request
	 * @return
	 */
	public Map uploadHomeImage(MultipartFile uploadFile, DbHome dbHome,
			HttpServletRequest request) {
		Map resultMap = new HashMap();
		try {
			// 重新生成一个新的文件名
			// 取原始文件名
			String oldName = uploadFile.getOriginalFilename();
			// 生成新的文件名
			// 使用id生成策略生成图片名称
			String newName = IDUtils.getImageName();
			newName = newName + oldName.substring(oldName.lastIndexOf("."));
			// 图片上传
			System.out.print("xuzi" + newName);
			// String imagePath = new DateTime().toString("/yyyy/MM/dd");'
			ServletContext sc = request.getSession().getServletContext();
			String path = sc.getRealPath("img") + "/";
			File f = new File(path);
			if (!f.exists()) {
				f.mkdirs();
			}
			FileOutputStream fos = new FileOutputStream(path + newName);
			int b1 = 0;
			InputStream in = uploadFile.getInputStream();
			while ((b1 = in.read()) != -1) {
				fos.write(b1);
			}
			fos.close();
			in.close();
			dbHome.setImage("/img/" + newName);
			dbHomeMapper.updateByPrimaryKeySelective(dbHome);
			resultMap.put("error", 0);
			resultMap.put("url", "/img/" + newName);
			// 返回结果
			return resultMap;
		} catch (Exception e) {
			resultMap.put("error", 1);
			resultMap.put("message", "exception");
			return resultMap;
		}
	}

	/**
	 * 删除轮播图
	 * 
	 * @param iid
	 * @param request
	 * @return
	 */
	public CarResult deleteCarouselImage(Integer iid, HttpServletRequest request) {
		try {
			DbImage dbImage = dbImageMapper.selectByPrimaryKey(iid);
			String image = dbImage.getImage();
			if (!TextUtils.isEmpty(image)) {
				String[] split = image.split("/");
				ServletContext sc = request.getSession().getServletContext();
				String path = sc.getRealPath("img") + "/";
				path += split[split.length - 1];
				System.out.print("xuzi:++++++++++++" + path);
				IOUtils.deleteLocalFile(path);
			}
			dbImageMapper.deleteByPrimaryKey(iid);
			return CarResult.ok();
		} catch (Exception e) {
			e.printStackTrace();
			return CarResult.build(500, "失败");
		}

	}

}
