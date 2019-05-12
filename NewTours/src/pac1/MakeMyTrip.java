package pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class MakeMyTrip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\Web Driver\\geckodriver-v0.23.0\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.makemytrip.com");
		
		WebElement wb=driver.findElement(By.xpath("//span[text()='From']"));
		
		Actions act=new Actions(driver);
		act.moveToElement(wb).click();
		
		WebElement fwb=driver.findElement(By.xpath("//input[@placeholder='From']"));
		fwb.sendKeys("Delhi");
		Select sel=new Select(fwb);
		sel.selectByVisibleText("Delhi, India");
		
		WebElement twb=driver.findElement(By.xpath("//input[@placeholder='To']"));
		fwb.sendKeys("Banglore");
		Select sel1=new Select(fwb);
		sel1.selectByVisibleText("Bangalore, India");
		
		WebElement dwb=driver.findElement(By.xpath("//span[text()='DEPARTURE']"));
		dwb.click();
		Select sel2=new Select(fwb);
		sel2.deselectByVisibleText("26");
		
		
		
		
		
		
		
		

	}

}
