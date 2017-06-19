package com.xawl.car.interceptor;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import com.xawl.car.controller.BackgroudErrContorller;
import com.xawl.car.pojo.DbBackgroudErr;
import com.xawl.car.utils.CarResult;
import com.xawl.car.utils.JsonUtils;

public class AllException implements HandlerExceptionResolver {

	@Autowired
	BackgroudErrContorller backgroudErrContorller;

	@ResponseBody
	public ModelAndView resolveException(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception ex) {
		String message = "\tat " + ex.getMessage() + "\r\n";
		String date = "";

		DbBackgroudErr dbBackgroudErr = new DbBackgroudErr();
		SimpleDateFormat dateFormater = new SimpleDateFormat(
				"yyyy-MM-dd HH:mm:ss");
		Date dateTime = new Date();
		StackTraceElement[] trace = ex.getStackTrace();
		for (StackTraceElement s : trace) {
			message += "\tat " + s + "\r\n";
		}

		date = dateFormater.format(dateTime);
		dbBackgroudErr.setDate(date);
		dbBackgroudErr.setMessage(message);
		backgroudErrContorller.insertMessage(dbBackgroudErr);

		CarResult carResult = new CarResult();

		carResult.setStatus(500);
		carResult.setData(date);
		String Josn = JsonUtils.objectToJson(carResult);

		try {
			response.getWriter().print(Josn);
		} catch (IOException e) {
			e.printStackTrace();
		}

		return null;
	}

}
