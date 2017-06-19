package com.xawl.car.utils;

import java.awt.Image;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.http.HttpServletRequest;

public class ImageUtils {
	/*
	 * 这是一个工具类，来ueditor中获取图片的地址保存到数据库中用的
	 */
	public static List<String> getImageSrc(String htmlCode) {
		if (htmlCode == null) {
			return null;
		}
		List<String> imageSrcList = new ArrayList<String>();
		Pattern p = Pattern
				.compile(
						"<img\\b[^>]*\\bsrc\\b\\s*=\\s*('|\")?([^'\"\n\r\f>]+(\\.jpg|\\.bmp|\\.eps|\\.gif|\\.mif|\\.miff|\\.png|\\.tif|\\.tiff|\\.svg|\\.wmf|\\.jpe|\\.jpeg|\\.dib|\\.ico|\\.tga|\\.cut|\\.pic)\\b)[^>]*>",
						Pattern.CASE_INSENSITIVE);
		Matcher m = p.matcher(htmlCode);
		String quote = null;
		String src = null;
		while (m.find()) {
			quote = m.group(1);
			src = (quote == null || quote.trim().length() == 0) ? m.group(2)
					.split("\\s+")[0] : m.group(2);
			imageSrcList.add(src);
		}
		return imageSrcList;
	}

	public static void deleteImages(final List<String> imags,
			HttpServletRequest request) {
		final String path = request.getRealPath("img") + "/";
		new Thread(new Runnable() {
			public void run() {
				// 删除多张图片
				for (String img : imags) {
					// 截取
					int indexOf = img.lastIndexOf("/");
					String substring = img.substring(indexOf);
					File fin = new File(path + substring);
					if (fin.exists()) {
						fin.delete();
					}
				}
			}
		}).start();
	}
}
