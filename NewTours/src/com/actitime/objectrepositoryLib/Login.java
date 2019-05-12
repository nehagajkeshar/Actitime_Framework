package com.actitime.objectrepositoryLib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.actitime.genericLib.FileLib;

 

public class Login extends FileLib{
	@FindBy(id="username")
	private WebElement usernameEdit;
	
	@FindBy(name="pwd")
	private WebElement passwordEdit;
	
	@FindBy(id="loginButton")
	private WebElement loginButton;
	
    public void loginToApp() throws Throwable {
    	//FileLib fLib=new FileLib();
    	usernameEdit.sendKeys(getPropertyKeyValue("username"));
    	passwordEdit.sendKeys(getPropertyKeyValue("password"));
    	loginButton.click();
    }
}
