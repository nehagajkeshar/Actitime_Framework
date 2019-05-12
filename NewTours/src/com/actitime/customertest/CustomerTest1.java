package com.actitime.customertest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.genericLib.BaseClass;
import com.actitime.genericLib.WebDriverCommonLib;

@Listeners(com.actitime.genericLib.ListnerImpClass.class)
public class CustomerTest1 extends BaseClass {
	WebDriverCommonLib wdLib = new WebDriverCommonLib();

	@Test
	public void createCustomerTest(){
		//wdLib.waitForElementToLoad(driver,driver.findElement(By.xpath("//a[@class='content tasks']")));
		driver.findElement(By.xpath("//a[@class='content tasks']")).click();
		
		//driver.findElement(By.xpath("//div[text()='TASKS']")).click();
		driver.findElement(By.xpath("//div[@id='ext-comp-1018']/span[text()='Create Tasks']")).click();
		driver.findElement(By.id("ext-gen54")).click();
		driver.findElement(By.linkText("- New Customer -")).click();
		driver.findElement(By.id("createTasksPopup_newCustomer")).sendKeys("HDFC");
		driver.findElement(By.xpath("//div[@id='createTasksPopup_commitBtn']/div[@class='buttonIcon']/span[text()='Create Tasks']")).click();
		// div[@id='createTasksPopup_commitBtn']/div[@class='buttonIcon']/span[text()='Create
		// Tasks']
	}

	/*
	 * @Test(groups= {"regressionTest"}) public static void modifyCustomerTest() {
	 * System.out.println("modify customer"); }
	 * 
	 * @Test(groups= {"regressionTest"}) private void deleteCustomerTest() {
	 * System.out.println("delete customer"); }
	 */
}
