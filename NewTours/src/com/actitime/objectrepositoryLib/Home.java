package com.actitime.objectrepositoryLib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Home {

	@FindBy(xpath="//a[@class='content tt']/div[text()='TIME-TRACK']")
	private WebElement iimeTrackImg;
	
	@FindBy(xpath="//a[@class='content selected tasks']/div[text()='TASKS']")
	private WebElement tasksImg;
	
	@FindBy(xpath="//a[@class='content reports']/div[text()='REPORTS']")
	private WebElement reportImg;
	
	@FindBy(xpath="//a[@class='content users']")
	private WebElement usersImage;
	
	@FindBy(id="logoutLink")
	private WebElement logout;
	
	public void logout() {
		logout.click();
	}
	
	public void moveToTaskPage() {
		tasksImg.click();
	}
	
	public void moveToReportPage() {
		reportImg.click();
	}
	
	public void moveToUsersPage() {
		usersImage.click();
	}
}

