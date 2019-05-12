package pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class AutomateGmailLogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
      System.setProperty("webdriver.gecko.driver","C:\\Program Files\\Web Driver\\Selenium\\geckodriver.exe");
      FirefoxDriver driver=new FirefoxDriver();
      driver.get("https://www.gmail.com");
      
     driver.findElement(By.id("identifierId")).sendKeys("nehakumari14616@gmail.com");
     
     driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
     
     driver.findElement(By.name("password")).sendKeys("tit@nium1@");
     
     driver.findElement(By.xpath("//span[text()='Next']")).click();
     
    
     
     
     
     
      //Creation of new account
      /*WebElement wb=driver.findElement(By.xpath("//a[text()='Create an account']"));
      wb.click();
      Thread.sleep(20000);
      
      WebElement wb1=driver.findElement(By.xpath("//input[@id='firstName']"));
      wb1.sendKeys("Neha");
      
      WebElement wb2=driver.findElement(By.xpath("//input[@id='lastName']"));
      wb2.sendKeys("Kumari");
      
      WebElement wb3=driver.findElement(By.xpath("//content[@class='CwaK9']"));
      wb3.click();*/
      
      driver.close();
      
      /* WebElement wb1=driver.findElementByClassName("LC20lb");
       wb1.click();*/
       
      
	}

}
