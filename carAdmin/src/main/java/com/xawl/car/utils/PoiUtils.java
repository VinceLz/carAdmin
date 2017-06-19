package com.xawl.car.utils;
import org.apache.poi.hssf.usermodel.HSSFDateUtil;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;


public class PoiUtils {

	public static LinkedHashMap<String,LinkedHashMap<String,String>> execl2Map(InputStream in){
		LinkedHashMap<String, LinkedHashMap<String, String>> map = new LinkedHashMap<String, LinkedHashMap<String, String>>();
		Workbook wb = null;
		try {
			wb = (Workbook) new HSSFWorkbook(in);
		} catch (IOException e) {
			e.printStackTrace();
		}

		Sheet sheet = wb.getSheetAt(0);

		Iterator<Row> rows = sheet.rowIterator();
		LinkedHashMap<String, String> map2 = null;
		String key = "";
		while (rows.hasNext()) {
			Row row = rows.next();
			if (row.getPhysicalNumberOfCells() == 3&&row.getCell(1).getStringCellValue().trim().isEmpty()||row.getCell(0).getStringCellValue().contains("$")) {

				if (map2 != null) {
					map.put(key, map2);	
					map2 = null;
					key = "";
				}
				key = row.getCell(0).getStringCellValue().trim().replace("$","");
				map2 = new LinkedHashMap<String, String>();
			} else {

				String keys = getValue(row.getCell(0));
				String value = getValue(row.getCell(1));
				map2.put(keys, value);
			}
		}
		if (map2 != null) {
			map.put(key, map2);
		}
		

		return map;
		
	}

    public static  String getValue(Cell cell) {  
        String value = "";  
        if(null==cell){  
            return value;  
        }  
        switch (cell.getCellType()) {

        case Cell.CELL_TYPE_NUMERIC:  
            if (HSSFDateUtil.isCellDateFormatted(cell)) {  

                Date date = HSSFDateUtil.getJavaDate(cell.getNumericCellValue());  
                SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  
                value = format.format(date);
            }else {
                double d=cell.getNumericCellValue();  
                value = Double.toString(d);

              
                if(null != value && !"".equals(value.trim())){  
                     String[] item = value.split("[.]");  
                     if(1<item.length&&"0".equals(item[1])){  
                         value=item[0];  
                     }  
                }  
            }  
            break;  

        case Cell.CELL_TYPE_STRING:  
            value = cell.getStringCellValue().toString();  
            break;  

        case Cell.CELL_TYPE_FORMULA:  

            value = String.valueOf(cell.getNumericCellValue());  
            if (value.equals("NaN")) {
                value = cell.getStringCellValue().toString();  
            }  
            break;  

        case Cell.CELL_TYPE_BOOLEAN:  
            value = " "+ cell.getBooleanCellValue();  
            break;

        case Cell.CELL_TYPE_BLANK:   
            value = "";  
           
            break;  

        case Cell.CELL_TYPE_ERROR:   
            value = "";  
          
            break;  
        default:  
            value = cell.getStringCellValue().toString();  
    }  
        if("null".endsWith(value.trim())){  
            value="";  
        }  
      return value;  
    }  
}
		
		
		
	