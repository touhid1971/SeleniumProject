package takeSnapShoot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeSnapShoot {
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumSoft\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		//get url:
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		//window maximize:
		driver.manage().window().maximize();
		
		//insert username:
		driver.findElementById("username").sendKeys("DemoSalesManager");
		
		File src = driver.getScreenshotAs(OutputType.FILE);
		
		File dest = new File("./src/snap/img.png");
		
		FileUtils.copyFile(src, dest);
		
		//insert password
		driver.findElementById("password").sendKeys("crmsfa");
		
		//click login button:
		driver.findElementByClassName("decorativeSubmit").click();
		
		File pic = driver.getScreenshotAs(OutputType.FILE);
		
		File tar = new File("./src/snap/touhid.png");
		
		FileUtils.copyFile(pic, tar);
				
		//click CRM/SFA:	
		driver.findElementByLinkText("CRM/SFA").click();
		
		driver.close();
		
		

	}

}
