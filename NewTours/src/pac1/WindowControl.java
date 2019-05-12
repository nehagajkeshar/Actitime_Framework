package pac1;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowControl {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\Web Driver\\geckodriver-v0.23.0\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.amazon.com/");
		
		Dimension dem=driver.manage().window().getSize();
		System.out.println(dem.getHeight());
		System.out.println(dem.getWidth());
		
		Thread.sleep(5000);
		
		Dimension dim=new Dimension(400,200);
		
		driver.manage().window().setSize(dim);
		
		Thread.sleep(5000);
		
		Point p=new Point(400,0);
		driver.manage().window().setPosition(p);
		
		driver.manage().window().maximize();
		
        driver.close();	

	}

}
