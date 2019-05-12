package pac1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GmailMailSending {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\Web Driver\\geckodriver-v0.23.0\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.gmail.com");
	      
	     driver.findElement(By.id("identifierId")).sendKeys("nehakumari14616@gmail.com");
	     
	     driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
	     
	     WebDriverWait wait=new WebDriverWait(driver,20);
	     wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Compose']")));
	     
	     driver.findElement(By.name("password")).sendKeys("tit@nium1@");
	     
	     driver.findElement(By.xpath("//span[text()='Next']")).click();
	     WebDriverWait wait1=new WebDriverWait(driver,20);
	     wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Compose']")));
	     
	     driver.findElement(By.xpath("//div[text()='Compose']")).click();
	     
	     driver.findElement(By.xpath("//textarea[@name='to']")).sendKeys("nehakumari14616@gmail.com");
		  
	     driver.findElement(By.xpath("//div[@id=':p7']")).click();
	     
	     
	}

}
