package com.actitime.genericLib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
/**
 * 
 * @author nehag
 *
 */
public class WebDriverCommonLib {
    /**
     * 
     * @param driver
     * This method is used to wait for page to load in the browser
     */
	public void waitForPageToLoad(WebDriver driver) throws Throwable{
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}
	/**
	 * 
	 * @param driver
	 * @param element
	 * This method is used to wait for element to get loaded into the browser
	 */
	public void waitForElementToLoad(WebDriver driver,WebElement element) {
      WebDriverWait	wait=new WebDriverWait(driver,20);
      wait.until(ExpectedConditions.visibilityOfElementLocated((By) element));  
	}
	/**
	 * 
	 * @param element
	 * @param text
	 * This method helps to select option from drop-down based on visible text
	 */
	public void selectByVisibleText(WebElement element,String text) { 
		Select sel=new Select(element);
		sel.selectByVisibleText(text);	
	}
	/**
	 * 
	 * @param element
	 * @param index
	 * This method helps to select options from drop-down based on index 
	 */
	public void selectByIndex(WebElement element,int index) { 
		Select sel=new Select(element);
		sel.selectByIndex(index);	
	}
	
	public void waitAndClick(WebElement element) {
		try {
			element.click();
		}
		catch(Throwable e){
			System.out.println("wait....");
		}
	}
}
