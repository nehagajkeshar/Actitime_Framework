package pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;

public class FileDownloadPOPUP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirefoxProfile profile=new FirefoxProfile();
		profile.setPreference("browser.download.folderList",2);
		profile.setPreference("browser.helperApps.neverAsk.saveToDisk;","application/zip");
		profile.setPreference("browser.download.dir","C:\\Users\\nehag\\Desktop\\Webpages");
		
		DesiredCapabilities capabilities=DesiredCapabilities.firefox();
		capabilities.setCapability(FirefoxDriver.PROFILE, profile);
		
		System.setProperty("webdriver.gecko.driver","C:\\Program Files\\Web Driver\\geckodriver-v0.23.0\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver(capabilities);
		driver.get("https://maven.apache.org/download.cgi");
		driver.findElement(By.xpath("//a[text()='apache-maven-3.6.1-bin.zip']"));
	}

}
