package com.actitime.customertest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.actitime.genericLib.FileLib;
import com.actitime.genericLib.WebDriverCommonLib;
/**
 * 
 * @author nehag
 *Take data from excelfile and properties file create a customer using the methods avaliable in Base Class
 */
public class CustomerTest {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		/*create a object to GenericLib*/
	      FileLib flib=new FileLib();
	      WebDriverCommonLib wLib=new WebDriverCommonLib();
	      WebDriver driver=null;
	      
	      /*read data from properties File*/
	      String uRL=flib.getPropertyKeyValue("url");
	      String userName=flib.getPropertyKeyValue("username");
	      String passWord=flib.getPropertyKeyValue("password");
	      
	      String browSer=flib.getPropertyKeyValue("browser");
	      
	      /*read data from Excel Workbook*/
	      String customerName=flib.getExcelData("Sheet1",1,2);
	      
	      /*Login to appication*/
	      if(browSer.equals("firefox")) {
	    	driver=new FirefoxDriver(); 
	      }
	      if(browSer.equals("chrome")) {
	      	driver=new ChromeDriver(); 
	        }
	      /*if(browSer.equals("IE")) {
	      	driver=new InternetExplorerDriver(); 
	        }*/
	      wLib.waitForPageToLoad(driver);
	      driver.get("URL");
	}

}
