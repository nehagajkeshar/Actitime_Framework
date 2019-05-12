package pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DropDownTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\Web Driver\\geckodriver-v0.23.0\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.amazon.com/");
        
		WebElement wb=driver.findElement(By.xpath("//span[text()='Departments']"));
		Actions act=new Actions(driver);
		act.moveToElement(wb).perform();
		
	    driver.findElement(By.xpath("//span[text()='Departments']")).click();
	}

}
