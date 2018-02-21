package com.tyss.universalLib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelGetNSetlib {
	
	static String path="/home/tyss/Desktop/MyDemoNewProject/MyMavenProject/Resource/extent-config.xml";
	
	public static String getData(String SheetName,int cellNumber,int rowNumber) throws Throwable{
		
		FileInputStream fis=new FileInputStream(path);
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet(SheetName);
		Row ro=sh.getRow(rowNumber);
		String Data=ro.getCell(cellNumber).getStringCellValue();
		
		return Data;
		
		
	}
	
	
	public static void setData(String SheetName,int rowNumber,int cellNumber,String data) throws Throwable{
		FileInputStream fis=new FileInputStream(path);
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet(SheetName);
		Row ro=sh.getRow(rowNumber);
		Cell cl=ro.createCell(cellNumber);
		cl.setCellValue(data);
		FileOutputStream fos=new FileOutputStream(path);
		wb.write(fos);
		
		
		
		
	}

}
