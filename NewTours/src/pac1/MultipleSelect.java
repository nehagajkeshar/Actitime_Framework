package pac1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.support.ui.Select;

public class MultipleSelect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\Web Driver\\geckodriver-v0.23.0\\geckodriver.exe");

		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("C:\\Users\\nehag\\Desktop\\Webpages\\multiselect.html");
		
		WebElement wb=driver.findElement(By.xpath("//select[@multiple='true']"));
		Select sel=new Select(wb);
		sel.selectByVisibleText("Java");

	}

}
