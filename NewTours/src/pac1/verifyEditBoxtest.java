package pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class verifyEditBoxtest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\Program Files\\Web Driver\\geckodriver-v0.23.0\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://gmail.com");
		
		WebElement wb=driver.findElement(By.id("identifierId"));
		
		Thread.sleep(4000);
		
	    Dimension dem=wb.getSize();
	    
	    System.out.println(dem.getHeight());
	    System.out.println(dem.getWidth());
	    
	    Thread.sleep(2000);
	    
	    Point p=wb.getLocation();
	    System.out.println(p.getX());
	    System.out.println(p.getY());
	    
	    Thread.sleep(2000);
	    
	    String backEndText=wb.getAttribute("aria-label");
	    System.out.println(backEndText);
	    
	    Thread.sleep(2000);
	    
	    driver.close();

	}

}
