package com.saphire.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class SetData 
{
	
	public static void toExcel(String filePath, String sheetName, int rowIndex, int colIndex, String data)
	{
		try
		{
			File f= new File(filePath);
			FileInputStream fis = new FileInputStream(f);
			Workbook wb = WorkbookFactory.create(fis);
			Sheet sheet1 = wb.getSheet(sheetName);
			Row r=sheet1.getRow(rowIndex);
			Cell c = r.createCell(colIndex);
			c.setCellValue(data);
			FileOutputStream fos = new FileOutputStream(f);
			wb.write(fos);
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		
	}

	//The following method is used to get data from config properties file 

	public static void setProperties(String filePath, String key, String value)
	{
		
		try
		{
			File f= new File(filePath);
			FileInputStream fis = new FileInputStream(f);
			Properties prop = new Properties();
			prop.load(fis);
			prop.setProperty(key, value);
			FileOutputStream fos = new FileOutputStream(f);
			prop.store(fos, null);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
