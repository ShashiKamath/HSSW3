package com.saphire.helper;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GetData 
{
	
	// The following method is used to get data from Excel 
public static String fromExcel(String filePath, String sheetName, int rowIndex, int colIndex)
{
	String data = null;
	try
	{
		File f= new File(filePath);
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet1 = wb.getSheet(sheetName);
		Row r=sheet1.getRow(rowIndex);
		Cell c = r.getCell(colIndex);
		data = c.toString();	
	}
	catch (Exception e) 
	{
		
	}
	return data;
}

//The following method is used to get data from config properties file 

public static String fromProperties(String filePath, String key)
{
	String data=null;
	try
	{
		File f= new File(filePath);
		FileInputStream fis = new FileInputStream(f);
		Properties prop = new Properties();
		prop.load(fis);
		data = prop.getProperty(key);
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	return data;
}

}
