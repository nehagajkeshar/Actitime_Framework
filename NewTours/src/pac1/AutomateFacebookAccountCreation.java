package pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class AutomateFacebookAccountCreation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\Web Driver\\geckodriver-v0.23.0\\geckodriver.exe");
      WebDriver driver =new FirefoxDriver();
      driver.get("https://www.facebook.com");
      driver.findElement(By.id("u_0_j")).sendKeys("Neha");
      driver.findElement(By.id("u_0_l")).sendKeys("Kumari");
      driver.findElement(By.id("u_0_o")).sendKeys("nehagafgjkk@gmail.com");
      driver.findElement(By.id("u_0_r")).sendKeys("nehagafgjkk@gmail.com");
      driver.findElement(By.id("u_0_v")).sendKeys("yardley");

      WebElement dwb=driver.findElement(By.id("day"));
      Select sel=new Select(dwb);
      sel.selectByVisibleText("15");
      
      WebElement wbm=driver.findElement(By.id("month"));
      Select sel1=new Select(wbm);
      sel1.selectByVisibleText("Jun");
      
      WebElement ywb=driver.findElement(By.id("year"));
      Select sel2=new Select(ywb);
      sel2.selectByVisibleText("1947");
      
      driver.findElement(By.id("u_0_9")).click();
      
      driver.findElement(By.id("u_0_11")).submit();
      
      //driver.close(); 
      
	}

}
