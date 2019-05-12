package com.actitime.genericLib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;


public class BaseClass {

	public static WebDriver driver=null;
	public FileLib fLib=new FileLib();
	public WebDriverCommonLib wait=new WebDriverCommonLib();
	@BeforeSuite
	public void configBeforeSuite() {
		System.out.println("connect to database");
	}

	/*
	 * @BeforeClass(groups= {"regressionTest"}) public void configBC() {
	 * System.out.println("launch the browser"); }
	 */

	 @Parameters("browser")
	 @BeforeTest
	 public void configBT(String browservalue) throws Throwable {
	 if(browservalue.equals("firefox")) {
		 driver=new FirefoxDriver();
		 System.out.println("firefox browser launched");
		 }
	 else if(browservalue.equals("chrome")) {
		 driver=new ChromeDriver();
		 wait.waitForPageToLoad(driver);
		 System.out.println("chrome browser launched");
		 }
	 }
	

	@BeforeMethod
	public void configBM() throws Throwable {
		String URL=fLib.getPropertyKeyValue("url");
		driver.get(URL);
		String userName=fLib.getPropertyKeyValue("username");
		driver.findElement(By.id("username")).sendKeys(userName);
		String password=fLib.getPropertyKeyValue("password");
		driver.findElement(By.name("pwd")).sendKeys(password);
		driver.findElement(By.id("loginButton")).click();
		System.out.println("Successful login");
	}

	@AfterMethod
	public void configAM() throws Throwable {
	  driver.findElement(By.id("logoutLink")).click();
	  System.out.println("Logout of application");
	}

	@AfterClass
	public void configAC() {
		driver.close();
		System.out.println("close the browser");
	}
	

}
