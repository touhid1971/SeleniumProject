package aui;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class EnterAndTab {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElementById("email").sendKeys("touhid@gmail.com");
		
		Actions action = new Actions(driver);
		
		action.sendKeys(Keys.TAB).sendKeys("Touhid").build().perform();
		
		action.sendKeys(Keys.ENTER).perform();
		//action.sendKeys(Keys.TAB).perform();
		
		
		
		
		
		
		

	}

}
