package com.xawl.car.controller;

import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.CellRangeAddress;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xawl.car.mapper.OptionLogMapper;
import com.xawl.car.pojo.DbYcOrder;
import com.xawl.car.pojo.OptionLog;
import com.xawl.car.service.YcOrderService;
import com.xawl.car.utils.AppUtils;
import com.xawl.car.utils.CarResult;
import com.xawl.car.utils.DateUtil;
import com.xawl.car.utils.PageResult;
import com.xawl.car.utils.PayConf;
import com.xawl.car.utils.PayUtil;

@Controller
@RequestMapping("/YcOreder")
public class YcOrderContorller {
	@Autowired
	YcOrderService ycOrderService;

	@Autowired
	OptionLogMapper logMapper;

	/**
	 * 导入全部数据
	 * 
	 * @param date
	 * @return
	 * @throws IOException
	 */
	@RequestMapping("/down")
	@ResponseBody
	public Object downOrder(HttpServletResponse response) throws IOException {
		List<DbYcOrder> list = ycOrderService.getAll();
		// 创建HSSFWorkbook对象(excel的文档对象)
		HSSFWorkbook wb = new HSSFWorkbook();
		// 建立新的sheet对象（excel的表单）
		HSSFSheet sheet = wb.createSheet("流水表");
		sheet.autoSizeColumn(1);
		sheet.autoSizeColumn(1, true);
		// 在sheet里创建第一行，参数为行索引(excel的行)，可以是0～65535之间的任何一个
		HSSFRow row1 = sheet.createRow(0);
		// 创建单元格（excel的单元格，参数为列索引，可以是0～255之间的任何一个
		HSSFCell cell = row1.createCell(0);
		// 设置单元格内容
		cell.setCellValue("订单信息");
		// 合并单元格CellRangeAddress构造参数依次表示起始行，截至行，起始列， 截至列
		sheet.addMergedRegion(new CellRangeAddress(0, 0, 0, 3));
		// 在sheet里创建第二行
		HSSFRow row2 = sheet.createRow(1);
		// 创建单元格并设置单元格内容
		sheet.setColumnWidth(0, 10 * 256);
		sheet.setColumnWidth(1, 10 * 256);
		sheet.setColumnWidth(2, 10 * 256);
		sheet.setColumnWidth(3, 30 * 256);
		sheet.setColumnWidth(4, 30 * 256);
		sheet.setColumnWidth(5, 20 * 256);
		sheet.setColumnWidth(6, 20 * 256);
		sheet.setColumnWidth(7, 20 * 256);
		sheet.setColumnWidth(8, 20 * 256);
		sheet.setColumnWidth(9, 10 * 256);
		sheet.setColumnWidth(10, 40 * 256);
		sheet.setColumnWidth(11, 40 * 256);
		row2.createCell(0).setCellValue("类型");
		row2.createCell(1).setCellValue("实付金额");
		row2.createCell(2).setCellValue("原价");
		row2.createCell(3).setCellValue("服务项");
		row2.createCell(4).setCellValue("商家");
		row2.createCell(5).setCellValue("商家电话");
		row2.createCell(6).setCellValue("用户");
		row2.createCell(7).setCellValue("用户电话");
		row2.createCell(8).setCellValue("创建日期");
		row2.createCell(9).setCellValue("状态");
		row2.createCell(10).setCellValue("商品号");
		row2.createCell(11).setCellValue("流水号");

		// for循环
		// 在sheet里创建第三行
		for (int j = 0; j < list.size(); j++) {
			HSSFRow row3 = sheet.createRow(2 + j);
			if (list.get(j).getType() == 0) {
				row3.createCell(0).setCellValue("在线订车");
				row3.createCell(4).setCellValue(list.get(j).getBname());
			} else {
				row3.createCell(0).setCellValue("在线养车");
				row3.createCell(4).setCellValue(list.get(j).getBmname());
			}
			row3.createCell(1).setCellValue(list.get(j).getPrice());
			row3.createCell(2).setCellValue(list.get(j).getRealprice());
			row3.createCell(3).setCellValue(list.get(j).getSname());
			row3.createCell(5).setCellValue(list.get(j).getBphone());
			row3.createCell(6).setCellValue(list.get(j).getUname());
			row3.createCell(7).setCellValue(list.get(j).getUphone());
			row3.createCell(8).setCellValue(list.get(j).getDate());
			row3.createCell(10).setCellValue(list.get(j).getGoodid());
			row3.createCell(11).setCellValue(list.get(j).getQid());
			switch (list.get(j).getStatus()) {
			case 2: // 完成
				row3.createCell(9).setCellValue("已完成");
				break;
			case 3: // 退款
				row3.createCell(9).setCellValue("退款完成");
				break;
			}
		}

		// 输出Excel文件
		OutputStream output = response.getOutputStream();
		response.reset();
		response.setHeader("Content-disposition",
				"attachment; filename=details.xls");
		response.setContentType("application/msexcel");
		wb.write(output);
		output.close();
		return null;
	}

	/**
	 * 
	 * @param yoid
	 * @param page
	 * @return
	 */
	@RequestMapping("/selectYcOreder.action")
	@ResponseBody
	public PageResult selectYcOreder(Integer status, Integer page, Integer type) {
		PageResult selectYcOreder = ycOrderService.selectYcOreder(status, page,
				type);
		return selectYcOreder;
	}

	/**
	 * 退款操作
	 * 
	 * @param page
	 * @param type
	 * @return
	 */

	// TODO 修改 接收的参数yoid
	@RequestMapping("/payBlack.action")
	@ResponseBody
	public CarResult payBlack(String yoid) {
		// 申请退款
		OptionLog op = new OptionLog();
		op.setContent("平台主动发起退款操作");
		op.setCreatedate(DateUtil.getSqlDate());
		op.setType(OptionLog.ORDER_KEEP_CAR);
		// Map<String, String> moneyBlack = PayUtil.moneyBlack(goodid, qid);
		ycOrderService.updateStatById(yoid);
		logMapper.insertLog(op);
		return new CarResult().ok();
	}
	/**
	 * 退款异步回调
	 * 
	 * @param goodid
	 * @param qid
	 * @return
	 */

	// @RequestMapping("/payBlackAsync.action")
	// @ResponseBody
	// public String payBlack2(HttpServletRequest req, HttpServletResponse resp)
	// {
	// // 收到异步回调，根据结果，修改数据
	// System.out.println("--------后端收到异步通知");
	// Map<String, String> respMap = PayUtil.AsyncMoneyBlack(req, resp);
	// // 签名验证
	// OptionLog op = new OptionLog();
	// op.setContent("收到银行异步回调");
	// op.setCreatedate(DateUtil.getSqlDate());
	// op.setType(OptionLog.ORDER_KEEP_CAR);
	// boolean validate = AppUtils.validate(respMap, PayConf.SIGNKEY,
	// respMap.get("charset"));
	// if (validate) {
	// // 签名验证通过
	// String goodid = respMap.get("orderNumber");
	// if (goodid == null) {
	// respMap.put("msg", "服务器回调异常---orderNumber为空 丢弃不处理");
	// op.setResult(respMap.toString());
	// logMapper.insertLog(op);
	// return null;
	// }
	// op.setGoodid(goodid);
	// List<DbYcOrder> byGoodid = ycOrderService.getOrder(goodid);
	// if (byGoodid == null || byGoodid.size() == 0) {
	// respMap.put("msg", "本地查询不到该订单");
	// op.setResult(respMap.toString());
	// logMapper.insertLog(op);
	// return null;
	// }
	// if (byGoodid.get(0).getStatus() == 3) {
	// // 已经校验成功 丢弃后面的消息
	// respMap.put("msg", "订单已经校验过,服务器重复回调,丢弃不处理");
	// op.setResult(respMap.toString());
	// logMapper.insertLog(op);
	// return null;
	// }
	// // 此处添加商户业务处理逻辑
	// if ("1".equals(respMap.get("state"))) {
	// // 订单退款成功
	// Map map = new HashMap();
	// map.put("status", 3);
	// map.put("goodid", goodid);
	// ycOrderService.updateStat(map);
	// // TODO 优惠劵作废
	// /*
	// * 不需要处理优惠劵了，因为只有支付成功后，优惠劵已经被修改为已使用，而且退款后优惠劵也作废，所以不需要处理
	// */
	// respMap.put("msg", "订单退款成功");
	// op.setResult(respMap.toString());
	// logMapper.insertLog(op);
	// return null;
	//
	// } else if ("2".equals(respMap.get("state"))) {
	// // 订单退款失败
	// respMap.put("msg", "订单退款失败");
	// op.setResult(respMap.toString());
	// logMapper.insertLog(op);
	// return null;
	// }
	// } else {
	// respMap.put("msg", "签名校验失败");
	// op.setResult(respMap.toString());
	// logMapper.insertLog(op);
	// return null;
	// }
	// return null;
	// }
}
