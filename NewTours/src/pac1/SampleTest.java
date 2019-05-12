package pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;

public class SampleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.setProperty("webdriver.gecko.driver","C://Program Files//Web Driver//geckodriver-v0.23.0//geckodriver.exe");
       FirefoxDriver driver=new FirefoxDriver();
       driver.get("https://gmail.com");
		/*System.setProperty("webdriver.ie.driver","C://Program Files//Web Driver//IEDriverServer_3.14.0//IEDriverServer.exe");
		InternetExplorerDriver driver= new InternetExplorerDriver(); 
	    driver.get("https://gmail.com");*/
		/*System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Web Driver\\chromedriver_73.0.3683.68//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(); 
	    driver.get("https://gmail.com");*/
	    String currenturl=driver.getCurrentUrl();
	    System.out.println(currenturl);
	    
	    String title=driver.getTitle();
	    System.out.println(title);
	    
	    String sesssionId = driver.getWindowHandle();
	    System.out.println(sesssionId);
	    
	     String currentPageHTMLCODE=driver.getPageSource();
	     System.out.println(currentPageHTMLCODE);
	     
	     driver.close();
	     
	     //to perform hover
	     /*WebElement ele=driver.findElement(By.xpath("//span[@class='gb_ya gbii']"));
	     
	     Actions act=new Actions(driver);
	     
	     act.moveToElement(ele).perform();*/
	}

}
