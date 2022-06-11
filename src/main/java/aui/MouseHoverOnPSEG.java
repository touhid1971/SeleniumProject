package aui;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverOnPSEG {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://nj.myaccount.pseg.com/user/login");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement contactus = driver.findElementByXPath("//a[@class='dropdown-toggle no-border contact-us-link']");
		
		Actions action = new Actions(driver);
		action.moveToElement(contactus).perform();
		
		
		
	}

}
