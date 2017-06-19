package com.xawl.car.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.List;

import javax.servlet.ServletContext;

import com.xawl.car.mapper.DbImageMapper;
import com.xawl.car.pojo.DbImage;

public class MyFileUtils {

	public static void deleteFile(String path, String iamge) {
		String Name = iamge.substring(iamge.lastIndexOf("/"));
		MyFileUtils.deleteOneImage(Name, path);
	}

	public static void fileCopy(File fin, File fout) {
		FileInputStream fi = null;
		FileOutputStream fo = null;
		FileChannel in = null;
		FileChannel out = null;
		try {
			fi = new FileInputStream(fin);
			fo = new FileOutputStream(fout);
			in = fi.getChannel();
			out = fo.getChannel();
			in.transferTo(0, in.size(), out);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fi.close();
				in.close();
				fo.close();
				out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static boolean copyNewImage(String oldName, String newName,
			ServletContext sc) {

		String path = sc.getRealPath("img") + "/";
		File f = new File(path);
		if (!f.exists()) {
			f.mkdirs();
		}
		File fin = new File(path + oldName);
		if (fin.exists()) {
			File fout = new File(path + newName);
			MyFileUtils.fileCopy(fin, fout);
			return true;
		}
		return false;
	}

	public static void deleteImage(List<DbImage> listI, String path,
			DbImageMapper dbImageMapper) {
		for (DbImage dbImage : listI) {
			String Name = dbImage.getImage().substring(
					dbImage.getImage().lastIndexOf("/"));
			File fin = new File(path + Name);
			if (fin.exists()) {
				fin.delete();
			}
			dbImageMapper.deleteByPrimaryKey(dbImage.getIid());

		}
	}

	public static boolean deleteOneImage(String Name, String path) {
		File fin = new File(path + Name);
		if (fin.exists()) {
			fin.delete();
			return true;
		}
		return false;
	}

}
