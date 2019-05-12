package com.actitime.genericLib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/*
 * @author Neah
 * This class contain File related mtds , which is used to read the data from Excel & properties
 * */
public class FileLib {

	/**
	 * 
	 * @param key
	 * @return
	 * @throws Throwable
	 */
	public String getPropertyKeyValue(String key) throws Throwable {
	
		FileInputStream fis=new  FileInputStream("./data/commonData.properties");
		Properties pObj=new Properties();
		pObj.load(fis);
		String value=pObj.getProperty(key);
		return value;	
	}
	
	/**
	 * used to wait for entire page to load,before perform action on Element
	 * @param sheetName
	 * @param rowNum
	 * @param cellNum
	 * @return
	 * @throws Throwable
	 */
	public String getExcelData(String sheetName,int rowNum,int cellNum) throws Throwable {
		FileInputStream fis=new FileInputStream(".data/testData.xlsx");
	    Workbook wb	= WorkbookFactory.create(fis);
	    Sheet sh=wb.getSheet(sheetName);
	    Row row=sh.getRow(rowNum);
	    Cell cell=row.getCell(cellNum);
	    String value=cell.getStringCellValue();
	    wb.close();
	    return value;
	}
	/**
	 * 
	 * @param sheetName
	 * @param rowNum
	 * @param cellNum
	 * @param data
	 * @throws Throwable
	 */
	public void setExcelData(String sheetName,int rowNum,int cellNum,String data) throws Throwable {
		FileInputStream fis=new FileInputStream(".data/testData.xlsx");
	    Workbook wb	= WorkbookFactory.create(fis);
	    Sheet sh=wb.getSheet("Sheet1");   
	    Row row=sh.getRow(1);
	    Cell cell=row.getCell(2);
	    cell.setCellValue(data);
	    
	    FileOutputStream fos=new FileOutputStream(".data/testData.xlsx");
	    wb.write(fos);
	    wb.close();
	    
	}
	
}
